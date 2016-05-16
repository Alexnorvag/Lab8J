/**
 * Created by norvag on 16.05.2016.
 */
public class AutoCharacter {
    private int speed;
    private int startPoint;
    private int newPoint;

    public AutoCharacter(int speed, int startPoint) {
        this.speed = speed;
        this.startPoint = startPoint;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStartPoint() {
        return startPoint;
    }

    public int getNewPoint() {
        return newPoint;
    }

    public void setNewPoint(int newPoint) {
        this.newPoint = newPoint;
    }
}
