package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
	

import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		//@Override
	   // public void start(Stage primaryStage) {
	        // Create a Button
	        Button btn = new Button("Click Me");

	        // Create a Text element to show the welcome message
	        Text welcomeMessage = new Text();

	        // Set the button action
	        btn.setOnAction(e -> {
	            // Display the welcome message when the button is clicked
	            welcomeMessage.setText("Welcome to JavaFX!");
	        });

	        // Set up the layout
	        StackPane root = new StackPane();
	        root.getChildren().addAll(btn, welcomeMessage);

	        // Create the scene with the layout
	        Scene scene = new Scene(root, 300, 250);

	        // Set up the stage
	        primaryStage.setTitle("JavaFX Welcome App");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);  // Launch the JavaFX application
	    }
	}
		
	
