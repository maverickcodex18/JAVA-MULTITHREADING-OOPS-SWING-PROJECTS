import java.util.Arrays;

public class arrayOperations {
    public static void main(String[] args) {
        System.out.println("Chitransh Agrawal\n22115026");
        // Initialize an array
        int[] arr = {1, 2, 3, 4, 5};

        // Element to insert
        int elementToInsert = 6;

        // Perform insertion
        arr = insertElement(arr, elementToInsert);

        // Display the modified array
        System.out.println("Array after insertion: " + Arrays.toString(arr));

        // Linear search element
        int searchElement = 3;
        int index = linearSearch(arr, searchElement, 0);

        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }

        // Define a matrix
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Calculate and display the transpose of the matrix
        int[][] transpose = transposeMatrix(matrix);
        System.out.println("Transpose Matrix:");
        displayMatrix(transpose);

        // Matrix operations
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8, 9}, {10, 11, 12}};

        // Display matrix A
        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        // Display matrix B
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Add two matrices
        int[][] resultMatrix = addMatrices(matrixA, matrixB);

        // Display the result matrix
        System.out.println("Result Matrix (Matrix A + Matrix B):");
        displayMatrix(resultMatrix);
    }

    // Function to insert an element into an array
    public static int[] insertElement(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = element;
        return newArr;
    }

    // Recursive function for linear search
    public static int linearSearch(int[] arr, int element, int index) {
        if (index >= arr.length) {
            return -1; // Element not found
        }
        if (arr[index] == element) {
            return index; // Element found at this index
        }
        return linearSearch(arr, element, index + 1); // Continue searching
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Function to calculate the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return resultMatrix;
    }
}
