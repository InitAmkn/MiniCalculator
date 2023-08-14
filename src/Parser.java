import jdk.dynalink.Operation;

import java.util.Arrays;

public class Parser {
    private double numberOne;
    private double numberTwo;
    private String operation;

    public Parser(String input) {
        parsing(input);
    }

    public void parsing(String input) {
        try {
            String[] arguments = parsingToTheArray(input);
            if (arguments.length != 2)
                throw new InvalidArgumentsException("Неправильно указаны аргументы");

            this.numberOne = Double.parseDouble(arguments[0]);
            this.numberTwo = Double.parseDouble(arguments[1]);

        } catch (InvalidOperationException | InvalidArgumentsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public String[] parsingToTheArray(String input) throws InvalidOperationException {

        input = input.replace(" ", "");
        for (String item : OperationsEnum.getAllShortNames()) {
            if (input.contains(item)) {
                this.operation = item;
                return input.split("\\"+item);
            }
        }
        throw new InvalidOperationException("Неправильно указаны аргументы");
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
