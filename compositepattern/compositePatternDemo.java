package main.systemdesignpattern.compositepattern;

import main.systemdesignpattern.compositepattern.safecomponent.Component;
import main.systemdesignpattern.compositepattern.safecomponent.File;
import main.systemdesignpattern.compositepattern.safecomponent.Folder;

public class compositePatternDemo {
    static void main(String[] args) {
        Folder desktopFolder = new Folder("Desktop");
        Folder documentFolder = new Folder("Doc");
        Component resume = new File("resume.txt");
        Component lecture = new File("lecture.mp4");

        documentFolder.addComponent(resume);
        documentFolder.addComponent(lecture);

        desktopFolder.addComponent(documentFolder);
        desktopFolder.showDetails(" ");
    }
}
