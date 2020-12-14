import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BasicCalculator extends Application {
	// Override the start method in the Application class
	@Override
	public void start(Stage primaryStage) {
		//create a grid pane
		GridPane pane1 = new GridPane();
		//set its properties
		pane1.setAlignment(Pos.CENTER);
		pane1.setPadding(new Insets(14));
		pane1.setHgap(4);
		pane1.setVgap(4);

		//create  a border pane
		BorderPane borderPane = new BorderPane();
		//set padding for border pane
		borderPane.setPadding(new Insets(14)); 

		//set a textfield in border pane top
		TextField resultDisplay = new TextField();
		resultDisplay.setEditable(false);
		borderPane.setTop(resultDisplay);
		//insert pane1 in borderPane--here a pen is 
		//considered as a node
		borderPane.setLeft(pane1);

		//create a GridPane
		GridPane pane2 = new GridPane();
		pane2.setAlignment(Pos.CENTER);
		pane2.setPadding(new Insets(14));
		pane2.setHgap(4);
		pane2.setVgap(4);

		//create operator buttons[+, -, x, / ]
		Button btDivide = new Button(" / ");
		pane2.add(btDivide, 1, 1);
		Button btMultiply = new Button(" x ");
		pane2.add(btMultiply, 1, 2);
		Button btSubtract = new Button(" - ");
		pane2.add(btSubtract, 1, 3);
		Button btAdd = new Button(" + ");
		pane2.add(btAdd, 1, 4);

		//set content to the right of the border pane
		borderPane.setRight(pane2);

		//create buttons from 1 to 7 ---(first digit represent column)
		//second digit represent row, [column-row]

		Button btSeven = new Button(" 7 ");
		pane1.add(btSeven, 1, 1);
		Button btEight = new Button(" 8 ");
		pane1.add(btEight, 2, 1);
		Button btNine = new Button(" 9 ");
		pane1.add(btNine, 3, 1);
		Button btFour = new Button(" 4 ");
		pane1.add(btFour, 1, 2);
		Button btFive = new Button(" 5 ");
		pane1.add(btFive, 2, 2);
		Button btSix = new Button(" 6 ");
		pane1.add(btSix, 3, 2);
		Button btOne = new Button(" 1 ");
		pane1.add(btOne, 1, 3);
		Button btTwo = new Button(" 2 ");
		pane1.add(btTwo, 2, 3);
		Button btThree = new Button(" 3 ");
		pane1.add(btThree, 3, 3);
		Button btSign = new Button("+/-");
		pane1.add(btSign, 1, 4);
		Button btZero = new Button(" 0 ");
		pane1.add(btZero, 2, 4);
		Button btPoint = new Button(" .  ");
		pane1.add(btPoint, 3, 4);




		//create a scene and add the pane into the scene
		Scene scene = new Scene(borderPane, 240, 240 );
		primaryStage.setTitle("Basic Calculator"); //set the window tittle
		primaryStage.setScene(scene); //place the scene into the window/stage
		primaryStage.show(); //dispay the stage
		primaryStage.setResizable(false);

	}
}