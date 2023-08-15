import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        Parser parser;
        History history = new History();
        while (!input.equalsIgnoreCase("exit")) {
            System.out.println("Введите операцию ");
            input = scanner.nextLine();

            try {
                parser = new Parser(input);

                Command command = new Command(parser.getNumberOne(),
                        parser.getNumberTwo(), parser.getOperation());
                history.save(command);
                System.out.println(history);
                System.out.println(command);

            } catch (InvalidOperationException |
                     InvalidArgumentsException |
                     NumberFormatException |
                     ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}