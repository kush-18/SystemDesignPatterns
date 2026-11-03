package main.systemdesignpattern.compositepattern.safecomponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private final String folderName;
    private final List<Component> childrens;

    public Folder(String folderName) {
        this.folderName = folderName;
        this.childrens = new ArrayList<>();
    }

    public void addComponent(Component component) {
        childrens.add(component);
    }

    public void removeComponent(Component component) {
        childrens.remove(component);
    }

    @Override
    public void showDetails(String indentation) {
        System.out.println(indentation + "- Folder: " + folderName);
        for (Component component : childrens) {
            String newIndentation = indentation + "    ";
            component.showDetails(newIndentation);
        }
    }
}
