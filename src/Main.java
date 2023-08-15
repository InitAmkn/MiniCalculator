import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        History history = new History();
        while (!input.equalsIgnoreCase("exit")) {
            System.out.println("Введите операцию ");
            input = scanner.nextLine();

            try {
                Parser parser = new Parser(input);

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
        scanner.close();
    }
}