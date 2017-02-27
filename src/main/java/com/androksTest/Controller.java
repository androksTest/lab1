package com.androksTest;


/**
 * Created by androks on 2/20/2017.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void process(){
        view.print(model.getValue());
    }
}
