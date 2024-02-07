class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var magEdit: String = magazine
        var i = 0
        var j = 0
        while(ransomNote.length > i){
            while(ransomNote.length > i && magEdit.length > j){
                if(ransomNote[i] == magEdit[j]){
                    magEdit = magEdit.replaceFirst(magEdit[j].toString(), "")
                    i++
                    j = 0
                }
                else{
                    j++
                }
            }
            if(ransomNote.length == i){
                return true
            }
            i++
        }
        return false
    }
}