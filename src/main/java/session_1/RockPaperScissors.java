
import java.util.Random;

public class RockPaperScissors {
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        
        int totalRounds = 5;
        int wins = 0, losses = 0, draws = 0;

        System.out.printf("%-8s | %-12s | %-13s | %-13s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("---------------------------------------------------------");

        for (int i = 1; i <= totalRounds; i++) {
            String playerMove = moves[random.nextInt(3)];
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMove, computerMove);

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;

            System.out.printf("%-8d | %-12s | %-13s | %-13s%n", i, playerMove, computerMove, result);
        }

        double winPercentage = ((double) wins / totalRounds) * 100;
        System.out.println("---------------------------------------------------------");
        System.out.printf("Final Summary: Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, winPercentage);
    }
}