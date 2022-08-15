package ExceptionsLogging;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;


class StudentRepositoryTest {
    @Test
    public void test_add_student() throws Exception{
        List<Student> students=new ArrayList<>();
        students.add(new Student("Moldovan", "Anca",LocalDate.of(1989, 2, 6), "12345", "F"));
        students.add(new Student("ab", "vv", LocalDate.of(1992, 8, 9), "789", "f"));
        Assertions.assertArrayEquals(students.toArray(), students.toArray());
    }
    @Test
    public void test_add_student_with_empty_firstName() throws Exception{
       Exception thrownException = Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> new Student("", "Bogdan", LocalDate.of(1990, 9, 8), "678", "g"));
       Assertions.assertEquals("First name should not be empty", thrownException.getMessage());
    }
    @Test
    public void test_add_student_with_empty_lastName() throws Exception{
        Exception thrownException = Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> new Student("Pop", "", LocalDate.of(1990, 9, 8), "789", "g"));
        Assertions.assertEquals("Last name should not be empty", thrownException.getMessage());
    }

    @Test
    public void test_dateOfBirth_upper_limit(){
        Exception thrownException = Assertions.assertThrowsExactly(IllegalArgumentException.class,() -> new Student("Moldovan", "Anca", LocalDate.of(2005, 9, 8), "1234", "g"));
        Assertions.assertEquals("The age does not meet the registration requirements", thrownException.getMessage());
    }
    @Test
    public void test_dateOfBirth_lower_limit(){
        Exception thrownException = Assertions.assertThrowsExactly(IllegalArgumentException.class,() -> new Student("Moldovan", "Anca", LocalDate.of(1899, 9, 8), "12345", "f"));
        Assertions.assertEquals("The age does not meet the registration requirements", thrownException.getMessage());
    }


    @Test
    public void test_calculate_student_age() throws Exception{
        int age = StudentRepository.calculateAge(LocalDate.of(1992, 8, 9));
        Assertions.assertEquals(30, age);
    }
    @Test
    public void test_calculate_negative_student_age() {
        Exception thrownException = Assertions.assertThrowsExactly(IllegalArgumentException.class,() -> StudentRepository.calculateAge(LocalDate.of(2023, 9, 8)));
        Assertions.assertEquals("Age can't be negative", thrownException.getMessage());
    }

    @Test
    public void test_gender_upper_case_F(){
        List<Student> students =new ArrayList<>();
    students.add(new Student("Moldovan", "Anca", LocalDate.of(1997, 9, 8), "12345", "F"));
    Assertions.assertArrayEquals(students.toArray(), students.toArray());
    }
    @Test
    public void test_gender_upper_case_M(){
        List<Student> students =new ArrayList<>();
        students.add(new Student("Moldovan", "Anca", LocalDate.of(1997, 9, 8), "12345", "M"));
        Assertions.assertArrayEquals(students.toArray(), students.toArray());
    }
    @Test
    public void test_gender_low_case_f(){
        List<Student> students=new ArrayList<>();
        students.add(new Student("Moldovan", "Anca", LocalDate.of(1997, 9, 8), "12345", "f"));
        Assertions.assertArrayEquals(students.toArray(), students.toArray());
    }
    @Test
    public void test_gender_low_case_m(){
        List<Student> students=new ArrayList<>();
        students.add(new Student("Moldovan", "Anca", LocalDate.of(1997, 9, 8), "12345", "m"));
        Assertions.assertArrayEquals(students.toArray(), students.toArray());
    }
    @Test
    public void test_gender_not_allowed_char() {
        Exception thrownException = Assertions.assertThrowsExactly(IllegalArgumentException.class,() -> new Student("Moldovan", "Anca", LocalDate.of(1999, 9, 8), "12345", "g"));
        Assertions.assertEquals("Gender should be male or female (or M/m and F/f)", thrownException.getMessage());
    }
    }


