package example.collura.colluramvp.mvp.base;


public abstract  class BasePresenter <T> {

    protected T view;

    public BasePresenter (T view) {
        this.view = view;
    }
}
