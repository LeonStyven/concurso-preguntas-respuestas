public class Player {

    //Informacion del jugador
    private String name;
    private int points;
    private int level;

    //Getters
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getLevel() {
        return level;
    }

    //Constructor
    public Player(String name) {
        this.name = name;
    }

    
    public void LevelUp(){
        level=level+1;
    }
}
