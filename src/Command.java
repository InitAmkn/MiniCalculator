import Operations.*;

public class Command {

    MathOperation mathOperation;
    private double numberOne;
    private double numberTwo;
    private String operation;
    private double result;

    public Command(double numberOne, double numberTwo, String operation) throws InvalidOperationException {

        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operation = operation;
        this.result = execute();
    }

    public double execute() throws InvalidOperationException {

        OperationsEnum operations = OperationsEnum.getByShortName(operation);
        switch (operations) {
            case ADD -> mathOperation = new Add(this.numberOne, this.numberTwo);
            case SUBTRACT -> mathOperation = new Subtract(this.numberOne, this.numberTwo);
            case MULTIPLY -> mathOperation = new Multiply(this.numberOne, this.numberTwo);
            case DIVIDE -> mathOperation = new Divide(this.numberOne, this.numberTwo);
            default -> throw new InvalidOperationException("Данной команды не существует");
        }
        return mathOperation.execute();
    }

    @Override
    public String toString() {
        return numberOne + " " + operation + " " + numberTwo + " = " + result;

    }
}


