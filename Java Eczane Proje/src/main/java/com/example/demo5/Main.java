package com.example.demo5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    private static BorderPane root = new BorderPane();

    @Override
    public void start(Stage stage) throws Exception {
        HomeController hc1=new HomeController();
        hc1.atama();
        Object main = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Giris.fxml")));
        //AnchorPane homeScreen = FXMLLoader.load(getClass().getResource("Home.fxml"));
        root.setCenter((Node) main);
        //root.setCenter((Node) homeScreen);
        //root.setCenter((Node) main);
        stage.setTitle("ilaclar");
        stage.setScene(new Scene(root));
        stage.show();

    }

    public static void main(String[] args) throws FileNotFoundException {
        launch(args);


    }
    public static void setCenter(Node node){
        root.setCenter(node);
    }


    public static BorderPane getRoot() {
        return root;
    }


}

