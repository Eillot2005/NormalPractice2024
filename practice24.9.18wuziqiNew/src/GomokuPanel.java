import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GomokuPanel extends JPanel {
    private static final int SIZE = 15;
    private static final int CELL_SIZE = 40;
    private static final int MARGIN = 20;
    private int[][] board = new int[SIZE][SIZE];
    private boolean blackTurn = true;
    private Random random = new Random();

    public GomokuPanel() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = (e.getX() - MARGIN + CELL_SIZE / 2) / CELL_SIZE;
                int y = (e.getY() - MARGIN + CELL_SIZE / 2) / CELL_SIZE;
                if (x >= 0 && x < SIZE && y >= 0 && y < SIZE && board[x][y] == 0) {
                    board[x][y] = 1; // Player move
                    repaint();
                    if (checkWin(x, y)) {
                        JOptionPane.showMessageDialog(null, "黑棋赢了！");
                        resetBoard();
                        return;
                    }
                    makeAIMove(); // AI move
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        drawBoard(g);
        drawPieces(g);
    }

    private void drawBoard(Graphics g) {
        for (int i = 0; i < SIZE; i++) {
            g.drawLine(MARGIN, MARGIN + i * CELL_SIZE, MARGIN + (SIZE - 1) * CELL_SIZE, MARGIN + i * CELL_SIZE);
            g.drawLine(MARGIN + i * CELL_SIZE, MARGIN, MARGIN + i * CELL_SIZE, MARGIN + (SIZE - 1) * CELL_SIZE);
        }
    }

    private void drawPieces(Graphics g) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 1) {
                    g.setColor(Color.BLACK);
                    g.fillOval(MARGIN + i * CELL_SIZE - CELL_SIZE / 2, MARGIN + j * CELL_SIZE - CELL_SIZE / 2, CELL_SIZE, CELL_SIZE);
                } else if (board[i][j] == 2) {
                    g.setColor(Color.WHITE);
                    g.fillOval(MARGIN + i * CELL_SIZE - CELL_SIZE / 2, MARGIN + j * CELL_SIZE - CELL_SIZE / 2, CELL_SIZE, CELL_SIZE);
                }
            }
        }
    }

    private boolean checkWin(int x, int y) {
        int player = board[x][y];
        return checkDirection(x, y, 1, 0, player) || checkDirection(x, y, 0, 1, player) ||
                checkDirection(x, y, 1, 1, player) || checkDirection(x, y, 1, -1, player);
    }

    private boolean checkDirection(int x, int y, int dx, int dy, int player) {
        int count = 1;
        count += countInDirection(x, y, dx, dy, player);
        count += countInDirection(x, y, -dx, -dy, player);
        return count >= 5;
    }

    private int countInDirection(int x, int y, int dx, int dy, int player) {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            int nx = x + i * dx, ny = y + i * dy;
            if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && board[nx][ny] == player) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    private void resetBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
            }
        }
        blackTurn = true;
        repaint();
    }

    private void makeAIMove() {
        int x = -1, y = -1;
        // Try to win
        if ((x == -1) && (y == -1)) {
            x = findWinningMove(2);
            y = findWinningMove(2);
        }
        // Block player from winning
        if ((x == -1) && (y == -1)) {
            x = findWinningMove(1);
            y = findWinningMove(1);
        }
        // Block player from getting four in a row
        if ((x == -1) && (y == -1)) {
            x = findPotentialWin(1, 4);
            y = findPotentialWin(1, 4);
        }
        // Block player from getting three in a row with both ends empty
        if ((x == -1) && (y == -1)) {
            x = findPotentialWinWithEmptyEnds(1, 3);
            y = findPotentialWinWithEmptyEnds(1, 3);
        }
        // Place near player's last move
        if ((x == -1) && (y == -1)) {
            int[] move = findMoveNearPlayer();
            x = move[0];
            y = move[1];
        }
        // Random move
        if ((x == -1) && (y == -1)) {
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (board[x][y] != 0);
        }
        board[x][y] = 2; // AI move
        repaint();
        if (checkWin(x, y)) {
            JOptionPane.showMessageDialog(null, "白棋赢了！");
            resetBoard();
        }
    }

    private int findWinningMove(int player) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    board[i][j] = player;
                    if (checkWin(i, j)) {
                        board[i][j] = 0;
                        return i;
                    }
                    board[i][j] = 0;
                }
            }
        }
        return -1;
    }

    private int findPotentialWin(int player, int length) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    board[i][j] = player;
                    if (checkPotentialWin(i, j, length)) {
                        board[i][j] = 0;
                        return i;
                    }
                    board[i][j] = 0;
                }
            }
        }
        return -1;
    }

    private int findPotentialWinWithEmptyEnds(int player, int length) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    board[i][j] = player;
                    if (checkPotentialWinWithEmptyEnds(i, j, length)) {
                        board[i][j] = 0;
                        return i;
                    }
                    board[i][j] = 0;
                }
            }
        }
        return -1;
    }

    private int[] findMoveNearPlayer() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 1) {
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            int nx = i + dx, ny = j + dy;
                            if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && board[nx][ny] == 0) {
                                return new int[]{nx, ny};
                            }
                        }
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }

    private boolean checkPotentialWin(int x, int y, int length) {
        int player = 1; // Check for player
        return checkDirection(x, y, 1, 0, player) || checkDirection(x, y, 0, 1, player) ||
                checkDirection(x, y, 1, 1, player) || checkDirection(x, y, 1, -1, player);
    }

    private boolean checkPotentialWinWithEmptyEnds(int x, int y, int length) {
        int player = 1; // Check for player
        return checkDirectionWithEmptyEnds(x, y, 1, 0, player, length) || checkDirectionWithEmptyEnds(x, y, 0, 1, player, length) ||
                checkDirectionWithEmptyEnds(x, y, 1, 1, player, length) || checkDirectionWithEmptyEnds(x, y, 1, -1, player, length);
    }

    private boolean checkDirectionWithEmptyEnds(int x, int y, int dx, int dy, int player, int length) {
        int count = 1;
        boolean emptyStart = false, emptyEnd = false;
        for (int i = 1; i < length; i++) {
            int nx = x + i * dx, ny = y + i * dy;
            if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE) {
                if (board[nx][ny] == player) {
                    count++;
                } else if (board[nx][ny] == 0) {
                    emptyEnd = true;
                    break;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        for (int i = 1; i < length; i++) {
            int nx = x - i * dx, ny = y - i * dy;
            if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE) {
                if (board[nx][ny] == player) {
                    count++;
                } else if (board[nx][ny] == 0) {
                    emptyStart = true;
                    break;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return count >= length && emptyStart && emptyEnd;
    }
}