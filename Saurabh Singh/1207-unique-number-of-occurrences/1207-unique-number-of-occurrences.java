class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            if(!map.containsKey(num)){
                    map.put(num,1);}
                    else{
                        map.put(num,map.get(num)+1);
                    }
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();
       
    }
}