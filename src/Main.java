import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Command command = new Command();
        Parser parser;

        System.out.println(OperationsEnum.getAllShortNames());
        while (!input.equalsIgnoreCase("exit")) {
            input = scanner.nextLine();

            parser = new Parser(input);
            double result = command.execute(parser.getNumberOne(),
                    parser.getNumberTwo(), parser.getOperation());
            System.out.println(parser.getNumberOne() + " " + parser.getOperation() + " " + parser.getNumberTwo() + " = " + result);

        }
    }
}