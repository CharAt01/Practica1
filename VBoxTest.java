package com.example.fxjavaproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class VBoxTest extends Application {




/*
    private VBox cajaVertical;
    @Override
    public void start(Stage stage) throws IOException {
        cajaVertical = new VBox(10);
        cajaVertical.setPadding(new Insets(15));
        cajaVertical.getChildren().addAll(new Button("Boton 1"), new Button("Boton 2"), new Button("Boton 3"));

        Scene s = new Scene(cajaVertical);
        stage.setScene(s);
        stage.show();

    }*//*
    private HBox cajaHorizontal;
    @Override
    public void start(Stage stage) throws IOException {
        cajaHorizontal = new HBox(10);
        cajaHorizontal.setPadding(new Insets(15));
        cajaHorizontal.getChildren().addAll(new Button("Boton 1"), new Button("Boton 2"), new Button("Boton 3"));

        Scene s = new Scene(cajaHorizontal);
        stage.setScene(s);
        stage.show();

    }*//*
    private BorderPane raiz;
   @Override
    public void start(Stage stage) throws IOException {
        raiz = new BorderPane();
        raiz.setBottom(new Button("Bottom"));
        raiz.setLeft(new Button("Left"));
        raiz.setRight(new Button("Right"));
        raiz.setCenter(new Button("Center"));
        raiz.setTop(new Button("Top"));

        Scene s = new Scene(raiz);
        stage.setScene(s);
        stage.show();
    }*//*
   private FlowPane flow;
   @Override
   public void start(Stage stage) throws IOException {
       flow = new FlowPane();
       flow.getChildren().addAll(new Button("Boton 1"), new Button("Boton 2"), new Button("Boton 3"));
       flow.setHgap(10);

       Scene s = new Scene(flow);
       stage.setScene(s);
       stage.show();
   }*//*
   private GridPane grid;
   @Override
   public void start(Stage stage) throws IOException {
       grid = new GridPane();
       grid.setVgap(10);
       grid.setHgap(10);
       grid.add(new Button("Posición 0, 0"), 0, 0);
       grid.add(new Button("Posición 0, 1"), 0, 1);
       grid.add(new Button("Posición 0, 2"), 0, 2);
       grid.add(new Button("Posición 1, 0"), 1, 0);
       grid.add(new Button("Posición 1, 1"), 1, 1);
       grid.add(new Button("Posición 1, 2"), 1, 2);
       grid.add(new Button("Posición 2, 0"), 2, 0);
       grid.add(new Button("Posición 2, 1"), 2, 1);
       grid.add(new Button("Posición 2, 2"), 2, 2);

       Scene s = new Scene(grid);
       stage.setScene(s);
       stage.show();
   }*/
    /*
   private StackPane sp;
   @Override
   public void start(Stage stage) throws IOException {
       sp = new StackPane();
       sp.setPadding(new Insets(15));
       sp.getChildren().addAll(new Rectangle(150,150, Color.DARKBLUE), new Button("Boton StackPane"));
       Button b1, b2, b3;
       b1 = new Button("Boton 1");
       b2 = new Button("Boton 2");
       b3 = new Button("Boton 3");
       StackPane.setAlignment(b1, Pos.TOP_CENTER);
       StackPane.setAlignment(b2, Pos.TOP_LEFT);
       StackPane.setAlignment(b3, Pos.TOP_RIGHT);
       sp.getChildren().addAll(b1, b2, b3);


       Scene s = new Scene(sp);
       stage.setScene(s);
       stage.show();
   }*//*
    private TilePane tp;
    @Override
    public void start(Stage stage) throws IOException {
        tp = new TilePane();
        tp.setPrefColumns(6);
        tp.setPrefRows(4);
        for(int i=1; i<25; i++){
            tp.getChildren().add(new Button("Boton "+i));
        }

        Scene s = new Scene(tp);
        stage.setScene(s);
        stage.show();
    }*/

    private AnchorPane anchor;
    @Override
    public void start(Stage stage) throws IOException {
        anchor = new AnchorPane();
        Button b2 = new Button("Boton 2");
        Button b3 = new Button("Boton 3");
        AnchorPane.setTopAnchor(b2, 10.0);
        AnchorPane.setRightAnchor(b2, 10.0);

        AnchorPane.setBottomAnchor(b3, 20.0);
        AnchorPane.setLeftAnchor(b3, 20.0);

        anchor.getChildren().addAll(new Button("Boton 1"), b2, b3);

        Scene s = new Scene(anchor);
        stage.setScene(s);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}