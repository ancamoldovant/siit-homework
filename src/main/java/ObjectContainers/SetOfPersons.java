package ObjectContainers;
import java.util.*;

public class SetOfPersons {
    public static void main{

    Person person1=new Student("Moldovan Ioan", "34");
    Person person2=new Angajat("Popescu Vasile", "45");
    Person person3=new Student("Pop Cristian", "24");
    Person person4=new Somer("Aioanei Aurel", "56");
        System.out.println("cerinta 1");

    Set<Person> personSet=new TreeSet<>(new PersonComparatorByName());
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        System.out.println("Compare by Name (alphabetic order)");
        for (Person person:personSet) {
            System.out.println(person);
        }
        System.out.println("----------");
        System.out.println("Compare by age (descending order)");
        Set<Person> compareByAge = new TreeSet<>(new PersonComparatorByAge());
        compareByAge.addAll(personSet);
        for (Person person:compareByAge
             ) {
            System.out.println(person);

        }
        System.out.println(" cernita 2");

        Hobby hobby1=new Hobby("cyclism", 6);
        Hobby hobby2=new Hobby("swimming", 6);
        List<Hobby> hobbies=new ArrayList<>();
        hobbies.add(hobby1);
        hobbies.add(hobby2);

        Adresa adresa1 = new Adresa("Roumania");
        Adresa adresa2 = new Adresa("Austria");
        List<Adresa> adresaList= new ArrayList<>();
        adresaList.add(adresa1);
        adresaList.add(adresa2);

        Map< Adresa, Hobby> hobbyAdress=new HashMap<>();
        hobbyAdress.put(adresa1, hobby1);
        hobbyAdress.put(adresa2, hobby2);


        Map< Person, List<Hobby>> personHobby = new HashMap<>();{
            personHobby.put(person1, Arrays.asList(hobby1, hobby2));//in this list you can store the hobbies for person1
            for(Person person : personHobby.keySet()){
                System.out.println(person + " > " +  personHobby.get(person));
            }


            for(Map.Entry<Person, List<Hobby>> entry: personHobby.entrySet()){
                System.out.println(entry.getKey() + ">" + entry.getValue());
            }

    }
}}