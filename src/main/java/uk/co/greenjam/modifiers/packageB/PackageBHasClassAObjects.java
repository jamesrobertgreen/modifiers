package uk.co.greenjam.modifiers.packageB;

import uk.co.greenjam.modifiers.packageA.ClassA;

public class PackageBHasClassAObjects {
    ClassA classA = null;

    public PackageBHasClassAObjects(){
        classA = new ClassA();
    }

    public void outputVariables(){
//        System.out.println("PackageBHasClassAObjects - private " + classA.privateInt);
        System.out.println("PackageBHasClassAObjects - public " + classA.publicInt);
//        System.out.println("PackageBHasClassAObjects - protected " + classA.protectedInt);
//        System.out.println("PackageBHasClassAObjects - package " + classA.packageInt);
    }

}
