package com.epam.ga.matrixexceptions;

public class MatrixException extends Exception {
    public MatrixException()
    {}
    public MatrixException(String message, Throwable exception)
    {
        super (message,exception);
    }
    public MatrixException(String message)
    {
        super (message);
    }
    public MatrixException(Throwable exception)
    {
        super (exception);
    }

}
