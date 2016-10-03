package com.epam.ga.matrixmaven;
import java.util.Arrays;
import com.epam.ga.matrixexceptions.IncompatibleSizeException;
import com.epam.ga.matrixexceptions.MatrixException;
import com.epam.ga.matrixexceptions.NullMatrixException;

import java.util.Random;

public class Matrix {
    private int[][] array;

    public  Matrix () {}

    public Matrix (int[][] array)
    {
        this.array=array;
    }

    public static Matrix multiply (Matrix m1, Matrix m2) throws IncompatibleSizeException
    {
        int i1=m1.getSize1();
        int j1 = m1.getSize2();
        int i2=m2.getSize1();
        int j2 = m2.getSize2();
        int[][] result=new int[i1][j2];

        if (m1==null || m2==null)
            return null;

        if (j1==i2)
        {
            for (int i=0; i<i1;i++)
                for (int j=0; j<j2;j++)
                    for (int k=0; k<i2;k++)
                        result[i][j]+=m1.array[i][k]*m2.array[k][j];
        }
        else
        {
            throw new IncompatibleSizeException();
        }

        return new Matrix(result);
    }

    public static void fillMatrix (int i, int j, Matrix m)
    {
        int[][] arr=new int[i][j];
        Random rand = new Random();

        for (int k=0;k<i;k++)
        {
            for (int l=0; l<j;l++)
                arr[k][l]= rand.nextInt(10)+1;
        }
        m.setArray(arr);
    }
    public static void printMatrix(Matrix m) throws NullMatrixException
    {
        if (m!=null) {
            for (int i = 0; i < m.getSize1(); i++) {
                for (int j = 0; j < m.getSize2(); j++)
                    System.out.print(m.array[i][j] + "\t");
                System.out.println();
            }
        }
        else
        {
            throw new NullMatrixException();
        }

    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int hash=1;

        hash=prime*hash+((array==null)?0:Arrays.hashCode(array));

        return hash;
    }
    @Override
    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Matrix other = (Matrix) obj;

        return this.array==other.array || (this.array != null && Arrays.equals(this.array,other.array));
    }

    @Override
    public String toString ()
    {
        return this.array.toString();
    }

     int getSize1()
     {
         return array.length;
     }

     int getSize2()
     {
         return array[0].length;
     }

     public void setArray(int[][] array)
     {
         this.array = array;
     }


}
