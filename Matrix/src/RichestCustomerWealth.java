public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] myArray2D= {{40,2,3},
                {4,5,6},
                {7,8,9}};
        //excercise sum diagonal
        int sum=maximumWealth(myArray2D);
        System.out.println(sum);
    }
    public static int maximumWealth(int[][] accounts) {
        int sum;
        int MAX=0;
        for (int i=0; i<accounts.length;i++){

            sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];

            }
            if (sum>MAX){
                MAX=sum;
            }
        }
        return MAX;
    }
}
