class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val count = HashMap<Int, Int>()
        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }

        val arr = mutableListOf<Pair<Int, Int>>()
        for ((num, freq) in count) {
            arr.add(Pair(freq, num))
        }
        arr.sortByDescending { it.first }

        val res = IntArray(k)
        for (i in 0 until k) {
            res[i] = arr[i].second
        }
        return res

    }
}
