package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		try {
			
			
			Parent rootFXML = FXMLLoader.load(getClass().getResource("vue.fxml"));
			Scene sceneFXML = new Scene(rootFXML);
			
			primaryStage.setTitle("Mon tuto javaFX");
			
			primaryStage.setScene(sceneFXML);
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
