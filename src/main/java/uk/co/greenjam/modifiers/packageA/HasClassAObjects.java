package uk.co.greenjam.modifiers.packageA;

public class HasClassAObjects {
    private ClassA classA = null;

    public HasClassAObjects() {
        classA = new ClassA();
    }

    public void outputVariables(){
//        System.out.println("HasClassAObjects - private " + classA.privateInt);
        System.out.println("HasClassAObjects - public " + classA.publicInt);
        System.out.println("HasClassAObjects - protected. Accessible as in the same package " + classA.protectedInt);
        System.out.println("HasClassAObjects - package " + classA.packageInt);
    }

}
