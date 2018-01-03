package uk.co.greenjam.modifiers.packageA;

public class DerivedFromClassA extends ClassA{

    public void OutputVariables(){
//        System.out.println("DerivedFromClassA - private " + privateInt);
        System.out.println("DerivedFromClassA - public " + publicInt);
        System.out.println("DerivedFromClassA - protected. Accessible as derived and in the same package " + protectedInt);
        System.out.println("DerivedFromClassA - package " + packageInt);
    }

}
