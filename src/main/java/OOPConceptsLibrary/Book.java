package OOPConceptsLibrary;

public class Book {
    private String name;
    private int numberPages;

    public Book (String name, int numberPages) {
        this.name=name;
        this.numberPages=numberPages;
    }
    public String getName() {
        return name;
    }
    public int getNumberPages() {
        return numberPages;
    }

    protected void add(String name, int numberPages, String type) {
    }
    @Override
    public String toString() {
        return(name+numberPages);
    }

}

