package main.systemdesignpattern.compositepattern.transparent;

public class File implements Component {
    private final String fileName;
    public File(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void showDetails(String indentation) {
        System.out.println(indentation + "- File: " + fileName);
    }

    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException("Cannot add to a File");
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException("Cannot add to a File");
    }
}

