
public class arrayOperations2 {

    public static int linearSearch(int[] arr,int index,int search){
        if (index==arr.length) return -1;
        else if(arr[index]==search) return index;
        return linearSearch(arr, index+1, search);
}

    public static int[][] transposeMatrix(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] transpose=new int[col][row];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                transpose[i][j]=matrix[j][i];
            }
        }
        return transpose;

    }
    public static void show(int[][] transpose){
        for(int[] i:transpose){
            for(int j:i){
                System.out.print(j+" ");
            }System.out.println();
        }
    }

    public static int[][] add(int[][] matrixA,int[][] matrixB){
        int[][] matrix=new int[matrixA.length][matrixA[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=matrixA[i][j]+matrixB[i][j];
            }System.out.println();
        }
        return matrix;
    }


    public static void main(String args[]){
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        System.out.print("Array after insertion: [");
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println("]");


        System.out.print("Element 3 found at index ");
        System.out.println(linearSearch(arr,0,3));

        int[][] matrixA={{1,2,3},{4,5,6}};
        int[][] matrixB={{7,8,9},{10,11,12}};
        int[][] transpose=transposeMatrix(matrixA);
        System.out.println("Transpose Matrix: ");
        show(transpose);


        System.out.println("MatrixA:");
        show(matrixA);
        System.out.println("MatrixB:");
        show(matrixB);

        System.out.println("Result Matrix (MatrixA + MatrixB)");
        show(add(matrixA,matrixB));

    }
}
