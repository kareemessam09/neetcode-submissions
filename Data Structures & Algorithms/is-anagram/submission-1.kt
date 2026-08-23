class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        
        var freq = IntArray(26)
        

        for(i in 0 until s.length){
            freq[s[i] - 'a']++
            freq[t[i] - 'a']--
        }


        for(i in 0 until 26){
            if(freq[i] != 0){
                return false
            }
        }


        return true

    }
}
