package IO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SkiBiathlonStanding implements Serializable {
    private final List<Athlete> athleteList = new ArrayList<>();
    public void addAthlete(Athlete athlete) {
        athleteList.add(athlete);
    }


    public List<Athlete> getPenaltyCalculation() {
        return athleteList.stream()
                .sorted(Comparator.comparing(Athlete::getFinalSkiTimeResult))
                .collect(Collectors.toList());
    }
}

