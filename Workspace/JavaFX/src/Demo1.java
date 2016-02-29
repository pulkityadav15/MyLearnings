import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Demo1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Log Analysis Tool");

		final Circle circ = new Circle(40, 40, 30);
		final Group root = new Group(circ);
		root.setId("pane");

		final Scene scene = new Scene(root, 800, 400);
		scene.getStylesheets().add("style.css");
		final Text text1 = new Text(25, 125, "Cognizant Technology Solutions");
		text1.setFill(Color.CHOCOLATE);
		text1.setFont(Font.font(java.awt.Font.SERIF, 25));
		root.getChildren().add(text1);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
