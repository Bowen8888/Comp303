package JavaFX;
import java.time.LocalDate;
import java.util.Date;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class date extends Application
{
	public static void main(String[] pArgs)
	{
		launch(pArgs);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button();
		button.setText(new Date().toString());
		button.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				button.setText(new Date().toString());
			}
			
		});
		primaryStage.setScene(new Scene(button));
		primaryStage.setTitle("Date");
		primaryStage.show();
	}
}
