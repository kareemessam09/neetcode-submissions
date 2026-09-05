class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val map = HashMap<String, MutableList<String>>()

    for(word in strs){
        val sortedKey = word.toCharArray().sorted().joinToString("")

        map.getOrPut(sortedKey) { mutableListOf() }.add(word)

    }

    return ArrayList(map.values)


    }
}
