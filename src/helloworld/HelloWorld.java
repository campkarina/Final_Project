package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloWorld extends Application {

    Stage window;
    Scene scene1, scene2, scene3, scene4, scene5;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;

        //SCENE 1

        final Text label1 = new Text();
        label1.setText("Welcome to the DORA ADVENTURE GAME!");
        label1.setFill(Color.HOTPINK);
        label1.setFont(Font.font(null, FontWeight.BOLD, 70));
        label1.setX(10.0f);
        label1.setY(10.0f);
        label1.setTranslateX(0);
        label1.setTranslateY(-420);

        Button button1 = new Button("LET'S PLAY!");
        button1.setOnAction(e -> window.setScene(scene2));
        button1.setTranslateX(0);
        button1.setTranslateY(430);

        StackPane layout1 = new StackPane();
        Image img = new Image("helloworld/start.jpg");
        ImageView img1 = new ImageView(img);

        img1.setPreserveRatio(true);
        layout1.getChildren().addAll(label1, img1, button1);
        scene1 = new Scene(layout1, 2000, 1000);

        //SCENE 2

        final Text label2 = new Text();
        label2.setText("Right or Left?");
        label2.setFill(Color.RED);
        label2.setFont(Font.font(null, FontWeight.BOLD, 70));
        label2.setX(20);
        label2.setY(20);
        label2.setTranslateX(0);
        label2.setTranslateY(-420);

        Button button2 = new Button("NEXT");
        button2.setOnAction(e -> window.setScene(scene3));
        button2.setTranslateX(0);
        button2.setTranslateY(400);

        StackPane layout2 = new StackPane();
        Image img_2 = new Image("helloworld/2paths.jpg");
        ImageView img2 = new ImageView(img_2);

        img2.setPreserveRatio(true);

        layout2.getChildren().addAll(label2,img2, button2);
        scene2 = new Scene(layout2, 2000, 1000);

        //SCENE 3

        final Text label3 = new Text();
        label3.setText("You chose to go right! Swim or take the path?");
        label3.setFill(Color.RED);
        label3.setFont(Font.font(null, FontWeight.BOLD, 70));
        label3.setX(20);
        label3.setY(20);
        label3.setTranslateX(0);
        label3.setTranslateY(-420);

        Button button3 = new Button("Swim");
        button3.setOnAction(e -> window.setScene(scene4));
        button3.setTranslateX(0);
        button3.setTranslateY(400);

        StackPane layout3 = new StackPane();
        Image img_3 = new Image("helloworld/swimorpath.jpg");
        ImageView img3 = new ImageView(img_3);

        img3.setPreserveRatio(true);

        layout3.getChildren().addAll(label3,img3, button3);
        scene3 = new Scene(layout3, 2000, 1000);

        //SCENE 4

        final Text label4 = new Text();
        label4.setText("Hi?");
        label4.setFill(Color.RED);
        label4.setFont(Font.font(null, FontWeight.BOLD, 70));
        label4.setX(10.0f);
        label4.setY(10.0f);
        label4.setTranslateX(0);
        label4.setTranslateY(-420);

        Button button4 = new Button("BACK");
        button4.setOnAction(e -> window.setScene(scene5));
        button4.setTranslateX(0);
        button4.setTranslateY(400);

        StackPane layout4 = new StackPane();
        Image img_4 = new Image("helloworld/swim.jpg");
        ImageView img4 = new ImageView(img_4);

        img4.setPreserveRatio(true);

        layout4.getChildren().addAll(label4,img4, button4);
        scene4 = new Scene(layout4, 2000, 1000);

        //SCENE 5

        final Text label5 = new Text();
        label5.setText("Hi?");
        label5.setFill(Color.RED);
        label5.setFont(Font.font(null, FontWeight.BOLD, 70));
        label5.setX(10.0f);
        label5.setY(10.0f);
        label5.setTranslateX(0);
        label5.setTranslateY(-420);

        Button button5 = new Button("BACK");
        button5.setOnAction(e -> window.setScene(scene1));
        button5.setTranslateX(0);
        button5.setTranslateY(400);

        StackPane layout5 = new StackPane();
        Image img_5 = new Image("helloworld/prison.jpg");
        ImageView img5 = new ImageView(img_5);

        img5.setPreserveRatio(true);

        layout5.getChildren().addAll(label5,img5, button5);
        scene5 = new Scene(layout5, 2000, 1000);

        //DONT DELETE

        window.setScene(scene1);
        window.setTitle("Adventure Game");
        window.show();
    }
}
