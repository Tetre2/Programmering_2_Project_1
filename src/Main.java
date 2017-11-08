import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application{
	public static double WORLD_WIDTH = 500;
	public static double WORLD_HIGHT = 500;


	Group root = new Group();
	Scene scene = new Scene(root, WORLD_WIDTH, WORLD_HIGHT);

	public ArrayList<KeyCode> keys = new ArrayList<KeyCode>();

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Circle");  //TODO


		Player cir = new Player((WORLD_WIDTH + WORLD_HIGHT)/60);

		cir.setTranslateX(WORLD_WIDTH/2 - WORLD_WIDTH/50/2);
		cir.setTranslateY(WORLD_HIGHT/2 - WORLD_HIGHT/50/2);

		scene.setOnKeyReleased(event->{
			if(keys.contains(event.getCode())){
				keys.remove(event.getCode());
			}
		});

		scene.setOnKeyPressed(event->{
			if(!keys.contains(event.getCode())){
				keys.add(event.getCode());
			}
		});


		AnimationTimer at = new AnimationTimer() {

			double moveTimer = 0; 


			@Override
			public void handle(long now) {


				if(now - moveTimer >= 1000000){
					moveTimer = now;

					if(keys.contains(KeyCode.W)){

						cir.setTranslateY(cir.getTranslateY() - Player.radius/5);


					}

					if(keys.contains(KeyCode.S)){

						cir.setTranslateY(cir.getTranslateY() + Player.radius/5);


					}

					if(keys.contains(KeyCode.A)){

						cir.setTranslateX(cir.getTranslateX() - Player.radius/5);


					}

					if(keys.contains(KeyCode.D)){

						cir.setTranslateX(cir.getTranslateX() + Player.radius/5);


					}



				}


			}
		};


		at.start();




		root.getChildren().add(cir);



		primaryStage.setScene(scene);	
		primaryStage.show();	


	}

	public static void main(String[] args) {
		launch(args);
	}

}
