package com.epam.ga.matrixmaven;

public class Runner {
    public static void main(String[] args) {
        int[][] arr1= {{1,2,3},{1,2,2},{2,1,2}};
        int[][] arr2= {{1,2,3,1},{1,2,2,1},{2,1,2,1}};
        Matrix m1=new Matrix(arr1);
        Matrix m2=new Matrix(arr2);
        Matrix m3=new Matrix(Matrix.multiply(m1,m2));
        Matrix.printMatrix(m3);
    }
}
