package IO;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SkiBiathlonStanding standing = new SkiBiathlonStanding() ;
        standing.addAthlete(new Athlete(11, "Umar Jorgson", "SK", 1827, "xxxxx", "xxxxx", "xxoxo"));
        standing.addAthlete(new Athlete(2, "Jimmy Smiles", "UK", 1755, "xxoox", "xooxo", "xxxxo"));
        standing.addAthlete(new Athlete(27, "Piotr Smitzer", "CZ", 1810, "xxxxx", "xxxxx", "xxxxx"));
        System.out.println(standing.getPenaltyCalculation());

        try(
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("standing.csv"))){
        out.writeObject(standing);
    } catch (
    IOException e) {
        throw new RuntimeException(e);
    }
        try(
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("standing.csv"))) {
        SkiBiathlonStanding readStanding= ( SkiBiathlonStanding) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
}

}


