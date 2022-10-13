package java8;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPersonReader {
    @Test
    public void test_readOrderedList() throws IOException, URISyntaxException {
        Path path = Paths.get(this.getClass().getResource("/java8/listOfPersons.txt").toURI());
        List<String> orderedList = PersonReader.readOrderedList(path);

        assertEquals("Aioanei Vlad", orderedList.get(0));
        assertEquals("Bunescu Ion", orderedList.get(1));
        assertEquals("Tomolea Anca", orderedList.get(2));
    }
    @Test
    public void test_parse() {
        String line = "Tomolea,Anca,1992,11,8,";

        Person personData = Person.parse(line);

        assertEquals("Tomolea", personData.getFirstName());
        assertEquals("Anca", personData.getLastName());
        assertEquals("1992", personData.getYearOfBirth());
        assertEquals("11", personData.getMonthOfBirth());
        assertEquals("8", personData.getDayOfBirth());
    }
}


