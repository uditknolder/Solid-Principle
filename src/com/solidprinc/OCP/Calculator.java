package com.solidprinc.OCP;

public class Calculator {
    public void calculate(Operation operation) throws Exception{
        if(operation == null){
            throw new Exception(" operation Can not be perform");
        }

        operation.perform();
    }
}
