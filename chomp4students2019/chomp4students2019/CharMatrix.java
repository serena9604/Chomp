/*
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
    // Fields:
    char[][] m;  // this is the grid

    /*
     * Constructor: creates a grid with dimensions rows, cols,
     * and fills it with spaces
     */
    public CharMatrix(int rows, int cols) {
        m = new char[rows][cols];
        fillRect(0, 0, rows-1, cols-1, ' ');
    }

    /*
     * Constructor: creates a grid with dimensions rows , cols ,
     * and fills it with the fill  character
     */
    public CharMatrix(int rows, int cols, char fill) {
        m = new char[rows][cols];
        fillRect(0, 0, rows-1, cols-1, fill);
    }

    /*
     * Returns the number of rows in grid
     */
    public int numRows() {
        int r = 0;
        r = m.length;
        return r; //
    }

    /*
     * Returns the number of columns in grid
     */
    public int numCols() {
        int c = 0;
        c = m[0].length;
        return c; //
    }

    /*
     * Returns the character at the indexes [row, col]
     */
    public char charAt(int row, int col){
        char char1 = ' ';
        char1 = m[row][col];
        return char1;
    }

    /*
     * Sets the character at index [row, col] to ch
     */
    public void setCharAt(int row, int col, char ch) {
        m[row][col] = ch;
    }

    /*
     * Returns true if the character at row, col is a SPACE,
     * false otherwise
     */
    public boolean isEmpty(int row, int col) {
        if (m[row][col] == ' ') return true;
        return false;
    }

    /*
     * Fills the given rectangle with the fill characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        int r = row0;
        while (r <= row1) {
            int c = col0; 
            while (c <= col1) {
                m[r][c] = fill;
                c ++;
            }
            r ++;
        }
    }

    /*
     * Fills the given rectangle with the SPACE characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void clearRect(int row0, int col0, int row1, int col1) {
        for (int r = row0; r <= row1; r ++) {
            for (int c = col0; c <= col1; c ++) {
                m[r][c] = ' ';
            }
        }

    }

    /*
     * Returns the count of all non-SPACE characters in row.
     */
    public int countInRow(int row) {
        int c = 0;
        int count = 0;
        while (c < m[0].length) {
            if (m[row][c] != ' ') {
                count++;
            }
            c ++;
        }
        return count;
    }

    /*
     * Returns the count of all non-SPACE characters in col.
     */
    public int countInCol(int col) {
        int count = 0;
        for (int r = 0; r < m.length; r ++) {
            if (m[r][col] != ' ') {
                count ++;
            }
        }
        return count;
    }

    /*
     * Displays the contents of the matrix m
     */
    public void display () {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.print(m[r][c]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main (String[] args) {
        CharMatrix matrix = new CharMatrix(3, 4, 'm');

        int r = matrix.numRows();
        System.out.println("rows: " + r);

        int c = matrix.numCols();
        System.out.println("columns: " + c);

        matrix.fillRect(0, 0, 2, 3, 'h');

        matrix.clearRect(1, 1, 2, 2);

        int count2= matrix.countInRow(1);
        System.out.println("Count2: " + count2);

        int col2= matrix.countInCol(2);
        System.out.println("Col2: " + col2);

        //program in your test cases here. Invoke methods from the
        //object called matrix, like this:

        matrix.display();
    }

}

