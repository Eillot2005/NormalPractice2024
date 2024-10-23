import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Java Swing
        //类的层次关系
        /*
        层次关系：
        1.顶层容器：JFrame(窗口)、JDialog(对话框)、JApplet(小应用程序)
        2.次级容器：JPanel(面板)、JScrollPane(滚动面板)、JToolBar(工具条)、JDesktopPane(桌面面板)、JInternalFrame(内部窗体)
        3.基本组件：JButton、JLabel、JTextField、JTextArea、JCheckBox、JRadioButton、JComboBox、JList、JTable
        4.容器组件：JScrollPane、JToolBar、JMenuBar、JMenu、JMenuItem、JPopupMenu
        5.布局管理器：BorderLayout、FlowLayout、GridLayout、CardLayout、BoxLayout、GridBagLayout
        6.事件处理：ActionEvent、ActionListener、MouseEvent、MouseListener、MouseMotionListener、KeyEvent、KeyListener、WindowEvent、WindowListener
        7.绘图：Graphics、Graphics2D、Color、Font、FontMetrics、Image、BufferedImage
         */

        //窗口(JFrame)
        /*
        JFrame类是Swing中的顶层容器，它是一个窗口，可以包含其他组件。
        JFrame类的构造方法：
        JFrame()：创建一个新的、不带标题的窗口
        JFrame(String title)：创建一个新的、带指定标题的窗口
        JFrame常用方法：
        void setTitle(String title)：设置窗口标题
        void setSize(int width, int height)：设置窗口大小
        void setLocation(int x, int y)：设置窗口位置
        void setBounds(int x, int y, int width, int height)：设置窗口位置和大小
        void setResizable(boolean resizable)：设置窗口是否可调整大小
        void setDefaultCloseOperation(int operation)：设置窗口关闭操作
        void setVisible(boolean b)：设置窗口是否可见
        void setLayout(LayoutManager manager)：设置窗口布局管理器
        void add(Component comp)：向窗口添加组件
        void remove(Component comp)：从窗口移除组件
        void dispose()：释放窗口资源
        void setMenuBar(JMenuBar menubar)：设置窗口菜单栏
        void setIconImage(Image image)：设置窗口图标
        void setExtendedState(int state)：设置窗口的扩展状态,如最大化、最小化
        void validate()：验证窗口及其所有子组件,使布局生效
        void getContentPane()：获取窗口的内容面板
         */
        JFrame frame = new JFrame("窗口");
        frame.setSize(400, 300);
        frame.setLocation(500, 200);
        Container con=frame.getContentPane();
        con.setBackground(Color.ORANGE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //菜单
        /*
        1.菜单栏：JMenuBar
        JMenuBar类是Swing中的菜单栏，它包含多个菜单。
        JMenuBar类的常用方法：
        void add(JMenu menu)：向菜单栏添加菜单
        void remove(JMenu menu)：从菜单栏移除菜单
        JMenu getMenu(int index)：获取菜单栏的第index个菜单
        2.菜单：JMenu
        JMenu类是Swing中的菜单，它包含多个菜单项。
        JMenu类的常用方法：
        void add(JMenuItem item)：向菜单添加菜单项
        void remove(JMenuItem item)：从菜单移除菜单项
        JMenuItem getItem(int index)：获取菜单的第index个菜单项
        3.菜单项：JMenuItem
        JMenuItem类是Swing中的菜单项，它是菜单中的一个选项。
        JMenuItem类的常用方法：
        void addActionListener(ActionListener l)：为菜单项添加动作事件监听器
        void setEnabled(boolean b)：设置菜单项是否可用
        void setText(String text)：设置菜单项的文本
         */
        JMenuBar jmb=new JMenuBar();
        frame.setJMenuBar(jmb);
        JMenu menu1=new JMenu("文件");
        JMenu menu2=new JMenu("编辑");
        jmb.add(menu1);
        jmb.add(menu2);
        JMenuItem item1=new JMenuItem("打开");
        JMenuItem item2=new JMenuItem("保存");
        JMenuItem item3=new JMenuItem("退出");
        menu1.add(item1);
        menu1.add(item2);
        menu1.addSeparator();//添加分隔线
        menu1.add(item3);
        item3.addActionListener(e->System.exit(0));

        //文本框(JTextField)
        /*
        JTextField类是Swing中的文本框，它用于输入单行文本。
        JTextField类的常用方法：
        void setText(String text)：设置文本框的文本
        String getText()：获取文本框的文本
        void setColumns(int columns)：设置文本框的列数
        void setEditable(boolean b)：设置文本框是否可编辑
        void addActionListener(ActionListener l)：为文本框添加动作事件监听器
         */
        JTextField jtf=new JTextField();
        jtf.setColumns(20);//设置文本框的列数,即可见字符数
        //下面的代码实现了在文本框中输入文本后按回车键清空文本框,并输出文本框的文本,然后再次输入文本
        jtf.addActionListener(e->{
            System.out.println(jtf.getText());//输出文本框的文本
            jtf.setText("");//清空文本框
        });
        frame.add(jtf);

        //文本域(JTextArea)
        /*
        JTextArea类是Swing中的文本域，它用于输入多行文本。
        JTextArea类的常用方法：
        void setText(String text)：设置文本域的文本
        String getText()：获取文本域的文本
        void setColumns(int columns)：设置文本域的列数
        void setRows(int rows)：设置文本域的行数
        void setEditable(boolean b)：设置文本域是否可编辑
        void append(String str)：在文本域的末尾追加文本
         */

        //标签(JLabel)
        /*
        JLabel类是Swing中的标签，它用于显示文本或图像。
        JLabel类的常用方法：
        void setText(String text)：设置标签的文本
        void setIcon(Icon icon)：设置标签的图标
        void setHorizontalAlignment(int alignment)：设置标签的水平对齐方式
        void setVerticalAlignment(int alignment)：设置标签的垂直对齐方式
         */

        //按钮(JButton)
        /*
        JButton类是Swing中的按钮，它用于触发动作事件。
        JButton类的常用方法：
        void setText(String text)：设置按钮的文本
        void setIcon(Icon icon)：设置按钮的图标
        void addActionListener(ActionListener l)：为按钮添加动作事件监听器
        void setEnabled(boolean b)：设置按钮是否可用
         */

        //单选按钮(JRadioButton)
        /*
        JRadioButton类是Swing中的单选按钮，它用于选择一个选项。
        JRadioButton类的常用方法：
        void setText(String text)：设置单选按钮的文本
        void setSelected(boolean b)：设置单选按钮是否选中
        void addActionListener(ActionListener l)：为单选按钮添加动作事件监听器
        void setEnabled(boolean b)：设置单选按钮是否可用
        void setIcon(Icon icon)：设置单选按钮的图标
         */
        JRadioButton jrb1=new JRadioButton("男");
        JRadioButton jrb2=new JRadioButton("女");
        jrb1.setBounds(150, 150, 50, 30);
        jrb2.setBounds(150, 100, 50, 30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        frame.add(jrb1);
        frame.add(jrb2);
        //frame.setVisible(true);

        //JPanel
        /*
        JPanel类是Swing中的面板，它是一个容器，可以包含其他组件。
        JPanel类的常用方法：
        void add(Component comp)：向面板添加组件
        void remove(Component comp)：从面板移除组件
        void setLayout(LayoutManager manager)：设置面板布局管理器
        void setBackground(Color bg)：设置面板背景颜色
        void setBorder(Border border)：设置面板边框
        void setOpaque(boolean isOpaque)：设置面板是否透明
         */

        //布局管理器
        /*
        布局管理器是Swing中用于管理组件位置和大小的类。
        常用布局管理器：
        1.BorderLayout：边界布局管理器(JFrame默认布局管理器)
          BorderLayout类是Swing中的边界布局管理器，它将容器分为东、西、南、北、中五个区域。
            BorderLayout类的常用方法：
            void add(Component comp, Object constraints)：向容器添加组件
            void removeLayoutComponent(Component comp)：从容器移除组件
            void setHgap(int hgap)：设置组件之间的水平间距
            void setVgap(int vgap)：设置组件之间的垂直间距
        2.FlowLayout：流布局管理器(JPanel默认布局管理器)
            FlowLayout类是Swing中的流布局管理器，它按照组件添加的顺序从左到右、从上到下排列组件。
                FlowLayout类的常用方法：
                void addLayoutComponent(String name, Component comp)：向容器添加组件
                void removeLayoutComponent(Component comp)：从容器移除组件
                void setHgap(int hgap)：设置组件之间的水平间距
                void setVgap(int vgap)：设置组件之间的垂直间距
        3.GridLayout：网格布局管理器
            GridLayout类是Swing中的网格布局管理器，它将容器分为行和列，每个单元格中放置一个组件。
                GridLayout类的常用方法：
                void addLayoutComponent(String name, Component comp)：向容器添加组件
                void removeLayoutComponent(Component comp)：从容器移除组件
                void setHgap(int hgap)：设置组件之间的水平间距
                void setVgap(int vgap)：设置组件之间的垂直间距
                void setRows(int rows)：设置网格布局的行数
                void setColumns(int cols)：设置网格布局的列数
        4.CardLayout：卡片布局管理器
            CardLayout类是Swing中的卡片布局管理器，它可以在容器中切换多个组件。
                CardLayout类的常用方法：
                void addLayoutComponent(Component comp, Object constraints)：向容器添加组件
                void removeLayoutComponent(Component comp)：从容器移除组件
                void show(Container parent, String name)：显示指定名称的组件
        5.null：无布局管理器
            null布局管理器是Swing中的空布局管理器，它不对组件进行布局管理，需要手动设置组件的位置和大小。
        6.BoxLayout：盒式布局管理器
            BoxLayout类是Swing中的盒式布局管理器，它按照水平或垂直方向排列组件。
                BoxLayout类的常用方法：
                void addLayoutComponent(Component comp, Object constraints)：向容器添加组件
                void removeLayoutComponent(Component comp)：从容器移除组件
                void setAxis(int axis)：设置盒式布局的方向
                void setAlignmentX(float alignmentX)：设置组件在X轴上的对齐方式
                void setAlignmentY(float alignmentY)：设置组件在Y轴上的对齐方式
         */
        //卡片布局管理器代码示例
        JFrame frame1 = new JFrame("卡片布局管理器");
        frame1.setSize(400, 300);
        frame1.setLocation(500, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel cardPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        JButton button1 = new JButton("第一页");
        JButton button2 = new JButton("第二页");
        JButton button3 = new JButton("第三页");
        cardPanel.add(button1, "1");
        cardPanel.add(button2, "2");
        cardPanel.add(button3, "3");
        frame1.add(cardPanel);
        frame1.setVisible(true);
        button1.addActionListener(e -> cardLayout.show(cardPanel, "2"));
        button2.addActionListener(e -> cardLayout.show(cardPanel, "3"));
        button3.addActionListener(e -> cardLayout.show(cardPanel, "1"));


        //处理事件
        //ActionEvent
        /*
        ActionEvent类是Swing中的动作事件，它表示用户执行的动作。
        ActionEvent类的常用方法：
        Object getSource()：获取事件源
        String getActionCommand()：获取动作命令
        void setActionCommand(String command)：设置动作命令
         */
    }
}