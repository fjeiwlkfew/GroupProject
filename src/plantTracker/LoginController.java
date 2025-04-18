package plantTracker;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private TextField userName;

	@FXML
	private TextField password;

	@FXML
	private Button login;

	@FXML
	private Button register;

	@FXML
	public void register(ActionEvent event) {
		switchScene(event, "Register.fxml", "Register"); // replace with your actual file path if needed
	}

	@FXML
	public void login(ActionEvent event) {
		switchScene(event, "PlantTracker.fxml", "Plant Tracker"); // replace with your actual file path if needed
	}

	public void switchScene(ActionEvent event, String fxmlFile, String title) {
		try {
			Parent loader = FXMLLoader.load(getClass().getResource(fxmlFile));
			Scene newScene = new Scene(loader);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(newScene);
			stage.setTitle(title);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
