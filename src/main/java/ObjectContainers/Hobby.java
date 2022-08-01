package ObjectContainers;

import java.util.*;

public class Hobby {
    private String hobbyName;
    private int hobbyFrequency;

    public Hobby(String hobbyName,int hobbyFrequency) {
        this.hobbyName = hobbyName;
        this.hobbyFrequency = hobbyFrequency;
    }

    @Override
    public String toString() {
        return hobbyName ;
    }
    public static void main(String[] args) {
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

    }}


