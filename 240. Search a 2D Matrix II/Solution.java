class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            //check - in for loop to break the loop if target is grater than the matrix[i][j]
            for (int j = 0; j < matrix[0].length && matrix[i][j]<=target; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
