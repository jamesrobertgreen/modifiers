package uk.co.greenjam.modifiers.packageB;

import uk.co.greenjam.modifiers.packageA.ClassA;

public class PackageBDerivedFromClassA extends ClassA{

    public void OutputVariables(){
//        System.out.println("PackageBDerivedFromClassA - private " + privateInt);
        System.out.println("PackageBDerivedFromClassA - public " + publicInt);
        System.out.println("PackageBDerivedFromClassA - protected. Accessible as derived " + protectedInt);
//        System.out.println("PackageBDerivedFromClassA - package " + packageInt);
    }

}
