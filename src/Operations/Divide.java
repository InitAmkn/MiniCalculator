package Operations;
/**
 * Класс, который выполняет деление двух чисел.
 *
 * @param a Делимое число.
 * @param b Делитель.
 * @return Результат деления a на b.
 * @throws ArithmeticException Если делитель b равен нулю.
 */
public class Divide extends MathOperation{


    public Divide(double a, double b) {
        super(a, b);
    }

    public double execute () throws ArithmeticException {
       try {
           if (b == 0) {
               throw new ArithmeticException("Деление на ноль недопустимо.");
           }
       }
       catch (ArithmeticException e)
       {
           System.out.println(e.getMessage());
       }
        return a / b;

    }
}
