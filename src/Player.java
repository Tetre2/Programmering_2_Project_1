import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player extends Circle{
	
	public static double radius;

	Player(double radius){
		
		this.radius = radius;
		
		this.setRadius(radius);
		
		
		this.setFill(Color.rgb( (int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255)));
		
		
	}
	
	
}
