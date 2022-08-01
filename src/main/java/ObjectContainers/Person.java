package ObjectContainers;

public abstract class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + getName() + "," + getAge() ;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
