/**
 * 
 */
package excersise_nine_eight;
/**
 * @author Sergei
 *
 */
public class Exercise_9_8 {
	
	public static void main(String[] args) {
		
		final int s = 1;		
		final int m = 2;	
		final int f = 3;		
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setSpeed(f);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.turnOn();
		fan2.setSpeed(m);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.turnOff();
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}
}
