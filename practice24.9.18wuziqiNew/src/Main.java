import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("五子棋");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(new GomokuPanel());
        frame.setVisible(true);
    }
}