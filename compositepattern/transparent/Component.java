package main.systemdesignpattern.compositepattern.transparent;


public interface Component {
    void showDetails(String indentation);
    void addComponent(Component component);
    void removeComponent(Component component);
}
