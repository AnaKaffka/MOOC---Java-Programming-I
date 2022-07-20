import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        int jogos = 0;
        int vitorias = 0;
        try (Scanner scanFile = new Scanner(Paths.get(file))) {

            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int pointsHome = Integer.valueOf(parts[2]);
                int pointsVisit = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team)) {
                    jogos = jogos + 1;
                    if (pointsHome > pointsVisit) {
                        vitorias += 1;
                    }
                }
                if (visitingTeam.equals(team)) {
                    jogos = jogos + 1;
                    if (pointsVisit > pointsHome) {
                        vitorias += 1;
                    }
                }

            }
        } catch (Exception e) {

        }
        System.out.println("Games: " + jogos);
        System.out.println("Wins: " + vitorias);
        System.out.println("Losses: " + (jogos - vitorias));

    }

}
