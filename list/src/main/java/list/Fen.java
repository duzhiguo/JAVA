package list;

public class Fen {
    String colour;

    @Override
    public String toString() {
        return "Fen{" +
                "colour='" + colour + '\'' +
                ", id=" + id +
                ", radius=" + radius +
                ", speed=" + speed +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    Long id;
    double radius;
    int speed;

}
