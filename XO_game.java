import java.util.Scanner;
public class XO_game {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameRunning = true;

        System.out.println("🎮 Welcome to Tic-Tac-Toe Game!");
        printBoard();

        while (gameRunning) {
            System.out.println("Player " + currentPlayer + ", enter your row (1-3) and column (1-3): ");
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid position! Try again.");
                continue;
            }

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                printBoard();

                if (checkWinner(currentPlayer)) {
                    System.out.println("🎉 Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    System.out.println("🤝 It's a draw!");
                    gameRunning = false;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("That spot is already taken! Try again.");
            }
        }

        sc.close();
    }

    // Print the current board
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Check if current player wins
    public static boolean checkWinner(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    // Check if board is full
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}