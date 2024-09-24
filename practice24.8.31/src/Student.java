import java.util.HashMap;

public class Student {
    private int id;
    private String name;
    private HashMap<String, Integer> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrade(String subject, int score) {
        grades.put(subject, score);
    }

    public int getGrade(String subject) {
        return grades.getOrDefault(subject, 0);
    }

    public int getTotalScore() {
        return grades.values().stream().mapToInt(Integer::intValue).sum();
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }
}