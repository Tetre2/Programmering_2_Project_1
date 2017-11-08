import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public static double WORLD_WIDTH = 500;
	public static double WORLD_HIGHT = 500;


	Group root = new Group();
	Scene scene = new Scene(root, WORLD_WIDTH, WORLD_HIGHT);

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Circle");  //TODO




		primaryStage.setScene(scene);	
		primaryStage.show();	


	}

	public static void main(String[] args) {
		launch(args);
	}

}
