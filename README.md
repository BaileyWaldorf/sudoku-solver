# sudoku-solver
This program will solve a 9x9 Sudoku puzzle using recursion and backtracking.

Input:
Number of cases (n)
Followed by (n) 9x9 sudoku puzzles. Each puzzle containing 0's for the numbers not given, and numbers > 0 for fixes numbers.

E.g.
2

0 6 0 1 0 4 0 5 0
0 0 8 3 0 5 6 0 0
2 0 0 0 0 0 0 0 1
8 0 0 4 0 7 0 0 6
0 0 6 0 0 0 3 0 0
7 0 0 9 0 1 0 0 4
5 0 0 0 0 0 0 0 2
0 0 7 2 0 6 9 0 0
0 4 0 5 0 8 0 7 0

0 6 0 1 0 4 0 5 0
0 0 8 3 0 5 6 0 0
2 0 0 0 0 0 0 0 1
8 0 0 4 0 7 0 0 6
0 0 6 0 0 0 3 0 0
7 0 0 9 0 1 0 0 4
5 0 0 0 0 0 0 0 2
0 0 7 2 0 6 9 0 0
0 4 0 5 0 8 0 7 9

Output:
Test case (n):
Followed by solved versions of the board using backtracking and recursion to fill the 0's.
If there is no solution to the given board, it will print out no solution.

E.g.
Test case 1:

9 6 3 1 7 4 2 5 8 
1 7 8 3 2 5 6 4 9 
2 5 4 6 8 9 7 3 1 
8 2 1 4 3 7 5 9 6 
4 9 6 8 5 2 3 1 7 
7 3 5 9 6 1 8 2 4 
5 8 9 7 1 3 4 6 2 
3 1 7 2 4 6 9 8 5 
6 4 2 5 9 8 1 7 3 


Test case 2:

No solution possible.
