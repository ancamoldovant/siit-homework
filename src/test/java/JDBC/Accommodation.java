package JDBC;

import java.util.Objects;

public class Accommodation {
    private final String id;
    private final String type;
    private final String bed_type;
    private final String max_guests;
    private final String description;

    public Accommodation(String id, String type, String bed_type, String max_guests, String description) {
        this.id = id;
        this.type = type;
        this.bed_type = bed_type;
        this.max_guests = max_guests;
        this.description = description;
    }

    @Override
    public String toString() {
        return id + ";" + type + bed_type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accommodation that = (Accommodation) o;
        return Objects.equals(id, that.id) && Objects.equals(type, that.type) && Objects.equals(bed_type, that.bed_type) && Objects.equals(max_guests, that.max_guests) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, bed_type, max_guests, description);
    }
}