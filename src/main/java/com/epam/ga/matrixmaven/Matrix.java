package com.epam.ga.matrixmaven;

 class Matrix {
    private int size1;
    private int size2;
    private int[][] array;

    Matrix()
    {}

    Matrix (int[][] array)
    {
        this.array=array;
        this.size1=array.length;
        this.size2=array[0].length;
    }

    static int[][] multiply(Matrix m1, Matrix m2)
    {
        int[][] result=new int[m1.size1][m2.size2];
        int sum=0;

        if (m1.size2==m2.size1)
        {
            for (int i=0; i<m1.size1;i++)
            {
                for (int j=0; j<m2.size2;j++)
                {
                    for (int k=0; k<m2.size1;k++)

                        sum+=m1.array[i][k]*m2.array[k][j];

                    result[i][j]=sum;
                    sum=0;
                }
            }
        }

        return result;
    }

    static void printMatrix(Matrix m)
    {
        for (int i=0; i<m.size1; i++)
        {
            for (int j=0; j<m.size2; j++)
                System.out.print(m.array[i][j]+"\t");
            System.out.println();
        }
    }
}
