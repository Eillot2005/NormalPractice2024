import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GomokuPanel extends JPanel {
    private static final int SIZE = 15;
    private static final int CELL_SIZE = 40;
    private static final int MARGIN = 20;
    private int[][] board = new int[SIZE][SIZE];
    private boolean blackTurn = true;

    public GomokuPanel() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = (e.getX() - MARGIN + CELL_SIZE / 2) / CELL_SIZE;
                int y = (e.getY() - MARGIN + CELL_SIZE / 2) / CELL_SIZE;
                if (x >= 0 && x < SIZE && y >= 0 && y < SIZE && board[x][y] == 0) {
                    board[x][y] = blackTurn ? 1 : 2;
                    blackTurn = !blackTurn;
                    repaint();
                    if (checkWin(x, y)) {
                        JOptionPane.showMessageDialog(null, (board[x][y] == 1 ? "黑棋" : "白棋") + "赢了！");
                        resetBoard();
                    }
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for (int i = 0; i < SIZE; i++) {
            g.drawLine(MARGIN, MARGIN + i * CELL_SIZE, MARGIN + (SIZE - 1) * CELL_SIZE, MARGIN + i * CELL_SIZE);
            g.drawLine(MARGIN + i * CELL_SIZE, MARGIN, MARGIN + i * CELL_SIZE, MARGIN + (SIZE - 1) * CELL_SIZE);
        }
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
        for (int i = 1; i < 5; i++) {
            int nx = x + i * dx, ny = y + i * dy;
            if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && board[nx][ny] == player) {
                count++;
            } else {
                break;
            }
        }
        for (int i = 1; i < 5; i++) {
            int nx = x - i * dx, ny = y - i * dy;
            if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && board[nx][ny] == player) {
                count++;
            } else {
                break;
            }
        }
        return count >= 5;
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
}