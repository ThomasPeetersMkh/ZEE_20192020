package be.kdg;

import be.kdg.model.ZEE_SLAGModel;
import be.kdg.view.pregamelobby.PreGameLobbyPresenter;
import be.kdg.view.pregamelobby.PreGameLobbyView;
import be.kdg.view.titlescreen.ZEE_SLAGPresenter;
import be.kdg.view.titlescreen.ZEE_SLAGView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        ZEE_SLAGModel model =
                new ZEE_SLAGModel();
        PreGameLobbyView view =
                new PreGameLobbyView();
        new PreGameLobbyPresenter(model, view);
        primaryStage.setScene(new Scene(view));
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}

