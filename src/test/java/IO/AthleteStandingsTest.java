package IO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AthleteStandingsTest {
    private static final Athlete Umar = new Athlete(11, "Umar Jorgson", "SK", 1827, "xxxxx", "xxxxx", "xxoxo");
    private  static  final  Athlete Jimmy = new Athlete(2, "Jimmy Smiles", "UK", 1755, "xxoox", "xooxo", "xxxxo");
    private  static  final  Athlete Piotr = new Athlete(27, "Piotr Smitzer", "CZ", 1810, "xxxxx", "xxxxx", "xxxxx");



   // @Test
    public void CSV_parsing() throws IOException {
        String expectedData = "Hello, world!";
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("standing.csv");
        String data = readFromInputStream(inputStream);
        assertEquals(expectedData, data.trim());
    }

    private String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    @Test
    public void test_penalty_calculation() {
        SkiBiathlonStanding standing = new SkiBiathlonStanding();
        standing.addAthlete(Piotr);
        standing.addAthlete(Jimmy);
        standing.addAthlete(Umar);
        List<Athlete> result = standing.getPenaltyCalculation();
        assertEquals(3, result.size());
        assertEquals(Piotr, result.get(0));
        assertEquals(Jimmy, result.get(1));
        assertEquals(Umar, result.get(2));
    }
    @Test
    public void count_shoot_sets() {

    String firstShootingRange = "xxxxo";
    long count = firstShootingRange.chars().filter(ch -> ch == 'o').count();
    assertEquals(1,count);
}
}
