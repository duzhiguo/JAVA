package edu.zut.cs.network.example.object;

/**
 * 
 * 
 * @author liuxiaoming*
 */
public class Fan extends BaseObject {

	/**
	 * color of fan's leaves;
	 */
	String colour;

	Long id;
	/**
	 * radius of fan's leaves;
	 */
	double radius;
	/**
	 * speed of running;
	 */
	int speed;

	public String getColour() {
		return colour;
	}

	public Long getId() {
		return id;
	}

	public double getRadius() {
		return radius;
	}

	public int getSpeed() {
		return speed;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Fan [colour=" + colour + ", radius=" + radius + ", speed=" + speed + "]";
	}

}
