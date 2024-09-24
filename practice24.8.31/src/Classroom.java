import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Classroom {
    private String name;
    private HashMap<Integer, Student> students;

    public Classroom(String name) {
        this.name = name;
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void addStudents(List<Student> studentList) {
        for (Student student : studentList) {
            students.put(student.getId(), student);
        }
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students.values());
    }

    public List<Student> getRankedStudents() {
        List<Student> studentList = new ArrayList<>(students.values());
        studentList.sort(Comparator.comparingInt(Student::getTotalScore).reversed());
        return studentList;
    }
}