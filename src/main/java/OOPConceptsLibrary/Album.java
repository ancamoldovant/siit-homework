package OOPConceptsLibrary;

public class Album extends Book {
    private String paperQuality;

    public Album(String name, int numberPages, String paperQuality) {
        super(name, numberPages);
        this.paperQuality = paperQuality;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void add(String name, int numberPages, String paperQuality) {
        super.add(name, numberPages, paperQuality);
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return (getName() + "," + getNumberPages()+ "," + paperQuality);
    }
}