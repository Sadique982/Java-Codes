import java.io.*;

class MatrixMultiplication {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Take input for the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = Integer.parseInt(br.readLine());
        System.out.print("Enter the number of columns for the first matrix: ");
        int columns1 = Integer.parseInt(br.readLine());

        int[][] matrix1 = new int[rows1][columns1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = Integer.parseInt(br.readLine());
            }
        }

        // Take input for the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = Integer.parseInt(br.readLine());
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = Integer.parseInt(br.readLine());

        int[][] matrix2 = new int[rows2][columns2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = Integer.parseInt(br.readLine());
            }
        }

        // Check if the matrices can be multiplied
        if (columns1 != rows2) {
            System.out.println("The matrices cannot be multiplied.");
        } else {
            // Multiply the matrices
            int[][] result = new int[rows1][columns2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    for (int k = 0; k < columns1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            // Print the result
            System.out.println("The result is:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}