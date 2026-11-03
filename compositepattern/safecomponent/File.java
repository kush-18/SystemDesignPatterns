package main.systemdesignpattern.compositepattern.safecomponent;

public class File implements Component{
    private final String fileName;
    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showDetails(String indentation) {
        System.out.println(indentation + "- File: " + fileName);
    }
}
