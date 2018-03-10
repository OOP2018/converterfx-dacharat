package converter;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

/**
 * Main for start program.
 * 
 * @author Dacharat Pankong
 *
 */
public class Main extends Application {
	
	/**
	 * Start program by choose GUI from fxml file.
	 */
	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.sizeToScene();
			stage.show();
		} catch (Exception e) {
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
