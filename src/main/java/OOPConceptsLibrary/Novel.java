package OOPConceptsLibrary;

public class Novel extends Book {
    private String type ;

    public String getType() {
        return type;
    }
    public Novel(String name, int numberPages, String type) {
        super(name, numberPages);
        this.type=type;
    }

    @Override
    public void add(String name, int numberPages, String type) {
        super.add(name, numberPages, type);
    }

    @Override
    public String toString() {
        return (getName()+ ","+ getNumberPages()+ "," +type);
    }
}




