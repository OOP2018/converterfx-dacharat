package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * UI controller for events and initializing components.
 * 
 * @author Dacharat Pankong
 *
 */
public class ConverterController {

	@FXML
	TextField textField1;
	@FXML
	TextField textField2;
	@FXML
	Button convertButton;
	@FXML
	Button clearButton;
	@FXML
	ComboBox<Length> combo1;
	@FXML
	ComboBox<Length> combo2;

	/**
	 * JavaFX calls the initialize() method of your controller when it creates the
	 * UI form, after the components have been created and @FXML annotated
	 * attributes have been set.
	 *
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
		// This is for testing
		System.out.println("Running initialize");
		if (combo1 != null) {
			combo1.getItems().addAll(Length.values());
			combo1.getSelectionModel().select(0); // select an item to show
		}
		if (combo2 != null) {
			combo2.getItems().addAll(Length.values());
			combo2.getSelectionModel().select(1); // select an item to show
		}
	}

	/**
	 * JavaFX call onEnter() when you click enter.
	 * 
	 * @param event
	 */
	@FXML
	public void onEnter(ActionEvent event) {
		handleConvert(event);
	}

	/**
	 * Convert a distance from one unit to another.
	 * 
	 * @param event
	 */
	public void handleConvert(ActionEvent event) {
		String leftText = textField1.getText().trim();
		String rightText = textField2.getText().trim();
		Length unit1 = combo1.getValue();
		Length unit2 = combo2.getValue();
		textField1.setStyle("-fx-text-fill: black");
		textField2.setStyle("-fx-text-fill: black");

		if (!leftText.equals("")) {
			double left = 0;
			try {
				left = Double.parseDouble(leftText);
				textField2.setText(String.format("%.4g", left * unit1.getValue() / unit2.getValue()));
			} catch (NumberFormatException e) {
				textField2.setText("Error!!");
				textField2.setStyle("-fx-text-fill: red");
			}
		} else if (!rightText.equals("")) {
			double right = 0;
			try {
				right = Double.parseDouble(rightText);
				textField1.setText(String.format("%.4g", right * unit2.getValue() / unit1.getValue()));
			} catch (NumberFormatException e) {
				textField1.setText("Error!!");
				textField1.setStyle("-fx-text-fill: red");
			}
		}
	}

	/**
	 * Clear textField empty.
	 * 
	 * @param event
	 */
	public void handleClear(ActionEvent event) {
		textField1.clear();
		textField2.clear();
		textField1.setStyle("-fx-text-fill: black");
		textField2.setStyle("-fx-text-fill: black");

	}
}
