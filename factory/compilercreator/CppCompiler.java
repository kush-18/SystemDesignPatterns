package main.systemdesignpattern.factory.compilercreator;

public class CppCompiler extends Compiler {
    @Override
    public String compile(String code) {
        return "Complied the string " + code + " successfully in cpp";
    }
}
