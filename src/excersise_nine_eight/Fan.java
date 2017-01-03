/**
 * 
 */
package excersise_nine_eight;
/**
 * @author Sergei
 *
 */
public class Fan {
	private int speed;
	private boolean on;
	private double radius;
	public String color;
	final static int s = 1;
	final static int m = 2;
	final static int f = 3;
	
	Fan() {
		speed = s;
		on = false;
		radius = 5;
		color = "blue";
	}
	public boolean isOn() {
		return on;
	}
	public double Radius() {
		return radius;
	}
	public String Color() {
		return color;
	}
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	public void turnOn() {
			on = true;
	}
	public void turnOff() {
			on = false;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	public String Speed() {
		String g = "";
		switch (speed) {
			case s: g = "slow"; break;
			case m: g = "medium"; break;
			case f: g = "fast";
		}
		return g;
	}
	public String toString() {
		if (on == true) {
			return "Fan speed: " + Speed() + " color: " + color + 
					 ", radius: " + radius;
		}
		else{
			return "Fan color: " + color + ", radius: " + radius;
		}
}
}
