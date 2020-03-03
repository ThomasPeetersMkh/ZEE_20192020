package be.kdg.view.pregamelobby;

import be.kdg.model.ZEE_SLAGModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class PreGameLobbyPresenter {
    private ZEE_SLAGModel model;
    private PreGameLobbyView view;

    public PreGameLobbyPresenter(ZEE_SLAGModel model, PreGameLobbyView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        view.getBoardsizeoptions().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                updateView();
            }
        });
    }


    private void updateView() {
        this.view.drawRaster(this.view.getBoardsize());
    }

}
