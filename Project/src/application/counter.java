package application;  // Define the package

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * This is a simple counter application using JavaFX.
 * It allows the user to increment and decrement a counter by clicking buttons.
 * The updated count is displayed on the screen.
 * 
 * @author [Your Name]
 * @version 1.0
 * @since 2024-11-27
 */
public class counter extends Application {

    // Instance variable to store the current count
    private int count = 0;

    /**
     * This is the main entry point for the JavaFX application.
     * It sets up the user interface and the logic for the buttons.
     * 
     * @param primaryStage The primary stage (window) for the application.
     */
    @Override
    public void start(Stage primaryStage) {

        // Text element to display the current count
        Text countText = new Text("Count: " + count);

        // Button for incrementing the counter
        Button incrementButton = new Button("Increment");
        incrementButton.setOnAction(e -> {
            count++;  // Increment the counter
            countText.setText("Count: " + count);  // Update the displayed count
        });

        // Button for decrementing the counter
        Button decrementButton = new Button("Decrement");
        decrementButton.setOnAction(e -> {
            count--;  // Decrement the counter
            countText.setText("Count: " + count);  // Update the displayed count
        });

        // Layout to arrange buttons and text
        StackPane layout = new StackPane();
        layout.getChildren().addAll(countText, incrementButton, decrementButton);

        // Adjust button positions with translation
        incrementButton.setTranslateY(-30);
        decrementButton.setTranslateY(30);

        // Create the scene and set it on the primary stage
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setTitle("Counter Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main method to launch the JavaFX application.
     * 
     * @param args Command-line arguments (unused).
     */
    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
}
