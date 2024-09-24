import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    private static HashMap<String, Classroom> classrooms = new HashMap<>();
    private static String[] subjects = {"Math", "Science", "English"};

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("学生成绩管理系统");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new GridLayout(6, 1));

            JButton createClassButton = new JButton("创建班级");
            JButton addGradeButton = new JButton("添加学生成绩");
            JButton queryGradesButton = new JButton("查询班级成绩");
            JButton rankClassButton = new JButton("班级排名");
            JButton rankGradeButton = new JButton("年级排名");
            JButton exitButton = new JButton("退出");

            frame.add(createClassButton);
            frame.add(addGradeButton);
            frame.add(queryGradesButton);
            frame.add(rankClassButton);
            frame.add(rankGradeButton);
            frame.add(exitButton);

            createClassButton.addActionListener(e -> createClassroom());
            addGradeButton.addActionListener(e -> addStudentGrade());
            queryGradesButton.addActionListener(e -> queryClassroomGrades());
            rankClassButton.addActionListener(e -> rankClassroom());
            rankGradeButton.addActionListener(e -> rankGrade());
            exitButton.addActionListener(e -> System.exit(0));

            frame.setVisible(true);
        });
    }

    private static void createClassroom() {
        String name = JOptionPane.showInputDialog("请输入班级名称");
        if (name != null && !name.isEmpty()) {
            String studentInfo = JOptionPane.showInputDialog("请输入学生信息（格式：学号,姓名;学号,姓名;...）");
            if (studentInfo != null && !studentInfo.isEmpty()) {
                String[] studentEntries = studentInfo.split(";");
                List<Student> students = new ArrayList<>();
                for (String entry : studentEntries) {
                    String[] parts = entry.split(",");
                    int id = Integer.parseInt(parts[0]);
                    String studentName = parts[1];
                    students.add(new Student(id, studentName));
                }
                Classroom classroom = new Classroom(name);
                classroom.addStudents(students);
                classrooms.put(name, classroom);
                JOptionPane.showMessageDialog(null, "班级创建成功");
            }
        }
    }

    private static void addStudentGrade() {
        String className = JOptionPane.showInputDialog("请输入班级名称");
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            JOptionPane.showMessageDialog(null, "班级不存在");
            return;
        }

        List<Student> students = classroom.getStudents();
        String[] studentNames = students.stream().map(Student::getName).toArray(String[]::new);
        String studentName = (String) JOptionPane.showInputDialog(null, "选择学生", "学生选择", JOptionPane.QUESTION_MESSAGE, null, studentNames, studentNames[0]);
        Student selectedStudent = students.stream().filter(s -> s.getName().equals(studentName)).findFirst().orElse(null);

        if (selectedStudent != null) {
            boolean continueInput = true;
            while (continueInput) {
                String subject = (String) JOptionPane.showInputDialog(null, "选择科目", "科目选择", JOptionPane.QUESTION_MESSAGE, null, subjects, subjects[0]);
                int score = Integer.parseInt(JOptionPane.showInputDialog("请输入成绩"));
                selectedStudent.setGrade(subject, score);
                int option = JOptionPane.showConfirmDialog(null, "成绩添加成功，是否继续输入？", "继续输入", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.NO_OPTION) {
                    continueInput = false;
                }
            }
        }
    }

    private static void queryClassroomGrades() {
        String className = JOptionPane.showInputDialog("请输入班级名称");
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            JOptionPane.showMessageDialog(null, "班级不存在");
            return;
        }

        StringBuilder result = new StringBuilder();
        for (Student student : classroom.getStudents()) {
            result.append("学生学号: ").append(student.getId()).append("\n");
            result.append("学生姓名: ").append(student.getName()).append("\n");
            result.append("学生成绩: ").append(student.getGrades()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }

    private static void rankClassroom() {
        String className = JOptionPane.showInputDialog("请输入班级名称");
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            JOptionPane.showMessageDialog(null, "班级不存在");
            return;
        }

        List<Student> rankedStudents = classroom.getRankedStudents();
        StringBuilder result = new StringBuilder();
        for (Student student : rankedStudents) {
            result.append("学生学号: ").append(student.getId()).append("\n");
            result.append("学生姓名: ").append(student.getName()).append("\n");
            result.append("总成绩: ").append(student.getTotalScore()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }

    private static void rankGrade() {
        String gradePrefix = JOptionPane.showInputDialog("请输入年级");

        List<Student> allStudents = new ArrayList<>();
        for (Classroom classroom : classrooms.values()) {
            for (Student student : classroom.getStudents()) {
                if (String.valueOf(student.getId()).startsWith(gradePrefix)) {
                    allStudents.add(student);
                }
            }
        }

        allStudents.sort(Comparator.comparingInt(Student::getTotalScore).reversed());
        StringBuilder result = new StringBuilder();
        for (Student student : allStudents) {
            result.append("学生学号: ").append(student.getId()).append("\n");
            result.append("学生姓名: ").append(student.getName()).append("\n");
            result.append("总成绩: ").append(student.getTotalScore()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }
}