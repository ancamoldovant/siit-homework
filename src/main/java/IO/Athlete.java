package IO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Athlete implements Serializable {
    private final List<Athlete> athleteList = new ArrayList<>();
    private final String athleteName;
    private final String countryCode;
    private final int skiTimeResult;
    private final String firstShootingRange;
    private final String secondShootingRange;
    private final String thirdShootingRange;

    public Athlete(int athleteNumber, String athleteName, String countryCode, int skiTimeResult, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }


    public String getAthleteName() {
        return athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String toString() {
        return ( "-" + athleteName + ", " + getFinalSkiTimeResult() );
    }

    public String getSecondShootingRange() {
        return secondShootingRange;
    }

    public String getThirdShootingRange() {
        return thirdShootingRange;
    }

    public String getFirstShootingRange() {
        return firstShootingRange;
    }
    public  int getSkiTimeResult(){return skiTimeResult;}

    public String getFinalSkiTimeResult() {
        long count1 = firstShootingRange.chars().filter(ch -> ch == 'o').count();
        long count2 = secondShootingRange.chars().filter(ch -> ch == 'o').count();
        long count3 = thirdShootingRange.chars().filter(ch -> ch == 'o').count();
        int penalty = (int) ((count1 + count2 + count3) * 10);
        int finalSkiTimeResult = (int) (skiTimeResult + penalty);
        return  finalSkiTimeResult + " (" + getSkiTimeResult() + "+" + penalty + ")";
    }
    }





