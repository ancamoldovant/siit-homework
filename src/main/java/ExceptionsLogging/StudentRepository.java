package ExceptionsLogging;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.*;


public class StudentRepository{
    private static final Logger LOG = LogManager.getLogger(StudentRepository.class);
    public List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        LOG.log(Level.DEBUG, "Adding students" + student);
        students.add(student);
    }
    public void deleteStudentsById(String studentId)  {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                studentToRemove = student;
                break;
            }
        }
            if (studentToRemove != null) {
                students.remove(studentToRemove);
            } else {
                throw new IllegalArgumentException("Student does not exist");
            }
        }
        public static int calculateAge (LocalDate dateOfBirth) throws Exception {
                int studentAge = LocalDate.now().getYear() - dateOfBirth.getYear();
                if (studentAge < 0) {
                    throw new IllegalArgumentException("Age can't be negative");
                } else {
                    return studentAge ;
                }
            }
            public void list() {
            System.out.println(students);
    }
}










