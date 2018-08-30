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
	
	public static void fibonacci(int a, int b, int size, ArrayList<Line> gammlagrenar) {
	
		ArrayList<Line> grenar = new ArrayList<Line>();
		
		for(int i = 0; i < a+b; i++ ) {
			Line temp = new Line();
			
			temp.setStartX((504/(a+b+1))*(i+1));
			temp.setEndX((504/(a+b+1))*(i+1));
			temp.setStartY(504-(size*63)-20);
			temp.setEndY(504-((size+1)*63)+20);
			
			root.getChildren().add(temp);
			grenar.add(temp);
			
			
			if(!(size==0)) {
				Line minsta = gammlagrenar.get(0);
				for(Line gren:gammlagrenar) {
					if(Math.abs(minsta.getStartX()-temp.getStartX())>Math.abs(gren.getStartX()-temp.getStartX()))
						minsta = gren;
					
				}
				
				Line slut = new Line();
				slut.setStartX(minsta.getStartX());
				slut.setEndX(temp.getStartX());
				slut.setStartY(minsta.getEndY());
				slut.setEndY(temp.getStartY());
				root.getChildren().add(slut);
			}
		}
		
		if(size>=7)
			return;
		
		fibonacci(a+b,a,size+1, grenar);
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
		
		
		fibonacci(1,0,0, null);
		
		
		return scene;
		
	}
	
	
	

	
	
}
