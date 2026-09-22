class Solution {
    public String removeDuplicates(String s) {
     StringBuilder result = new StringBuilder();



     
     
     for(int i = 0;i<s.length();i++){
            char current  = s.charAt(i);

            if(result.length() >0 && result.charAt(result.length()-1)==current){
                result.deleteCharAt(result.length()-1);
            }
            else{
                result.append(current);
            }
     }  
        return result.toString(); 
    }
}