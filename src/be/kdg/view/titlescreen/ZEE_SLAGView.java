package be.kdg.view.titlescreen;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Window;

public class ZEE_SLAGView extends GridPane {

    private Window startScreen;
    private Button singleplayer;
    private Button multiplayer;
    private Label title;
    private ImageView leftImage;
    private ImageView rightImage;

    public ZEE_SLAGView () {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.singleplayer = new Button("singleplayer");
        this.multiplayer = new Button("multiplayer");
        this.title = new Label("Ready, aim, fire! Battleships");
        this.leftImage = new ImageView(new Image("/SovietSide.png"));
        this.rightImage = new ImageView(new Image("/AmericanSide.png"));
    }
    private void layoutNodes() {
        //this.setLeft(leftImage);
        this.add(leftImage,0,0,1,3);
        this.add(rightImage,2,0,1,3);
        this.add(title,1,0);
        this.add(singleplayer,1,1);
        this.add(multiplayer,1,2);
        this.title.setAlignment(Pos.TOP_CENTER);
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(25);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(50);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(25);
        this.getColumnConstraints().addAll(column1,column2,column3);
       RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(50);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(25);
        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(25);
        this.getRowConstraints().addAll(row1,row2,row3);

        GridPane.setConstraints(title,1,0,1,1,HPos.CENTER,VPos.CENTER);
        GridPane.setConstraints(singleplayer,1,1,1,1,HPos.CENTER,VPos.CENTER);
        GridPane.setConstraints(multiplayer,1,2,1,1,HPos.CENTER,VPos.TOP);

        this.setBackground(new Background(new BackgroundImage(new Image("/BackgroundImage.png"),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
        this.setPadding(new Insets(10));
        this.leftImage.setFitWidth(400);
        this.leftImage.setFitHeight(1000);
        this.rightImage.setFitWidth(400);
        this.rightImage.setFitHeight(1000);
        this.title.setFont(new Font("Times New Roman",60));
        this.title.setTextFill(Color.DARKRED);
        this.title.setBorder(new Border(new BorderStroke(Color.DARKRED,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,new BorderWidths(5))));
        this.title.setBackground(new Background(new BackgroundFill(Color.NAVY,CornerRadii.EMPTY,Insets.EMPTY)));
        this.singleplayer.setPrefWidth(400);
        this.singleplayer.setPrefHeight(90);
        this.singleplayer.setBackground(new Background(new BackgroundFill(Color.NAVY,CornerRadii.EMPTY,Insets.EMPTY)));
        this.singleplayer.setFont(new Font("Times New Roman",30));
        this.singleplayer.setTextFill(Color.DARKRED);
        this.multiplayer.setPrefWidth(400);
        this.multiplayer.setPrefHeight(90);
        this.multiplayer.setBackground(new Background(new BackgroundFill(Color.NAVY,CornerRadii.EMPTY,Insets.EMPTY)));
        this.multiplayer.setFont(new Font("Times New Roman",30));
        this.multiplayer.setTextFill(Color.DARKRED);
    }
}
