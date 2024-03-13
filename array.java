public class array {
    public static void main(String args[]){
        //declaration
        //type identifier[]
        //identifier=new typr[no of elements]
        int arrInt[]=new int[5];
        double arrDouble[]=new double[5];
        char arrChar[]=new char[5];
        String arrString[]=new String[5];

        //without use of new
        int arrInt2[]={1,2,3,4,5,6,7};

        //multidimentional array
        // 3*4 matrix
        int arr2d[][]=new int[3][4];

        //array with different column sizes
        int arr2dDiff[][]=new int[3][];
        arr2dDiff[0]=new int[1];
        arr2dDiff[1]=new int[2];
        arr2dDiff[2]=new int[3];

        System.out.println(arr2dDiff[1].length);    //length of column of row whose index=1


        for (int row = 0,col=0; row < arr2dDiff.length; col++) {
            if (col==arr2dDiff[row].length){
                col=-1;
                ++row;
                continue;
            }
            arr2dDiff[row][col]=col;
        }

        for (int[] i : arr2dDiff) {
            for (int j : i) {
                System.out.print(j+" ");

            }System.out.println();
        }



        //alternative decl of 2D ARR
        int[][] arr2dDiff2={{1,2},{3,4,5,6,7}};


        //var
        //data type (Initializer Required)
        var one="abcd";
        //identifier
        int var=9;
        //arrays (do not initialize immedietely)
        var arr=new int[3][9];





    }
}
