import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Matrix of dimensions m x n.
 * @param <T> Contained type.
 */
public class Matrix<T> {

    private int m;
    private int n;
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
        this.data = new ArrayList<ArrayList<T>>();

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

    public Matrix<T> transpose() throws UnsupportedOperationException{

        if(this.n != this.m) throw new UnsupportedOperationException("CURRENTLY ONLY WORKS FOR SQUAREMATRICES");

        Matrix<T> temp = new Matrix<T>();
        temp.n = this.n;
        temp.m = this.m;
        temp.data = new ArrayList<ArrayList<T>>(this.data);

        for(ArrayList<T> row : this.data) {

            ListIterator<ArrayList<T>> tempIt = temp.data.listIterator();

            for(T element : row) {

                // TODO FIX THIS SHIT
                tempIt.next().add(element);
            }
        }

        return temp;
    }

    public Matrix<T> sort(int axis, boolean reverse, boolean inplace, String method) {

        return new Matrix<T>();

    }

    @Override
    public String toString() {

        String asString = "[";

        for(ArrayList<T> row : data) {

            asString += "[";
            boolean firstElement = true;

            for(T element : row) {

                if(!firstElement) asString += ",";
                asString += element.toString();
                firstElement = false;
            }

            asString += "]";
        }

        asString += "]";

        return asString;

    }
}