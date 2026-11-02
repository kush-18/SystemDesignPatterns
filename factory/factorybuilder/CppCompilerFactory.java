package main.systemdesignpattern.factory.factorybuilder;

import main.systemdesignpattern.factory.compilercreator.Compiler;
import main.systemdesignpattern.factory.compilercreator.CppCompiler;

public class CppCompilerFactory implements CompilerFactory {
    @Override
    public Compiler createCompiler() {
        return new CppCompiler();
    }
}
