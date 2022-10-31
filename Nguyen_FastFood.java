/*Author Name: Tran Nguyen
 * Date: 02/27/2022
 * Program Name: Nguyen_FastFood
 * Purpose:Fast Food Menu with checkbox and textfield. 
 */

package application;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;

public class Nguyen_FastFood extends Application {

	Button button,button2;
	Scene scene, scene2;
	Stage primeStage,miniStage;
	CheckBox box1,box2,box3,box4,box5,box6,box7,box9;
	TextField box8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primeStage) throws Exception {
		// TODO Auto-generated method stub
		primeStage.setTitle("Order");
		button = new Button("Order");
		button2 = new Button("Quit");
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				showList();
			}
			
		});
		button2.setOnAction((ActionEvent event)->{
			Platform.exit();
		});
		
		 box1 = new CheckBox("Hamburger");
		 box2 = new CheckBox("Cheeseburger");
		 box3 = new CheckBox("Bacon Cheeseburger");
		 box4 = new CheckBox("Hot Dog");
		 box5 = new CheckBox("Fries");
		 box6 = new CheckBox("Shake");
		 box7 = new CheckBox("Soda");
		 box8 = new TextField();
		Text box9 = new Text("Special Instructions:");
		
		Text price1 = new Text("($3.59)");
		Text price2 = new Text("($3.97)");
		Text price3 = new Text("($4.35)");
		Text price4 = new Text("($1.95)");
		Text price5 = new Text("($2.79)");
		Text price6 = new Text("($3.15)");
		Text price7 = new Text("($1.86)");
		
		GridPane layout = new GridPane();
		layout.setPadding(new Insets(5,5,5,5));
		layout.setVgap(10);
		layout.setHgap(10);
		layout.addRow(0, box1,price1);
		layout.addRow(1, box2,price2);
		layout.addRow(2, box3,price3);
		layout.addRow(3, box4,price4);
		layout.addRow(4, box5,price5);
		layout.addRow(5, box6,price6);
		layout.addRow(6, box7,price7);
		layout.addRow(7, box9,box8);
		layout.addRow(8, button,button2);
		
		
		layout.setAlignment(Pos.CENTER);
		box8.setAlignment(Pos.BOTTOM_RIGHT);
		button2.setAlignment(Pos.BOTTOM_RIGHT);
	
		scene = new Scene(layout, 400,400);

		primeStage.setScene(scene);
		primeStage.show();
		
}
	
	
	public void showList() {
//		Stage miniStage = new Stage();
//		VBox layout2 = new VBox(10);
//		
//		Scene scene2 = new Scene(layout2,400,400);
//		
//		layout2.setAlignment(Pos.CENTER);
//		miniStage.setScene(scene2);
//		miniStage.setTitle("Ticket");
//		miniStage.show();
//		
		String message = "You ordered:\n";
		message += "---------------------------------------------\n";
		float sum = 0;
		String format = "%-50s$%s %n";
		int i = 0;
		if(box1.isSelected()) {
			message += format.formatted("Hamburger","3.59");
//			layout.addRow(i++, "Hamburger","3.59");
			sum += 3.59;
		}
		
		if(box2.isSelected()) {
			message += format.formatted("Cheeseburger","3.97");
			sum += 3.97;
			
		}
		if(box3.isSelected()) {
			message += format.formatted("Bacon Cheeseburger","4.35");
			sum += 4.35;


		}
	
		if(box4.isSelected()) {
			message += format.formatted("Hotdog","1.95");
			sum += 1.95;


		}
		if(box5.isSelected()) {
			message += format.formatted("Fries","2.79");
			sum += 2.79;

		}
		if(box6.isSelected()) {
			message += format.formatted("Shake","3.15");
			sum += 3.15;

		}
		if(box7.isSelected()) {
			message += format.formatted("Soda","1.86");
			sum += 1.86;

		}
			
		message += "---------------------------------------------\n";
		message += format.formatted("Total:",sum);
		message += "***Special Instructions: %s***".formatted(box8.getText());

		Alert a = new Alert(AlertType.INFORMATION);
		a.setTitle("%50s".formatted("ORDER"));
		a.setHeaderText(null);
		a.setContentText(message);
		a.show();

	}
	
		
		
}
	
