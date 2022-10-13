package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PersonReader {
    public static List<String> readOrderedList(Path path) throws IOException {
        return Files.readAllLines(path).stream()
                .map(Person::parse)
                .filter(d -> d.getMonthOfBirth().equals("11"))
                .sorted(comparing(Person::getFirstName))
                .map(Person::asString)
                .collect(toList());

    }
}

