class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        nums.sort()

        var mx = 1
        var t = 1

        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) {
                continue
            } else if (nums[i] == nums[i - 1] + 1) {
                t++
            } else {
                mx = maxOf(mx, t)
                t = 1
            }
        }

        return maxOf(mx, t)
    }
}