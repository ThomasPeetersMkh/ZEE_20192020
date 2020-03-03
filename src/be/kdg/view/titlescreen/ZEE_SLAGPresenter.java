package be.kdg.view.titlescreen;

import be.kdg.model.ZEE_SLAGModel;

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
// Koppelt event handlers (anon. inner klassen)
// aan de controls uit de view.
// Event handlers: roepen methodes aan uit het
// model en zorgen voor een update van de view.
    }
    private void updateView() {
// Vult de view met data uit model
    }

}
