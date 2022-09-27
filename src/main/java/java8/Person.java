package java8;

public class Person {
        private final String firstName;
        private final String lastName;
        private final String yearOfBirth;
        private final String monthOfBirth;
        private final String dayOfBirth;
    public static Person parse(String line) {
        String[] elements = line.split(",");
        String firstName = elements[0];
        String lastName = elements[1];
        String yearOfBirth = elements[2];
        String monthOfBirth= elements[3];
        String dayOfBirth= elements[4];
        return new Person (firstName, lastName, yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public Person(String firstName, String lastName, String  yearOfBirth, String monthOfBirth, String dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth=yearOfBirth;
        this.monthOfBirth=monthOfBirth;
        this.dayOfBirth=dayOfBirth;
    }

    @Override
    public String toString() {
            return firstName + monthOfBirth;
        }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getYearOfBirth(){return yearOfBirth;}
    public String getMonthOfBirth(){return monthOfBirth;}
    public String getDayOfBirth(){return dayOfBirth;}
    public String asString() {
        return firstName + " " + lastName;
    }

}

