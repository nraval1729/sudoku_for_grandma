# sudoku_for_grandma
A browser based sudoku game for my grandma to enjoy!


Requirements and specifications (as they come to my mind; fully subject to change)

1) There should be a nice, intuitve display of a sudoku grid, with some pre-filled numbers. Let's call this starter puzzle.

2) There should be different levels to select from, and the puzzles should (hopefully!) roughly correspond to the category of difficulty they are in.

3) There should be a button to clear all currently filled cells. However, this should not clear the cells that are already a part of the starter puzzle.

4) There should be a "Check solution" button that would check the user's solution to see if it is a valid sudoku solution. However, this should only be "clickable" once the entire board is filled.

5) There should be mistake correction on the go. For example, if the user puts the number "1" in a row which already has "1" somewhere in it, they should be cautioned, and the cell should be emptied again. Likewise, if any sudoku rules are violated.

6) There should be an option to play a timed game. As a corollary, there should be a button to pause/unpause the timer.

7) Each cell, except the pre-filled ones in the starter puzzle should be modifiable. Also, the front-end should have input sanitization checks to make sure that the user only inputs digits here.