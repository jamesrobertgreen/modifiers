package uk.co.greenjam.modifiers;

import uk.co.greenjam.modifiers.packageA.ClassA;
import uk.co.greenjam.modifiers.packageA.DerivedFromClassA;
import uk.co.greenjam.modifiers.packageA.HasClassAObjects;
import uk.co.greenjam.modifiers.packageB.PackageBDerivedFromClassA;
import uk.co.greenjam.modifiers.packageB.PackageBHasClassAObjects;

public class App
{
    public static void main( String[] args )
    {
        ClassA classA = new ClassA();
        classA.OutputVariables();

        DerivedFromClassA derivedFromClassA = new DerivedFromClassA();
        derivedFromClassA.OutputVariables();

        HasClassAObjects hasClassAObjects = new HasClassAObjects();
        hasClassAObjects.outputVariables();

        PackageBDerivedFromClassA packageBDerivedFromClassA = new PackageBDerivedFromClassA();
        packageBDerivedFromClassA.OutputVariables();

        PackageBHasClassAObjects packageBHasClassAObjects = new PackageBHasClassAObjects();
        packageBHasClassAObjects.outputVariables();
    }
}
