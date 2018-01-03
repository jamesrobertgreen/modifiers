package uk.co.greenjam.modifiers.packageA;

public class ClassA {
    private int privateInt = 1;
    public int publicInt = 2;
    protected int protectedInt = 3;
    int packageInt = 4;

    public void OutputVariables(){
        System.out.println("ClassA - private " + privateInt);
        System.out.println("ClassA - public " + publicInt);
        System.out.println("ClassA - protected " + protectedInt);
        System.out.println("ClassA - package " + packageInt);
    }
}
