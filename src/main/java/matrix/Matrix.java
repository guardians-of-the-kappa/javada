import java.util.ArrayList;

/**
 * Matrix.
 * @param <T> Contained type.
 */
public class Matrix<T> {

    private final int m;
    private final int n;
    private ArrayList<ArrayList<T>> data;

    /**
     * Default constructor.
     */
    public Matrix() {

        this.m = 0;
        this.n = 0;
        data = new ArrayList<ArrayList<T>>();

    }

    /**
     * Construct an empty m x n matrix.
     * @param m Amount of rows.
     * @param n Amount of columns.
     */
    public Matrix(int m, int n) {

        this.m = m;
        this.n = n;

    }

    /**
     * Construct a matrix from some data.
     * @param data The data to be used.
     */
    public Matrix(ArrayList<ArrayList<T>> data) {

        this.m = data.size();
        this.n = data.get(0).size();
        this.data = data;

    }

    public Matrix transpose() {

        return new Matrix();

    }

    public Matrix sort(int axis, boolean reverse, boolean inplace, String method) {

        return new Matrix();

    }

    @Override
    public String toString() {

        return "TODO";

    }
}