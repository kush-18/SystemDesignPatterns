package main.systemdesignpattern.factory.factorybuilder;

import main.systemdesignpattern.factory.compilercreator.Compiler;
import main.systemdesignpattern.factory.compilercreator.JavaCompiler;

public class JavaCompilerFactory implements CompilerFactory{
    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }
}
