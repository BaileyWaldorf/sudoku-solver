// Bailey Waldorf
// Sudoku Solver
// 1/19/18

import java.util.*;

public class sudoku {
    public static void main(String args[]) {

        // creating the scanner
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();

        // goes through all test cases
        for (int c = 0; c < numCases; c++) {
            int board[] = new int[81];

            // fills board with input
            for (int i = 0; i < 81; i++)
                board[i] = sc.nextInt();

            System.out.println("Test case " + (c + 1) + ":");
            System.out.println();

            // runs recursive function and prints solution properly
            if(insertNum(board,0) == 0) {
                System.out.print("No solution possible.");
                System.out.println();
            }
            else
                printBoard(board);

            System.out.println();
        }
    }

    private static int insertNum(int[] board, int cell) {
        // once all cells are filled, end function
        if(cell == 81)
            return 1;

        // don't mess with the fixed numbers
        if(board[cell] != 0)
            return insertNum(board, cell + 1);

        // try inputting numbers 1-9 into each cell
        for(int i = 1; i <= 9; i++) {
            board[cell] = i;

            // if that number works in the cell with each check, run recursion on next cell
            if(checkRow(board, cell) && checkColumn(board, cell) && checkBox(board, cell)) {
                int branch = insertNum(board, cell + 1);

                // you found the solution
                if(branch == 1) return 1;
            }

            // number does not work in that cell, try another
            board[cell] = 0;
        }
        return 0;
    }

    private static void printBoard(int[] board) {
        int i = 0;
        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                System.out.printf("%d ", board[i]);
                i++;
            }
            System.out.println();
        }
    }

    private static boolean checkRow(int[] board, int cell) {
        int startCell = (cell / 9) * 9;
        int endCell = startCell + 9;

        // loop through all cells in that row
        for(int i = startCell; i < endCell; i++) {

            // that number is already in that row!
            if(board[cell] == board[i] && i != cell)
                return false;
        }
        // number is not in row, it works!
        return true;
    }

    private static boolean checkColumn(int[] board, int cell) {
        int startCell = cell % 9;
        int endCell = startCell + 72;

        for(int i = startCell; i <= endCell; i += 9) {

            // that number is already in that row!
            if(i != cell && board[cell] == board[i])
                return false;
        }
        // number is not in row, it works!
        return true;
    }

    private static boolean checkBox(int[] board, int cell) {
        int row = cell / 9;
        int col = cell % 9;

        // automatically okay
        if(board[cell] == 0)
            return true;

        // i got this from guha hehe
        for(int i = 3*(row/3); i<3*(row/3) + 3; i++) {
            for(int j = 3*(col/3); j<3*(col/3)+3; j++) {

                // don't check the same cell we are inserting into
                if (9*i+j == cell) continue;

                // number is already in the box
                if (board[9*i+j] == board[cell]) return false;
            }
        }
        // it works
        return true;
    }
}

