package ApnaCollegeCourse.L19RecursionIII;

public class countmaze {
    static int countMaze(int row, int col, int maxRow, int maxCol) {
        if (row == maxRow - 1 || col == maxCol - 1) {
            return 1;
        } else {
            return countMaze(row + 1, col, maxRow, maxCol) + countMaze(row, col + 1, maxRow, maxCol);
        }
    }

    public static void main(String[] args) {
        System.out.println(countMaze(0, 0, 2, 2));
    }
}
