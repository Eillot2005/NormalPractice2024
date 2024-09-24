import java.awt.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

public class Main {
    static String[] allstudents = new String[]{"刘逸潇", "孟轶涵", "董秋娟", "何杜娟", "彭文杰", "袁明琪", "王晟", "粟祖杭", "鄢郅恒", "蒋东林", "何天顺", "易晓蕾", "尹依婷", "朱法成", "吴章熙", "刘斌", "吴佳灿", "肖锟", "赵佳", "李嘉维", "李方斐", "邓家和", "李香", "罗振宇", "吴嘉昱", "王蓉", "陈伟", "熊俊豪", "詹睿", "黄泽浩"};
    static String[] boys = new String[]{"刘逸潇", "孟轶涵", "彭文杰", "袁明琪", "王晟", "粟祖杭", "鄢郅恒", "蒋东林", "何天顺", "朱法成", "刘斌", "肖锟", "李嘉维", "李方斐", "邓家和", "罗振宇", "吴嘉昱", "陈伟", "熊俊豪", "黄泽浩"};
    static String[] girls = new String[]{"董秋娟", "何杜娟", "易晓蕾", "尹依婷", "吴章熙", "吴佳灿", "赵佳", "李香", "王蓉", "詹睿"};

    public static void main(String[] args) {
        JFrame frame = new JFrame("抽人系统");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(3, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton fixed = new JButton("随机抽人");
        fixed.setFont(new Font("微软雅黑", Font.CENTER_BASELINE, 15));
        fixed.setBackground(Color.ORANGE);
        JButton onlyBoy = new JButton("只抽男生");
        onlyBoy.setFont(new Font("微软雅黑", Font.CENTER_BASELINE, 15));
        onlyBoy.setBackground(Color.CYAN);
        JButton onlyGirl = new JButton("只抽女生");
        onlyGirl.setFont(new Font("微软雅黑", Font.CENTER_BASELINE, 15));
        onlyGirl.setBackground(Color.PINK);
        JMenu menu = new JMenu("选择");
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        JMenuItem item1 = new JMenuItem("退出");
        JMenuItem item2 = new JMenuItem("怎么使用?");
        menu.add(item2);
        menu.add(item1);
        frame.setJMenuBar(menuBar);
        frame.add(fixed);
        frame.add(onlyBoy);
        frame.add(onlyGirl);
        frame.setLocation(500, 200);
        item1.addActionListener(e -> System.exit(0));
        item2.addActionListener(e -> JOptionPane.showMessageDialog(null, "1.点击按钮选择抽取方式\n2.输入抽取人数\n3.点击确定", "使用说明", JOptionPane.INFORMATION_MESSAGE));
        fixed.addActionListener(e -> getRandStudent(allstudents));
        onlyBoy.addActionListener(e -> getRandStudent(boys));
        onlyGirl.addActionListener(e -> getRandStudent(girls));
        frame.setVisible(true);
    }

    public static void getRandStudent(String[] students) {
        Set<String> arr = new HashSet<>();
        JFrame tempframe = new JFrame("抽人系统");
        JTextArea resultArea = new JTextArea();
        tempframe.add(resultArea);
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("请输入抽取人数"));
        if (quantity > students.length) {
            JOptionPane.showMessageDialog(null, "学生只有" + students.length + "人", "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
        while (quantity > arr.size()) {
            int rand = (int) (Math.random() * students.length);
            arr.add(students[rand]);
        }
        // 将抽取的学生名单转换为字符串数组
        String[] GetStudents = arr.toArray(new String[0]);

        // 获取当前时间
        Timestamp currentTime = new Timestamp(new Date().getTime());

        // 插入到数据库
        for (String student : GetStudents) {
            DatabaseUtil.insertStudent(currentTime, student);
        }

        resultArea.setText(String.join("\n", arr));
        resultArea.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        tempframe.setSize(300, quantity * 25);
        tempframe.setLocation(550, 250 - quantity * 6);
        tempframe.setVisible(true);
    }
}
