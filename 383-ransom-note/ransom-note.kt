class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if(ransomNote.length > magazine.length) return false
        val arr = IntArray(26)
        for(letra in magazine.indices){
            arr[magazine[letra].toInt() - 97]++
        }
        for(letra in ransomNote.indices){
            if(--arr[ransomNote[letra].toInt() - 97] < 0) return false
        }
        return true
    }
}