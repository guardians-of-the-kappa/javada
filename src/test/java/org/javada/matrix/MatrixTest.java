package org.javada.matrix;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixTest {
    public Integer[] arr1 = {1, 2, 3};
    public Integer[] arr2 = {1, 1, 1};
    public Integer[] arr3 = {2, 2, 2};
    public Integer[] arr4 = {3, 3, 3};
    public ArrayList<ArrayList<Integer>> data1;
    public ArrayList<ArrayList<Integer>> data2;
    public Matrix<Integer> matrix1;
    public Matrix<Integer> matrix2;
    public Matrix<Integer> matrix3;
    public Matrix<Integer> matrix4;

    @Before
    public void setUp() {
        data1 = new ArrayList<ArrayList<Integer>>();
        data2 = new ArrayList<ArrayList<Integer>>();
        data1.add(new ArrayList<Integer>(Arrays.asList(arr1)));
        data1.add(new ArrayList<Integer>(Arrays.asList(arr1)));
        data1.add(new ArrayList<Integer>(Arrays.asList(arr1)));
        data2.add(new ArrayList<Integer>(Arrays.asList(arr2)));
        data2.add(new ArrayList<Integer>(Arrays.asList(arr3)));
        data2.add(new ArrayList<Integer>(Arrays.asList(arr4)));
        matrix1 = new Matrix<Integer>(data1);
        matrix2 = new Matrix<Integer>(data2);
        matrix3 = new Matrix();
        matrix4 = new Matrix(0, 0);
    }

    @Test
    public void testToString() {
        String matrix1AsString = "[[1,2,3],[1,2,3],[1,2,3]]";
        String matrix2AsString = "[[1,1,1],[2,2,2],[3,3,3]]";
        String expectedEmptyMatrixAsString = "[]";
        assertEquals(matrix1AsString, matrix1.toString());
        assertEquals(matrix2AsString, matrix2.toString());
        assertEquals(expectedEmptyMatrixAsString, matrix3.toString());
        assertEquals(expectedEmptyMatrixAsString, matrix4.toString());

    }
}
