package Free_Palestine;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class Main extends Application  {


	@Override
    public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("palestine.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
    	
	}



    public static void main(String [] args) {
        launch(args);

    }


}

