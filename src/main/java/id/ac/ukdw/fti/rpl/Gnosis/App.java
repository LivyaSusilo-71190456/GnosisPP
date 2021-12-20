package id.ac.ukdw.fti.rpl.Gnosis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 * 
 * 
 * jihuji8hu7yihuyt9iu87ko9iuyy7t0poi9u8y7654
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("places.fxml"));

        Scene scene = new Scene(root);

        String scenestring = new String("Bible Gnosis");

        stage.setTitle(scenestring);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
