package com.solidprinc.SRP;

public class SRP_main {
    public static void main(String[] args) {
        Text_Manipulator text_manipulator = new Text_Manipulator("Udit Raj");
        TextPrinter textPrinter = new TextPrinter(text_manipulator);
        System.out.println(text_manipulator.appendText("SRP_Code_Solid_principle_Assignment_Example"));
        textPrinter.printOutEachWordOfText();
    }
}
