package be.kdg.view.pregamelobby;

import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PreGameLobbyView extends VBox{
    private Label titel;
    private HBox hb1;
    private HBox hb2;
    private Canvas bordpv;
    private Label boardsize;
    private Label custom;
    private ComboBox boardsizeoptions;
    private TextField tekstveld;
    private Label labelspeler1;
    private Label labelspeler2;
    private Label highscorespeler1;
    private Label highscorespeler2;

    public PreGameLobbyView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.titel = new Label("Pregame Lobby");
        this.hb1 = new HBox();
        this.hb2 = new HBox();
        this.bordpv = new Canvas();
        this.boardsize = new Label("Board Size");
        this.custom = new Label("Custom");
        this.boardsizeoptions = new ComboBox(FXCollections.observableArrayList(3, 4, 5, 6, 7, 8));
        this.boardsizeoptions.getSelectionModel().selectFirst();
        this.tekstveld = new TextField();
        this.labelspeler1 = new Label("High Score");
        this.labelspeler2 = new Label("High Score");
        this.highscorespeler1 = new Label();
        this.highscorespeler2 = new Label();


    }
    private void layoutNodes() {
        hb1.getChildren().addAll(boardsize, boardsizeoptions, custom, tekstveld);
        this.custom.setAlignment(Pos.CENTER_RIGHT);
        hb2.getChildren().addAll(labelspeler1, highscorespeler1, labelspeler2, highscorespeler2);
        this.labelspeler2.setAlignment(Pos.CENTER_RIGHT);
        this.getChildren().addAll(titel,hb1,hb2,bordpv);
        bordpv.setHeight(100);
        bordpv.setWidth(100);

    }
    void drawRaster(int boardsize) {

        double rowHeight = bordpv.getHeight()/boardsize;
        double columnWidth = bordpv.getWidth()/boardsize;
        GraphicsContext gc = bordpv.getGraphicsContext2D();
        gc.clearRect(0, 0, bordpv.getWidth(), bordpv.getHeight());
        for(int i = 1; i<=boardsize;i++){
            gc.strokeLine(0,rowHeight*i,bordpv.getWidth(),rowHeight*i);
            System.out.println();
        }
        for(int i = 1; i<=boardsize;i++){
            gc.strokeLine(columnWidth*i,0,columnWidth*i,bordpv.getHeight());
        }

    }

    public int getBoardsize() {return (int) this.boardsizeoptions.getValue();
    }

    public ComboBox getBoardsizeoptions() {
        return boardsizeoptions;
    }

    public Canvas getBordpv() {
        return bordpv;
    }
}
