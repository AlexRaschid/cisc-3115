//Alexander E Raschid 12-18-19

import javafx.application.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SimpleCalculator extends Application{
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Simple Calculator");
		
		Label label1 = new Label("Operand 1:");
		final TextField operand1 = new TextField();
		
		Label label2 = new Label("Operand 2:");
		final TextField operand2 = new TextField();
		
		Label label3 = new Label("Result:");
		final TextField result = new TextField();
		result.setEditable(false);
		
		
		Button btnAdd = new Button("+");
		Button btnMinus = new Button("-");
		Button btnMulti = new Button("*");
		Button btnDiv = new Button("/");
		
		
		btnAdd.setOnAction(new EventHandler<ActionEvent>() {
		 	public void handle(ActionEvent eventObject) {
				try {   
					double n1 = Double.parseDouble(operand1.getText());
					double n2 = Double.parseDouble(operand2.getText());
					result.setText(n1+n2+"");
				} catch(NumberFormatException e){
					result.setText("Error: Use real numbers");
				}	

		    }
		});
		
		btnMinus.setOnAction(new EventHandler<ActionEvent>() {
		 	public void handle(ActionEvent eventObject) {
				try {   
					double n1 = Double.parseDouble(operand1.getText());
					double n2 = Double.parseDouble(operand2.getText());
					result.setText((n1-n2)+"");
				} catch(NumberFormatException e){
					result.setText("Error: Use real numbers");
				}	

		    }
		});
		
		btnMulti.setOnAction(new EventHandler<ActionEvent>() {
		 	public void handle(ActionEvent eventObject) {
				try {   
					double n1 = Double.parseDouble(operand1.getText());
					double n2 = Double.parseDouble(operand2.getText());
					result.setText((n1*n2)+"");
				} catch(NumberFormatException e){
					result.setText("Error: Use real numbers");
				}	

		    }
		});
		
		btnDiv.setOnAction(new EventHandler<ActionEvent>() {
		 	public void handle(ActionEvent eventObject) {
				try {   
					double n1 = Double.parseDouble(operand1.getText());
					double n2 = Double.parseDouble(operand2.getText());
					result.setText((n1/n2)+"");
				} catch(NumberFormatException e){
					result.setText("Error: Use real numbers");
				}	

		    }
		});
		
		
		VBox layout = new VBox();//contains the textfields vertically
		HBox buttons = new HBox();//contains the buttons
		buttons.getChildren().addAll(btnAdd,btnMinus,btnMulti,btnDiv);
		layout.getChildren().addAll(label1,operand1,label2,operand2,label3, result, buttons);
			
		Scene scene1 = new Scene(layout);
		primaryStage.setScene(scene1);
		primaryStage.setWidth(300.0);
		primaryStage.show();
		
	}


		
}
	
	

