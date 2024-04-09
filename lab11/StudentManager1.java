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

public class StudentManager1 {

    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {
        // Write student information to the file
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            outputStream.writeUTF("Alice");
            outputStream.writeInt(1001);
            outputStream.writeDouble(3.9);

            outputStream.writeUTF("Arpit");
            outputStream.writeInt(1002);
            outputStream.writeDouble(3.5);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read student information from the file
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (inputStream.available() > 0) {
                String name = inputStream.readUTF();
                int id = inputStream.readInt();
                double gpa = inputStream.readDouble();
                Student student = new Student(name, id, gpa);
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
