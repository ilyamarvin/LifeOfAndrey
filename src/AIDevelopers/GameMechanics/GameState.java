package AIDevelopers.GameMechanics;

public class GameState {

    private boolean end = false;

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
        if (end) {
            System.out.println("GAME OVER");
        }
    }
}
