//1572. Matrix Diagonal Sum
//Easy
//Topics
//Companies
//Hint
//Given a square matrix mat, return the sum of the matrix diagonals.
//
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
//
//
//
//Example 1:
//
//
//Input: mat = [[1,2,3],
//              [4,5,6],
//              [7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.
//Example 2:
//
//Input: mat = [[1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1]]
//Output: 8
//Example 3:
//
//Input: mat = [[5]]
//Output: 5

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] myArray2D=
                {{5}};
        //excercise sum diagonal
        int sum=diagonalSum(myArray2D);
        System.out.println(sum);
    }

    public static int diagonalSum(int[][] mat) {
        int sumPrimaryDiagonal=0;
        int sumSecondaryDiagonal=0;
        int lengthDiagonal=0;
        for (int i=0; i<mat.length;i++){
            lengthDiagonal=mat[i].length-1;

            for(int j=0; j<mat[i].length-1;j++){
                sumPrimaryDiagonal=sumPrimaryDiagonal+mat[i][i];
                sumSecondaryDiagonal=sumSecondaryDiagonal+mat[i][lengthDiagonal-i];
                break;
            }
        }
        if (lengthDiagonal%2==1 ) {
            return (sumPrimaryDiagonal + sumSecondaryDiagonal);
        }
        if (lengthDiagonal==0){
            return mat[0][0];
        }
        else
        {
            return (sumPrimaryDiagonal + sumSecondaryDiagonal - mat[lengthDiagonal / 2][lengthDiagonal / 2]);
        }
    }
}
