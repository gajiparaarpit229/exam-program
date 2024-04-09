import java.io.*;

class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }
}

public class StudentManager {

    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int id = Integer.parseInt(parts[1]);
                double gpa = Double.parseDouble(parts[2]);
                Student student = new Student(name, id, gpa);
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            Student newStudent = new Student("Arpit", 2005, 9.9);
            writer.write(newStudent.getName() + "," + newStudent.getId() + "," + newStudent.getGpa());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
