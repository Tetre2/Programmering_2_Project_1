	import javafx.application.Application;
	import javafx.scene.Group;
	import javafx.scene.Scene;
	import javafx.stage.Stage;

public class Main extends Application{
	public static double worldWidth = 500;
	public static double worldHeight = 500;

	
		Group root = new Group();
		Scene scene = new Scene(root, worldWidth, worldHeight);
		
		@Override
		public void start(Stage primaryStage) throws Exception {
			primaryStage.setTitle("TEMPLET");  //TODO
			
			
			
			
		primaryStage.setScene(scene);	
		primaryStage.show();	
		
		
		}
		
		public static void main(String[] args) {
			launch(args);
		}
		
	}
