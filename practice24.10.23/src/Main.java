import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        //ActionEvent事件
        /*
        1. ActionEvent事件包括了用户在界面上的操作，例如点击按钮、菜单项等。
        2. ActionEvent事件的处理是通过ActionListener接口来实现的。
        3. ActionListener接口中只有一个方法actionPerformed，当用户操作界面上的组件时，该方法会被调用。
        4. 例如，当用户点击按钮时，按钮会产生一个ActionEvent事件，然后调用ActionListener接口的actionPerformed方法。
         */
        //ActionEvent事件的处理
        /*
        1. 通过addActionListener方法为组件添加ActionListener监听器。
        2. 通过removeActionListener方法为组件移除ActionListener监听器。
        3. 通过getSource方法获取事件源。
        4. 通过getActionCommand方法获取事件命令。
         */
        //ActionEvent事件的处理代码示例
        JFrame frame1 = new JFrame("ActionEvent事件处理");
        frame1.setSize(400, 300);
        frame1.setLocation(500, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(null);
        JButton button = new JButton("点击");
        button.setSize(100, 50);
        panel.add(button);
        frame1.add(panel);
        frame1.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击");
            }
        });
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("鼠标点击");
            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按下");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("鼠标释放");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("鼠标进入");
                //两个随机数
                Random random = new Random();
                int a = random.nextInt(frame1.getWidth() - button.getWidth());
                int b = random.nextInt(frame1.getHeight() - button.getHeight());
                int c= random.nextInt(3);
                if(c==0)
                {
                    button.setText("来点我呀");
                }
                else if(c==1)
                {
                    button.setText("点不到我吧");
                }
                else
                {
                    button.setText("好蠢啊你");
                }
                button.setLocation(a, b);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("鼠标离开");
            }
        });


        //ItemEvent事件
        /*
        1. ItemEvent事件包括了用户在界面上的操作，例如选择复选框、单选按钮等。
        2. ItemEvent事件的处理是通过ItemListener接口来实现的。
        3. ItemListener接口中只有一个方法itemStateChanged，当用户操作界面上的组件时，该方法会被调用。
        4. ItenEvent类中的方法getStateChange用于获取事件状态，方法getItemSelectable用于获取事件源。
         */
        //ItemEvent事件的处理
        /*
        1. 通过addItemListener方法为组件添加ItemListener监听器。
        2. 通过removeItemListener方法为组件移除ItemListener监听器。
        3. 通过getSource方法获取事件源。
        4. 通过getStateChange方法获取事件状态。
         */
        //用ItemEvent做一个计算器
        JFrame frame2 = new JFrame("ItemEvent事件处理");
        frame2.setSize(400, 300);
        frame2.setLocation(500, 200);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel2 = new JPanel(null);
        //单选按钮
        JRadioButton radioButton1 = new JRadioButton("加法");
        JRadioButton radioButton2 = new JRadioButton("减法");
        JRadioButton radioButton3 = new JRadioButton("乘法");
        JRadioButton radioButton4 = new JRadioButton("除法");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        //文本框
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        //按钮
        JButton button2 = new JButton("计算");
        radioButton1.setSize(100, 50);
        radioButton2.setSize(100, 50);
        radioButton3.setSize(100, 50);
        radioButton4.setSize(100, 50);
        textField1.setSize(100, 50);
        textField2.setSize(100, 50);
        textField3.setSize(150, 50);
        button2.setSize(100, 50);
        radioButton1.setLocation(50, 50);
        radioButton2.setLocation(50, 100);
        radioButton3.setLocation(50, 150);
        radioButton4.setLocation(50, 200);
        textField1.setLocation(200, 50);
        textField2.setLocation(200, 100);
        textField3.setLocation(200, 150);
        button2.setLocation(200, 200);
        panel2.add(radioButton1);
        panel2.add(radioButton2);
        panel2.add(radioButton3);
        panel2.add(radioButton4);
        panel2.add(textField1);
        panel2.add(textField2);
        panel2.add(textField3);
        panel2.add(button2);
        frame2.add(panel2);
        frame2.setVisible(true);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());
                float c = 0;
                if (radioButton1.isSelected()) {
                    c = a + b;
                    textField3.setText(textField1.getText() + "+" + textField2.getText() + "=" + c);
                } else if (radioButton2.isSelected()) {
                    c = a - b;
                    textField3.setText(textField1.getText() + "-" + textField2.getText() + "=" + c);
                } else if (radioButton3.isSelected()) {
                    c = a * b;
                    textField3.setText(textField1.getText() + "*" + textField2.getText() + "=" + c);
                } else if (radioButton4.isSelected()) {
                    c = (float)a / b;
                    textField3.setText(textField1.getText() + "/" + textField2.getText() + "=" + c);
                }
            }
        });


        //MouseEvent事件
        /*
        1. MouseEvent事件包括了用户在界面上的操作，例如点击、拖动、释放等。
        2. MouseEvent事件的处理是通过MouseListener接口来实现的。
        3. MouseListener接口中有五个方法，分别是mouseClicked、mousePressed、mouseReleased、mouseEntered、mouseExited。
        4. 还有MouseMotionListener接口，其中有两个方法，分别是mouseDrag(拖动)、mouseMove(移动)。
         */
        //MouseEvent事件的处理
        /*
        1. 通过addMouseListener方法为组件添加MouseListener监听器。
        2. 通过removeMouseListener方法为组件移除MouseListener监听器。
        3. 通过getSource方法获取事件源。
        4. 通过getX、getY方法获取事件发生的位置。
         */
        //实现点哪里，按钮就移动到哪里
        JFrame frame3 = new JFrame("MouseEvent事件处理");
        frame3.setSize(400, 300);
        frame3.setLocation(500, 200);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel3 = new JPanel(null);
        JButton button3 = new JButton("点击");
        button3.setSize(100, 50);
        panel3.add(button3);
        frame3.add(panel3);
        frame3.setVisible(true);
        panel3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("鼠标点击");
                int x=e.getX();
                int y=e.getY();
                button3.setLocation(x, y);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按下");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("鼠标释放");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("鼠标进入");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("鼠标离开");
            }
        });


        //WindowEvent事件
        /*
        1. WindowEvent事件包括了窗口的打开、关闭、激活、最小化、最大化等操作。
        2. WindowEvent事件的处理是通过WindowListener接口来实现的。
        3. WindowListener接口中有七个方法，分别是
           windowOpened: 窗口打开时调用
           windowClosing: 窗口关闭时调用
           windowClosed: 窗口关闭后调用
           windowIconified: 窗口最小化时调用
           windowDeiconified: 窗口恢复时调用
           windowActivated: 窗口激活时调用
           windowDeactivated: 窗口失去焦点时调用
         */
        //WindowEvent事件的处理
        /*
        1. 通过addWindowListener方法为窗口添加WindowListener监听器。
        2. 通过removeWindowListener方法为窗口移除WindowListener监听器。
        3. 通过getSource方法获取事件源。
         */
        //实现窗口关闭时弹出对话框
        JFrame frame4 = new JFrame("WindowEvent事件处理");
        frame4.setSize(400, 300);
        frame4.setLocation(500, 200);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("窗口打开");
            }
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("窗口关闭");
                int result = JOptionPane.showConfirmDialog(frame4, "是否关闭窗口？", "提示", JOptionPane.YES_NO_OPTION);//弹出对话框
                if (result == JOptionPane.YES_OPTION) {
                    frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    frame4.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("窗口关闭后");
            }
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("窗口最小化");
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("窗口恢复");
            }
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("窗口激活");
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("窗口失去焦点");
            }
        });
        frame4.setVisible(true);


        //MVC结构
        /*
        1. MVC是Model-View-Controller的缩写，是一种软件架构模式。
        2. Model: 数据模型，负责处理数据。
        3. View: 视图模型，负责显示数据。
        4. Controller: 控制器模型，负责处理用户输入。
        5. MVC模式的优点是降低了模块之间的耦合度，提高了代码的可维护性。
         */


        //对话框
        /*
        1. 对话框是一种弹出式窗口，用于显示消息、警告、错误等。
        2. JOptionPane类用于创建对话框。
        3. JOptionPane类中的showMessageDialog方法用于显示消息对话框。
        4. JOptionPane类中的showConfirmDialog方法用于显示确认对话框。
        5. JOptionPane类中的showInputDialog方法用于显示输入对话框。
         */
        //消息对话框
        /*
        1. showMessageDialog方法用于显示消息对话框。
        2. showMessageDialog方法有四个参数，分别是
           Component parentComponent: 父组件
           Object message: 消息内容
           String title: 对话框标题
           int messageType: 对话框类型(PLAIN_MESSAGE、INFORMATION_MESSAGE、WARNING_MESSAGE、ERROR_MESSAGE)
                                    (分别是普通、信息、警告、错误)
        3. showMessageDialog方法返回一个int值，表示用户的选择(YES_OPTION、NO_OPTION、CANCEL_OPTION、OK_OPTION)。
         */
        //消息对话框代码示例
        JFrame frame5 = new JFrame("消息对话框");
        frame5.setSize(400, 300);
        frame5.setLocation(500, 200);
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button5 = new JButton("点击");
        frame5.add(button5);
        frame5.setVisible(true);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame5, "这是一个消息对话框", "提示", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        //确认对话框
        /*
        1. showConfirmDialog方法用于显示确认对话框。
        2. showConfirmDialog方法有四个参数，分别是
           Component parentComponent: 父组件
           Object message: 消息内容
           String title: 对话框标题
           int optionType: 选项类型(YES_NO_OPTION、YES_NO_CANCEL_OPTION、OK_CANCEL_OPTION)
           int messageType: 对话框类型(PLAIN_MESSAGE、INFORMATION_MESSAGE、WARNING_MESSAGE、ERROR_MESSAGE、QUESTION_MESSAGE)
                                    (分别是普通、信息、警告、错误、问题)
        3. showConfirmDialog方法返回一个int值，表示用户的选择(YES_OPTION、NO_OPTION、CANCEL_OPTION、OK_OPTION)。
         */
        //确认对话框代码示例
        JFrame frame6 = new JFrame("确认对话框");
        frame6.setSize(400, 300);
        frame6.setLocation(500, 200);
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button6 = new JButton("点击");
        frame6.add(button6);
        frame6.setVisible(true);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(frame6, "是否关闭窗口？", "提示", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    frame6.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
        //输入对话框
        /*
        1. showInputDialog方法用于显示输入对话框。
        2. showInputDialog方法有四个参数，分别是
           Component parentComponent: 父组件
           Object message: 消息内容
           String title: 对话框标题
           int messageType: 对话框类型(PLAIN_MESSAGE、INFORMATION_MESSAGE、WARNING_MESSAGE、ERROR_MESSAGE、QUESTION_MESSAGE)
                                    (分别是普通、信息、警告、错误、问题)
        3. showInputDialog方法返回一个String值，表示用户输入的内容。
         */


        //表格组件
        /*
        1. 表格组件用于显示数据，通常用于显示二维数据。
        2. JTable类用于创建表格组件。
        3. JTable类的构造方法有两个参数，分别是
           Object[][] rowData: 表格数据
           Object[] columnNames: 表格列名
         */
        //表格组件代码示例
        JFrame frame7 = new JFrame("表格组件");
        frame7.setSize(400, 300);
        frame7.setLocation(500, 200);
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[][] rowData = {
                {"张三", String.valueOf(20), "男"},
                {"李四", String.valueOf(21), "女"},
                {"王五", String.valueOf(22), "男"},
                {"赵六", String.valueOf(23), "女"},
                {"田七", String.valueOf(24), "男"},
                {"孙八", String.valueOf(25), "女"},
                {"周九", String.valueOf(26), "男"},
                {"吴十", String.valueOf(27), "女"},
        };
        Object[] columnNames = {"姓名", "年龄", "性别"};
        JTable table = new JTable(rowData, columnNames);
        //增加可以手动增加数据的功能
        DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);//这是一个表格模型，可以用来增加数据
        table.setModel(tableModel);
        JButton button7 = new JButton("增加");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.addRow(new Object[]{"","",""});
            }
        });
        frame7.add(button7, "South");
        JScrollPane scrollPane = new JScrollPane(table);//添加滚动条,否则表格太大会显示不全
        frame7.add(scrollPane);
        frame7.setVisible(true);


    }
}