package Operations;
/**
 * Класс, который выполняет сложение двух чисел.
 *
 * @param a Первое число для сложения.
 * @param b Второе число для сложения.
 * @return Результат сложения a и b.
 */
public class Add extends MathOperation{


    public Add(double a, double b) {
        super(a, b);
    }

    public double execute() {
        return a + b;
    }
}
