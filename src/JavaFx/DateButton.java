package JavaFx;
import java.util.Date;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DateButton extends Application
{
	public static void main(String[] pArgs)
	{
		launch(pArgs);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane root = new GridPane();
		primaryStage.setScene(new Scene(root, 0, 0));
		Button button = new Button();
		button.setText(new Date().toString());
		root.getChildren().add(button);
		button.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				button.setText(new Date().toString());
				
			}
			
		});
		
		primaryStage.show();
		
	}

}

