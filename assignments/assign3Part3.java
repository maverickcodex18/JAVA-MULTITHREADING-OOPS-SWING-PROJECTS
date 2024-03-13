import java.io.*;



class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Required for serialization

    private String name;
    private int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", grade=" + grade +
                '}';
    }


}

public class assign3Part3 {


private static void serialize(Student student) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\assignments\\students.ser"))) {
            oos.writeObject(student);
            System.out.println("Student object serialized and saved to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Student deserialize() {
        Student student = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java\\assignments\\students.ser"))) {
            student = (Student) ois.readObject();
            System.out.println("Student object deserialized from student.ser");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student;
    }



public class SerializationExample {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 12345, 'A');

        // Serialize the object and save it to a file
        serialize(student);

        // Deserialize the object from the file and print its details
        Student deserializedStudent = deserialize();
        System.out.println("Deserialized Student Details: " + deserializedStudent);
    }


}

}
