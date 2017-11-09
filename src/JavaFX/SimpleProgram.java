package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleProgram extends Application
{
	private static final int GAP = 10;
	private static final int MARGIN = 20;
	/**
	 * 
	 * @param pArgs 
	 */
	public static void main(String[] pArgs)
	{
		launch("");
	}
	/**
	 * 
	 */
	@Override
	public void start(Stage pPrimaryStage) throws Exception 
	{
		GridPane root =  new GridPane();
		GridPane root1 =  new GridPane();
		GridPane root2 =  new GridPane();

		Button innerButton = new Button("InnerButton");
		Button button1 = new Button("On");
		Button button2 = new Button("Off");
		Button button3 = new Button("button3");
		Button button4 = new Button("button4");
		root1.add(button1, 0, 0);
		root1.add(button2, 1, 0);
		root2.add(button3, 2, 0);
		root2.add(button4, 3, 0);

		Button outerButton = new Button("OuterButton",innerButton);
		root.add(outerButton,0,0);
		root.add(root1, 1, 0);
		root.add(root2, 0, 1);
		
		innerButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				System.out.println("InnerButton clicked.");
			}
			
		});
		button2.setDisable(true);
		button1.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				button1.setDisable(true);
				button2.setDisable(false);
				System.out.println("On");
				
			}
			
		});
		
		button2.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				button2.setDisable(true);
				button1.setDisable(false);
				System.out.println("Off");
			
			}
			
		});
		
		
		pPrimaryStage.setScene(new Scene(root));
		pPrimaryStage.setTitle("This is a Window.");
		pPrimaryStage.setHeight(500);
		pPrimaryStage.setWidth(500);
		pPrimaryStage.show();
	}

}
