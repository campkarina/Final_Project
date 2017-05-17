package helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Adventure Game");

        Button btn1 = new Button("I would like to go left");
        btn1.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                System.out.println("YAY! You survived! :) ");
            }
        });
        btn1.setTranslateX(0);
        btn1.setTranslateY(20);

        Button btn2 = new Button("I would like to go right");
        btn2.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                System.out.println("Oh no! You have been eaten :( ");
            }
        });
        btn2.setTranslateX(0);
        btn2.setTranslateY(-20);

        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
