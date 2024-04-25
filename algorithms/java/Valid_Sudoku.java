class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!validateColRow(board, board[i][j] - '0', j, true) || 
                        !validateColRow(board, board[i][j] - '0', i, false) ||
                        !validate3x3(board, ((i / 3) * 3), ((j / 3) * 3), board[i][j] - '0')) {
                            return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean validateColRow(char[][] board, int val, int index, boolean column) {
        boolean ignoredAppearance = false;
        if (column) {
            for (int i = 0; i < 9; i++) {
                if (board[i][index] - '0' == val) {
                    if (ignoredAppearance) {
                        return false;
                    } else {
                        ignoredAppearance = true;
                    }
                }
            }
        } else {
            for (int i = 0; i < 9; i++) {
                if (board[index][i] - '0' == val) {
                    if (ignoredAppearance) {
                        return false;
                    } else {
                        ignoredAppearance = true;
                    }
                }
            }
        }
        return true;
    }

    private boolean validate3x3(char[][] board, int minY, int minX, int val) {
        boolean ignoredAppearance = false;
        for (int i = minY; i < minY + 3; i++) {
            for (int j = minX; j < minX + 3; j++) {
                if (board[i][j] - '0' == val) {
                    if (ignoredAppearance) {
                        return false;
                    } else {
                        ignoredAppearance = true;
                    }
                }
            }
        }
        return true;
    }
}