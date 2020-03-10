package be.kdg.view.titlescreen;

import be.kdg.model.ZEE_SLAGModel;
import be.kdg.view.pregamelobby.PreGameLobbyPresenter;
import be.kdg.view.pregamelobby.PreGameLobbyView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ZEE_SLAGPresenter {
    private ZEE_SLAGModel model;
    private ZEE_SLAGView view;
    public ZEE_SLAGPresenter(
            ZEE_SLAGModel model,
            ZEE_SLAGView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }
    private void addEventHandlers() {
    view.getSingleplayer().setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            PreGameLobbyView preGLView = new PreGameLobbyView();
            PreGameLobbyPresenter preGLPresenter = new PreGameLobbyPresenter(model,preGLView);
            Stage toevoegenStage = new Stage();
            toevoegenStage.initOwner(view.getScene().getWindow());
            toevoegenStage.initModality(Modality.APPLICATION_MODAL);
            toevoegenStage.setScene(new Scene(preGLView));
            toevoegenStage.showAndWait();
        }
    });
    view.getMultiplayer().setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            PreGameLobbyView preGLView = new PreGameLobbyView();
            PreGameLobbyPresenter preGLPresenter = new PreGameLobbyPresenter(model,preGLView);
            Stage toevoegenStage = new Stage();
            toevoegenStage.initOwner(view.getScene().getWindow());
            toevoegenStage.initModality(Modality.APPLICATION_MODAL);
            toevoegenStage.setScene(new Scene(preGLView));
            toevoegenStage.showAndWait();
        }
    });
    }
    private void updateView() {
// Vult de view met data uit model
    }

}
