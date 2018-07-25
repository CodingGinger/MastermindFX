package sample;

import javafx.scene.Node;

public class BaseController implements ControllerInterface {

    private Node view;


    @Override
    public void setView(Node view) {
        this.view = view;
    }

    @Override
    public void Show() {
        PreShowing();
        Main.getNavigation().Show(this );
        PostShowing();
    }

    @Override
    public Node getView() {
        return view;
    }

    private void PreShowing() {
    }

    private void PostShowing() {
    }
}
