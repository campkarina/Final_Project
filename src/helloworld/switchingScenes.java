package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class switchingScenes extends Application {

    Stage window;
    Scene scene1, scene2, scene2a, scene2b, scene3a, scene3b, scene4a, scene4b, scene5a, scene5b, scene6a, scene6b, scene7a, scene7b,
            scene8a, scene8b, scene9a, scene9b, scene10a, scene11a, scene11b, scene12a, scene12b;

    public static void main(String[] args){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        //Label label1 = new Label("Welcome to the Dora Adventure Game! Join Dora, Boots, and Map as they explore!");
        //Label label2 = new Label("Would you like to go right or left?");
        Label label2a = new Label("Ok, you went Right. Would you like to Swim or take the Path?");
        Label label2b = new Label("Ok, you went Left. Would you like #trolling or Golden Key?");
        Label label3a = new Label("Ok, you chose swim.");
        Label label3b = new Label("Ok, you chose path.");
        Label label4a = new Label("Ok, you chose prisoners.");
        Label label4b = new Label("Ok, you chose fight.");
        Label label5a = new Label("Oh no, Boots gets captured and the troll takes the golden key and locks him in the castle! You have to rescue him. Would you like Blue Roses or Red Roses?");
        Label label5b = new Label("YAY!!! You get home in time! You are a winner.");
        Label label6a = new Label("You found the golden key! You now have to find the castle. Would you like to go Northeast or Northwest?");
        Label label6b = new Label("Oh no, you didn't find Boots in time :( You lose, game over.");
        Label label7a = new Label("Oh no, you didn't find Boots in time :( You lose, game over.");
        Label label7b = new Label("You found Boots and saved him!!! You are a winner!!!");
        Label label8a = new Label("Oh no, you didn't find Boots in time :( You lose, game over.");
        Label label8b = new Label("You found Boots and saved him!!! You are a winner!!!");
        Label label9a = new Label("Oh no, you didn't find Boots in time :( You lose, game over.");
        Label label10a = new Label("Oh no, Boots gets captured and the troll takes the golden key and locks him in the castle! You have to rescue him. Would you like Blue Roses or Red Roses?");
        Label label10b = new Label("You found the golden key! You now have to find the castle. Would you like to go Northeast or Northwest?");

        //SCENE 1

        final Text label1 = new Text();
        label1.setText("Welcome to the Dora Adventure Game! Join Dora, Boots, and Map as they explore!");
        label1.setFill(Color.HOTPINK);
        label1.setFont(Font.font(null, FontWeight.BOLD, 40));
        label1.setX(10.0f);
        label1.setY(10.0f);
        label1.setTranslateX(0);
        label1.setTranslateY(-420);

        Button button1 = new Button("Start Playing!");
        button1.setOnAction(e -> window.setScene(scene2));
        button1.setTranslateY(430);

        StackPane layout1 = new StackPane();
        Image img = new Image("helloworld/start.jpg");
        ImageView img1 = new ImageView(img);

        img1.setPreserveRatio(true);
        layout1.getChildren().addAll(label1, img1, button1);
        scene1 = new Scene(layout1, 2000, 1000);

        //SCENE 2a

        final Text label2 = new Text();
        label2.setText("Would you like to go right or left?");
        label2.setFill(Color.RED);
        label2.setFont(Font.font(null, FontWeight.BOLD, 70));
        label2.setX(20);
        label2.setY(20);
        label2.setTranslateX(0);
        label2.setTranslateY(-420);

        Button button2a = new Button("Right");
        button2a.setOnAction(f -> window.setScene(scene2a));
        button2a.setTranslateX(40);
        button2a.setTranslateY(420);

        Button button2b = new Button("Left");
        button2b.setOnAction(f -> window.setScene(scene2b));
        button2b.setTranslateX(-40);
        button2b.setTranslateY(420);

        StackPane layout2 = new StackPane();
        Image img_2 = new Image("helloworld/2paths.jpg");
        ImageView img2 = new ImageView(img_2);

        img2.setPreserveRatio(true);
        layout2.getChildren().addAll(label2,img2, button2a, button2b);
        scene2 = new Scene(layout2, 2000, 1000);


        //Button 3a
        Button button3a = new Button("Swim");
        button3a.setOnAction(e -> window.setScene(scene3a));
        button3a.setTranslateX(40);
        button3a.setTranslateY(40);
        //Button 4a
        Button button4a = new Button("Prisoners");
        button4a.setOnAction(e -> window.setScene(scene4a));
        button4a.setTranslateX(40);
        button4a.setTranslateY(40);
        //Button 5a
        Button button5a = new Button("Golden Key");
        button5a.setOnAction(e -> window.setScene(scene5a));
        button5a.setTranslateX(40);
        button5a.setTranslateY(40);
        //Button 6a
        Button button6a = new Button("Blue Roses");
        button6a.setOnAction(e -> window.setScene(scene6a));
        button6a.setTranslateX(40);
        button6a.setTranslateY(40);
        //Button 7a
        Button button7a = new Button("Northwest");
        button7a.setOnAction(e -> window.setScene(scene7a));
        button7a.setTranslateX(40);
        button7a.setTranslateY(40);
        //Button 8a
        Button button8a = new Button("End Game");
        button8a.setOnAction(e -> window.setScene(scene1));
        button8a.setTranslateY(40);
        //Layout 7a - IF they choose Northwest
        StackPane layout7a = new StackPane();
        layout7a.getChildren().addAll(label7a, button8a);
        scene7a = new Scene(layout7a, 600, 300);
        //Button 7b
        Button button7b = new Button("Northeast");
        button7b.setOnAction(e -> window.setScene(scene7b));
        button7b.setTranslateX(-40);
        button7b.setTranslateY(40);
        //Button 8b
        Button button8b = new Button("End Game");
        button8b.setOnAction(e -> window.setScene(scene1));
        button8b.setTranslateY(40);
        //Layout 7b - IF they choose Northeast
        StackPane layout7b = new StackPane();
        layout7b.getChildren().addAll(label7b, button8b);
        scene7b = new Scene(layout7b, 600, 300);
        //Layout 6a - IF they choose Blue Roses
        StackPane layout6a = new StackPane();
        layout6a.getChildren().addAll(label6a, button7a, button7b);
        scene6a = new Scene(layout6a, 600, 300);
        //Button 6b
        Button button6b = new Button("Red Roses");
        button6b.setOnAction(e -> window.setScene(scene6b));
        button6b.setTranslateX(-40);
        button6b.setTranslateY(40);
        //Layout 6b
        StackPane layout6b = new StackPane();
        layout6b.getChildren().addAll(label6b);
        scene6b = new Scene(layout6b, 600, 300);
        //Layout 5a - IF they choose Golden Key
        StackPane layout5a = new StackPane();
        layout5a.getChildren().addAll(label5a, button6a, button6b);
        scene5a = new Scene(layout5a, 600, 300);
        //Button 5b
        Button button5b = new Button("#Trolling");
        button5b.setOnAction(e -> window.setScene(scene5b));
        button5b.setTranslateX(-40);
        button5b.setTranslateY(40);
        //Button 9a
        Button button9a = new Button("End Game");
        button9a.setOnAction(e -> window.setScene(scene1));
        button9a.setTranslateY(40);
        //Layout 5b - IF they choose #Trolling
        StackPane layout5b = new StackPane();
        layout5b.getChildren().addAll(label5b, button9a);
        scene5b = new Scene(layout5b, 600, 300);
        //Layout 4a - IF they choose Prisoners
        StackPane layout4a = new StackPane();
        layout4a.getChildren().addAll(label4a, button5a, button5b);
        scene4a = new Scene(layout4a, 600, 300);

        //Button 4b
        Button button4b = new Button("Fight");
        button4b.setOnAction(e -> window.setScene(scene4b));
        button4b.setTranslateX(-40);
        button4b.setTranslateY(40);
        //Button 10a
        Button button10a = new Button("Blue Roses");
        button10a.setOnAction(e -> window.setScene(scene8a));
        button10a.setTranslateX(40);
        button10a.setTranslateY(40);
        //Button 11a
        Button button11a = new Button("Northwest");
        button11a.setOnAction(e -> window.setScene(scene9a));
        button11a.setTranslateX(40);
        button11a.setTranslateY(40);
        //Button 11b
        Button button11b = new Button("Northeast");
        button11b.setOnAction(e -> window.setScene(scene9b));
        button11b.setTranslateX(-40);
        button11b.setTranslateY(40);
        //Layout 10a
        StackPane layout10a = new StackPane();
        layout10a.getChildren().addAll(label6a, button11a, button11b);
        scene8a = new Scene(layout10a, 600, 300);
        //Button 12a
        Button button12a = new Button("End Game");
        button12a.setOnAction(e -> window.setScene(scene1));
        button12a.setTranslateY(40);
        //Layout 12a - IF they choose Northwest
        StackPane layout12a = new StackPane();
        layout12a.getChildren().addAll(label8a, button12a);
        scene9a = new Scene(layout12a, 600, 300);
        //Button 12b
        Button button12b = new Button("End Game");
        button12b.setOnAction(e -> window.setScene(scene1));
        button12b.setTranslateY(40);
        //Layout 12b - IF they choose Northeast
        StackPane layout12b = new StackPane();
        layout12b.getChildren().addAll(label9a, button12b);
        scene9b = new Scene(layout12b, 600, 300);
        //Button 10b
        Button button10b = new Button("Red Roses");
        button10b.setOnAction(e -> window.setScene(scene8b));
        button10b.setTranslateX(-40);
        button10b.setTranslateY(40);
        //Button 13a
        Button button13a = new Button("End Game");
        button13a.setOnAction(e -> window.setScene(scene1));
        button13a.setTranslateY(40);
        //Layout 10b - IF they choose Red Roses
        StackPane layout10b = new StackPane();
        layout10b.getChildren().addAll(label8b, button13a);
        scene10a = new Scene(layout10b, 600, 300);
        //Layout 4b -IF they choose Fight
        StackPane layout4b = new StackPane();
        layout4b.getChildren().addAll(label4b, button10a, button10b);
        scene4b = new Scene(layout4b, 600, 300);

        //Layout 3a - IF they choose swim
        StackPane layout3a = new StackPane();
        layout3a.getChildren().addAll(label3a, button4a, button4b);
        scene3a = new Scene(layout3a, 600, 300);

        //Button 3b
        Button button3b = new Button("Path");
        button3b.setOnAction(e -> window.setScene(scene3b));
        button3b.setTranslateX(-40);
        button3b.setTranslateY(40);
        //Button 14a
        Button button14a = new Button("Golden Key");
        button14a.setOnAction(e -> window.setScene(scene11a));
        button14a.setTranslateX(-40);
        button14a.setTranslateY(40);
        //Button 14b
        Button button14b = new Button("#Trolling");
        button14b.setOnAction(e -> window.setScene(scene11a));
        button14b.setTranslateX(40);
        button14b.setTranslateY(40);
        //Layout 3b - IF they choose Path
        StackPane layout3b = new StackPane();
        layout3b.getChildren().addAll(label3b, button14a, button14b);
        scene3b = new Scene(layout3b, 600, 300);
        //Button 15a
        Button button15a = new Button("Blue Roses");
        button15a.setOnAction(e -> window.setScene(scene11a));
        button15a.setTranslateX(-40);
        button15a.setTranslateY(40);
        //Button 15b
        Button button15b = new Button("Red Roses");
        button15b.setOnAction(e -> window.setScene(scene11a));
        button15b.setTranslateX(40);
        button15b.setTranslateY(40);
        //Layout 11a - IF they choose Golden Key
        StackPane layout11a = new StackPane();
        layout11a.getChildren().addAll(label10a, button15a, button15b);
        scene11a = new Scene(layout11a, 600, 300);
        //Layout 2a - IF they choose Right
        StackPane layout2a = new StackPane();
        layout2a.getChildren().addAll(label2a, button3a, button3b);
        scene2a = new Scene(layout2a, 600, 300);

        //Layout 2b - IF they choose Left
        StackPane layout2b = new StackPane();
        layout2b.getChildren().addAll(label2b);
        scene2b = new Scene(layout2b, 600, 300);

        window.setScene(scene1);
        window.setTitle("Dora's Adventure Game!");
        window.show();

    }
}