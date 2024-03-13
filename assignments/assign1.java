

public class assign1 {

    static long factorial(final int no){
        if (no==0 || no==1) return 1;
        long newNo=no*factorial(no-1);
        return newNo;
    }
    public static void main(String args[]){
    //calculating factorial of no
        System.out.println("Factorial of 20 : "+factorial(20));
    //calculating sin
        System.out.println("Sine of 37 rads : "+ Math.sin(37));
    //maximum element present in 3x3 matrix
        int matrix[][]=new int[3][3];
        //inserting elements
        for (int row=0,col=0;row<3;col++){
            if (col==3){
                col=-1;
                ++row;
            }
            else{
                matrix[row][col]=(row+1)*(col+1);
            }
        }
        //finding max element
        int maxElementrow=0;
        int maxElementCol=0;
        for (int row=0,col=0;row<3;col++){
            if (col==3){
                col=-1;
                ++row;
            }
            else{
                int currVal=matrix[row][col];
                if (currVal>matrix[maxElementrow][maxElementCol]){
                    maxElementrow=row;
                    maxElementCol=col;
                }
            }
        }


        System.out.println("Max Element Row: "+maxElementrow);
        System.out.println("Max Element Col: "+maxElementCol);
    }
}
