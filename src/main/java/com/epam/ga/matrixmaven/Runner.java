package com.epam.ga.matrixmaven;
import com.epam.ga.matrixexceptions.IncompatibleSizeException;
import com.epam.ga.matrixexceptions.MatrixException;
import com.epam.ga.matrixexceptions.NullMatrixException;

public class Runner {
    public static void main(String[] args) {
        Matrix m1=new Matrix();
        Matrix m2=new Matrix();
        Matrix m3 = new Matrix();
        Matrix.fillMatrix(3,2,m1);
        Matrix.fillMatrix(2,4,m2);
        try {
            m3 = Matrix.multiply(m1, m2);
            Matrix.printMatrix(m3);
        }
        catch (IncompatibleSizeException e)
        {
            System.out.print("Incompatible size of matrices. ");
        }
        catch (NullMatrixException e)
        {
            System.out.print("Matrix cannot be null.");
        }

    }
}
