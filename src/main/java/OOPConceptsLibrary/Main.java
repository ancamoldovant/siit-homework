package OOPConceptsLibrary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> collection = new ArrayList();
        collection.add(new Novel("Moara cu noroc", 143, "psychological"));
        collection.add(new Album("Peisaje din Delta", 30, "high"));
        collection.add(new Album("Cladiri istorice in Tg Mures", 40, "medium"));
        collection.add(new Novel("Alexandru Lapusneanul", 345, "historic"));
        collection.remove(2);//delete element
        System.out.println(collection);
    }
}





