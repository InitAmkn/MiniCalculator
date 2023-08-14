import Operations.*;

public class Command {

    MathOperation mathOperation;

    public double execute(double numberOne, double numberTwo, String operation) {
        try {
            OperationsEnum operations = OperationsEnum.getByShortName(operation);
            switch (operations) {
                case ADD -> mathOperation = new Add(numberOne, numberTwo);
                case SUBTRACT -> mathOperation = new Subtract(numberOne, numberTwo);
                case MULTIPLY -> mathOperation = new Multiply(numberOne, numberTwo);
                case DIVIDE -> mathOperation = new Divide(numberOne, numberTwo);
                default -> throw new InvalidOperationException("Данной команды не существует");
            }

        } catch (InvalidOperationException e) {
            System.out.println(e.getMessage());
        }
        return mathOperation.execute();
    }
}


