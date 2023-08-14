package Operations;

import jdk.dynalink.Operation;

public class Parser {
    private double numberOne;
    private double numberTwo;
    private String operation;

    public Parser(String input)
    {
        String[] parameters = input.split(" ");

    }

    public void parsing(String input){

        input = input.replace(" ","");

    }
    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public String getOperation() {
        return operation;
    }
}
