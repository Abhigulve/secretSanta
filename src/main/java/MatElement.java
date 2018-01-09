/**
 * This class is the data structure to store element with index
 * which help to sort the elements with index
 */
public class MatElement {
    private int row;
    private int col;
    private int element;
    private boolean isLock;
    private boolean isGrouped;

    public MatElement(int row, int col, int element, boolean isLock, boolean isGrouped) {
        this.row = row;
        this.col = col;
        this.element = element;
        this.isLock = isLock;
        this.isGrouped = isGrouped;
    }

    public boolean isGrouped() {

        return isGrouped;
    }

    public void setGrouped(boolean grouped) {
        isGrouped = grouped;
    }

    public boolean isLock() {

        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "MatElement{" +
                "row=" + row +
                ", col=" + col +
                ", element=" + element +
                ", isLock=" + isLock +
                ", isGrouped=" + isGrouped +
                '}';
    }
}