public class SoccerPlayer {
    // Instance variables
    private String name;
    private int age;
    private String team;
    private int scoredGoals;

    // Constructor 1: All fields
    public SoccerPlayer(String name, int age, String team, int scoredGoals) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = scoredGoals;
    }

    // Constructor 2: Name, age, scoredGoals (No team)
    public SoccerPlayer(String name, int age, int scoredGoals) {
        this(name, age, "No team", scoredGoals);
    }

    // Constructor 3: Name, age, team (No scoredGoals)
    public SoccerPlayer(String name, int age, String team) {
        this(name, age, team, 0);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    // Override toString method
    @Override
    public String toString() {
        return "SoccerPlayer [Name: " + name + ", Age: " + age + ", Team: " + team + ", Scored Goals: " + scoredGoals + "]";
    }

    // Override equals method to compare based on scoredGoals and team
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SoccerPlayer otherPlayer = (SoccerPlayer) obj;
        return this.scoredGoals == otherPlayer.scoredGoals && this.team.equals(otherPlayer.team);
    }

}

