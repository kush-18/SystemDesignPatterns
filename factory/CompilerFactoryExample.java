package main.systemdesignpattern.factory;

import main.systemdesignpattern.factory.compilercreator.Compiler;
import main.systemdesignpattern.factory.compilercreator.CppCompiler;
import main.systemdesignpattern.factory.factorybuilder.CompilerFactory;
import main.systemdesignpattern.factory.factorybuilder.CppCompilerFactory;

public class CompilerFactoryExample {
    static void main(String[] args) {
        Compiler compiler = new CppCompilerFactory().createCompiler();
        System.out.println(compiler.compile("KUSH"));
    }
}
