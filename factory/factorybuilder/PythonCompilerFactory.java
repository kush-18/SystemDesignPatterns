package main.systemdesignpattern.factory.factorybuilder;

import main.systemdesignpattern.factory.compilercreator.Compiler;
import main.systemdesignpattern.factory.compilercreator.PythonCompiler;

public class PythonCompilerFactory implements CompilerFactory{
    @Override
    public Compiler createCompiler() {
        return new PythonCompiler();
    }
}
