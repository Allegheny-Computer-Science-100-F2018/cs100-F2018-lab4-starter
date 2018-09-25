package labfour;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * This class uses JavaFX to produce graphical output with shapes.
 * The program will display a complex graphical scene that contains
 * shapes and colors according to the specification in the README
 * file and the laboratory assignment sheet.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Gregory M. Kapfhammer and Lewis and Loftus
 */

public class DisplayGraphicalScene extends Application {

  /** The width of the graphical scene's canvas. */
  private static final int CANVAS_WIDTH = 1024;

  /** The height of the graphical scene's canvas. */
  private static final int CANVAS_HEIGHT = 768;

  /**
   * This is the start method that displays a graphical scene.
   * This method will create colored graphical objects and place
   * them on a virtual canvas with a title. This method will
   * be called by the main method's invocation of start.
   */
  public void start(Stage primaryStage) {
    // TODO: Add all of the required graphics code to
    // ensure that your program displays a graphical scene

    // create a sun that will be filled with a gold color
    Circle sun = new Circle(50, 50, 30);
    sun.setFill(Color.GOLD);

    // TODO: Add all of your other graphical objects to the root

    // create a group that contains the sun
    Group mainGroup = new Group(sun);

    // create a scene with a canvas, background color, and a group of graphics
    Scene scene = new Scene(mainGroup, CANVAS_WIDTH, CANVAS_HEIGHT, Color.LIGHTBLUE);

    // TODO: set the title of the provided primaryStage
    primaryStage.setTitle("");

    // set the scene and then call the show method to display
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * This is the main method that displays a graphical scene.
   * This method will call the launch method to display the scene.
   */
  public static void main(String[] args) {
    // call the launch method, which will trigger a start call
    launch(args);
  }

}
