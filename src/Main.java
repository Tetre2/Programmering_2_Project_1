import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application{
	public static double WORLD_WIDTH = 500;
	public static double WORLD_HIGHT = 500;


	Group root = new Group();
	Scene scene = new Scene(root, WORLD_WIDTH, WORLD_HIGHT);

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Circle");  //TODO

		
		Circle cir = new Circle(WORLD_WIDTH/50);
		
		cir.setTranslateX(WORLD_WIDTH/2 - WORLD_WIDTH/50/2);
		cir.setTranslateY(WORLD_HIGHT/2 - WORLD_HIGHT/50/2);
		
		
		root.getChildren().add(cir);



		primaryStage.setScene(scene);	
		primaryStage.show();	


	}

	public static void main(String[] args) {
		launch(args);
	}

}
