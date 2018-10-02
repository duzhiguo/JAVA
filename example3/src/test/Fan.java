package test;

public class Fan {

    String color;
    int speed;
    double redius;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }

    @Override
    public String   toString() {
        return "Fan{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", redius=" + redius +
                '}';
    }
}
