//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create 5-6 players
        SoccerPlayer player1 = new SoccerPlayer("Lionel Messi", 36, "Inter Miami", 720);
        SoccerPlayer player2 = new SoccerPlayer("Cristiano Ronaldo", 38, "Al-Nassr", 800);
        SoccerPlayer player3 = new SoccerPlayer("Kylian Mbappe", 24, "PSG", 250);
        SoccerPlayer player4 = new SoccerPlayer("Neymar Jr", 31, "Al-Hilal");
        SoccerPlayer player5 = new SoccerPlayer("Erling Haaland", 23, 210);
        SoccerPlayer player6 = new SoccerPlayer("Mohamed Salah", 31, "Liverpool", 210);

        // Test toString method
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
        System.out.println(player5);
        System.out.println(player6);

        // Test equals method
        System.out.println("\nComparing player5 and player6: " + player5.equals(player6)); // Should be true as scoredGoals and team are the same
        System.out.println("Comparing player1 and player2: " + player1.equals(player2)); // Should be false
    }
}