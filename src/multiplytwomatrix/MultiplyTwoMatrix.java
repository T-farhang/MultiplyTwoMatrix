/*
                Tahereh Farhang , Barbod Accademy , 5th session , 14th excercise.
                            Multiply twe matrix
 */
package multiplytwomatrix;

import java.util.Scanner;

public class MultiplyTwoMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your row of first Matrix : ");
        int r1 = sc.nextInt();
        System.out.print("Please enter your column of first Matrix : ");
        int c1 = sc.nextInt();
        System.out.print("Please enter your row of second Matrix : ");
        int r2 = sc.nextInt();
        System.out.print("Please enter your column of second Matrix : ");
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Matrixes cannot multiplied!");
        } else {
            int[][] arr01 = new int[r1][c1];
            for (int i = 0; i < arr01.length; i++) {
                for (int j = 0; j < arr01[i].length; j++) {
                    System.out.print(String.format("Arr01 [%d][%d] : ", i, j));
                    arr01[i][j] = sc.nextInt();
                }
            }

            int[][] arr02 = new int[r2][c2];
            for (int i = 0; i < arr02.length; i++) {
                for (int j = 0; j < arr02[i].length; j++) {
                    System.out.print(String.format("Arr02 [%d][%d] : ", i, j));
                    arr02[i][j] = sc.nextInt();
                }
            }
            int[][] arrResult = new int[r1][c2];
            for (int i = 0; i < arrResult.length; i++) {
                System.out.println();
                for (int j = 0; j < arrResult[i].length; j++) {
                    for (int k = 0; k < arr02.length; k++) {
                        arrResult[i][j] += (arr01[i][k]) * (arr02[k][j]);
                    }
                    System.out.print(String.format("%d \t", arrResult[i][j]));
                }
            }
        }
    }
}
