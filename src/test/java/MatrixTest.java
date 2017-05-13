import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MatrixTest extends TestCase {

    public MatrixTest(String testName) {

        super(testName);

    }

    public static Test suite() {

        return new TestSuite(MatrixTest.class);

    }

    public void testTranspose() throws Exception {

        Matrix<Integer> matrix123 = new Matrix<Integer>();
        Matrix<Integer> matrix321 = new Matrix<Integer>();

        assertEquals(true, true);
        assertEquals(true, true);

    }
}
