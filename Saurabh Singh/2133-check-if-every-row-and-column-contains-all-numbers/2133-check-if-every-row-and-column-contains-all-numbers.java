class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;


        //first for  row check 
        for(int i = 0;i<n;i++){
            HashSet <Integer> set = new HashSet<>();

                for(int j = 0;j<n;j++){
                    if(set.contains(matrix[i][j])){
                        return false;
                    }

                    set.add(matrix[i][j]);
        }

        }

        //for coloumn check
        for(int j = 0;j<n;j++){
             HashSet <Integer> set = new HashSet<>();
             for(int i = 0;i<n;i++){
                    if(set.contains(matrix[i][j])){
                        return false;
                    }

                    set.add(matrix[i][j]);
        }   
        }
        return true;  
    }
}