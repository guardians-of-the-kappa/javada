import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixTest extends TestCase {

    public MatrixTest(String testName) {

        super(testName);

    }

    public static Test suite() {

        return new TestSuite(MatrixTest.class);

    }

    public void testToString() throws Exception {

        String matrix1AsString = "[[1,2,3],[1,2,3],[1,2,3]]";
        String matrix2AsString = "[[1,1,1],[2,2,2],[3,3,3]]";

        ArrayList<ArrayList<Integer>> data1 = new ArrayList<ArrayList<Integer>>();
        Integer[] arr1 = {1, 2, 3};
        data1.add(new ArrayList<Integer>(Arrays.asList(arr1)));
        data1.add(new ArrayList<Integer>(Arrays.asList(arr1)));
        data1.add(new ArrayList<Integer>(Arrays.asList(arr1)));

        ArrayList<ArrayList<Integer>> data2 = new ArrayList<ArrayList<Integer>>();
        Integer[] arr2 = {1, 1, 1};
        Integer[] arr3 = {2, 2, 2};
        Integer[] arr4 = {3, 3, 3};
        data2.add(new ArrayList<Integer>(Arrays.asList(arr2)));
        data2.add(new ArrayList<Integer>(Arrays.asList(arr3)));
        data2.add(new ArrayList<Integer>(Arrays.asList(arr4)));

        Matrix<Integer> matrix1 = new Matrix<Integer>(data1);
        Matrix<Integer> matrix2 = new Matrix<Integer>(data2);
        Matrix<Integer> matrix3 = new Matrix();
        Matrix<Integer> matrix4 = new Matrix(0, 0);

        assertEquals(matrix1AsString, matrix1.toString());
        assertEquals(matrix2AsString, matrix2.toString());
        assertEquals("[]", matrix3.toString());
        assertEquals("[]", matrix4.toString());

    }

    public void testTranspose() throws Exception {

        ArrayList<ArrayList<Integer>> data1 = new ArrayList<ArrayList<Integer>>();
        Integer[] arr1 = {1, 2, 3};
        data1.add(new ArrayList<Integer>(Arrays.asList(arr1)));
        data1.add(new ArrayList<Integer>(Arrays.asList(arr1)));
        data1.add(new ArrayList<Integer>(Arrays.asList(arr1)));

        ArrayList<ArrayList<Integer>> data2 = new ArrayList<ArrayList<Integer>>();
        Integer[] arr2 = {1, 1, 1};
        Integer[] arr3 = {2, 2, 2};
        Integer[] arr4 = {3, 3, 3};
        data2.add(new ArrayList<Integer>(Arrays.asList(arr2)));
        data2.add(new ArrayList<Integer>(Arrays.asList(arr3)));
        data2.add(new ArrayList<Integer>(Arrays.asList(arr4)));

        Matrix<Integer> matrix1 = new Matrix<Integer>(data1);
        Matrix<Integer> matrix2 = new Matrix<Integer>(data2);

        assertEquals(matrix1, matrix2.transpose());
        assertEquals(matrix2, matrix1.transpose());

    }
}
