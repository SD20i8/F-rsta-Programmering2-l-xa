package uppgifter;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Uppgift6 extends Application{
	
	ArrayList<Line> lines = new ArrayList<Line>();
	static Group root;
	
	public static void fibonacci(int a, int b, int size) {
		for(int i = 0; i < a+b; i++ ) {
			Line temp = new Line();
			
			temp.setStartX((504/(a+b+1))*(i+1));
			temp.setEndX((504/(a+b+1))*(i+1));
			temp.setStartY(504-(size*63));
			temp.setEndY(504-((size+1)*63));
			
			root.getChildren().add(temp);
		}
		
		if(size>=7)
			return;
		
		fibonacci(a+b,a,size+1);
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setScene(newScene());
		primaryStage.show();
	}
	
	
	public Scene newScene() {
		root = new Group();
		
		Scene scene = new Scene(root,504,504);
		
		
		fibonacci(1,0,0);
		
		
		return scene;
		
	}
	
	
	

	
	
}
