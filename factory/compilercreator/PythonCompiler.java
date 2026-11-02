package main.systemdesignpattern.factory.compilercreator;

public class PythonCompiler extends Compiler {
    @Override
    public String compile(String code) {
        return "Complied the string" + code + "successfully in python";
    }
}
