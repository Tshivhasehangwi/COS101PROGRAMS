#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

const int NUM_VALUES = 9; // Number of values in the Sudoku grid (i.e. 9x9)

// Generates a random Sudoku grid with a certain number of empty spaces
void generateSudoku(int grid[NUM_VALUES][NUM_VALUES], int numEmpty)
{
    // Initialize all values to 0 (empty)
    for (int i = 0; i < NUM_VALUES; i++)
        for (int j = 0; j < NUM_VALUES; j++)
            grid[i][j] = 0;

    // Generate a fully solved Sudoku grid
    for (int num = 1; num <= NUM_VALUES; num++)
    {
        // Try to place the number 'num' in a random empty cell
        for (int i = 0; i < NUM_VALUES; i++)
        {
            for (int j = 0; j < NUM_VALUES; j++)
            {
                if (grid[i][j] == 0)
                {
                    // Check if it is safe to place 'num' in this cell
                    bool safe = true;
                    for (int k = 0; k < NUM_VALUES; k++)
                    {
                        if (grid[i][k] == num || grid[k][j] == num)
                        {
                            safe = false;
                            break;
                        }
                    }

                    // Check 3x3 subgrid
                    int startRow = i - i % 3;
                    int startCol = j - j % 3;
                    for (int m = startRow; m < startRow + 3; m++)
                    {
                        for (int n = startCol; n < startCol + 3; n++)
                        {
                            if (grid[m][n] == num)
                            {
                                safe = false;
                                break;
                            }
                        }
                    }

                    if (safe)
                    {
                        // Place 'num' in this cell
                        grid[i][j] = num;
                        break;
                    }
                }
            }
        }
    }

    // Remove a certain number of values to create the puzzle
    while (numEmpty > 0)
    {
        int i = rand() % NUM_VALUES;
        int j = rand() % NUM_VALUES;
        if (grid[i][j] != 0)
        {
            grid[i][j] = 0;
            numEmpty--;
        }
    }
}

// Prints the Sudoku grid
void printSudoku(int grid[NUM_VALUES][NUM_VALUES])
{
    for (int i = 0; i < NUM_VALUES; i++)
    {
        for (int j = 0; j < NUM_VALUES; j++)
        {
            cout << grid[i][j] << " ";
            if ((j + 1) % 3 == 0)
                cout << " ";
        }
        cout << endl;
        if ((i + 1))
    }

}
