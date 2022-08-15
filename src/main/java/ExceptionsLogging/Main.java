package ExceptionsLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.time.LocalDate;


public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
            try {
                StudentRepository students = new StudentRepository();
                students.addStudent(new Student("Aioanei", "Vasile", LocalDate.of(1999, 9, 8), "11234", "m"));
                students.addStudent(new Student("Moldovan", "Anca", LocalDate.of(1997, 9, 8), "12345", "F"));
                students.addStudent(new Student("Pop", "Ioan", LocalDate.of(1992, 8, 9), "3456", "f"));
                students.addStudent(new Student("Dan", "vv", LocalDate.of(1992, 8, 9), "789", "M"));

                LOG.info("List of students");
                students.list();

                LOG.info("Deleting Pop Ioan");
                students.deleteStudentsById("11234");

                LOG.info("Printing student list after deleting");
                students.list();
                }catch (IllegalArgumentException calculateAgeex) {
                LOG.error("Exception calculate age" + calculateAgeex.getMessage());
                }catch (Exception invalidIDException){
                LOG.error("Exception " + invalidIDException.getMessage());
            }
        }
    }