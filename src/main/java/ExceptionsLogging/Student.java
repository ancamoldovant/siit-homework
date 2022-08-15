package ExceptionsLogging;

import javax.naming.InvalidNameException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {
    private final String firstName;
    private final String lastName;

    private  final LocalDate dateOfBirth;
    private  final String id ;
    private  final String gender;
    public Student(String firstName,String lastName, LocalDate dateOfBirth, String id,String gender) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name should not be empty");
        }
        this.firstName = firstName;

        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name should not be empty");
        }
        this.lastName = lastName;

        if (dateOfBirth.getYear() < 1900 || dateOfBirth.getYear() > LocalDate.now().getYear() - 18) {
            throw new IllegalArgumentException("The age does not meet the registration requirements");
        }

       if (LocalDate.of(dateOfBirth.getYear(), dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth())== null){
            throw new IllegalArgumentException("Date of birth should not be empty");
        }
            this.dateOfBirth = dateOfBirth;
            if (id.isEmpty()) {
                throw new IllegalArgumentException("ID should not be empty");
            }
            this.id = id;
            if (gender.isEmpty()) {
                throw new IllegalArgumentException("Gender should not be empty");
            }
            if (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("M")) {
                this.gender = gender;
            } else throw new IllegalArgumentException("Gender should be male or female (or M/m and F/f)");
        }

        public String getId () {
            return id;
        }

        @Override
        public String toString () {
            return (firstName + " " + lastName + ", " + dateOfBirth + ", " + id + "," + gender);
        }
        @Override
        public boolean equals (Object obj){
            return super.equals(obj);
        }

        @Override
        public int hashCode () {
            return super.hashCode();
        }
    }


