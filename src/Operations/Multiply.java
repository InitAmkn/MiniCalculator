package Operations;
/**
 * Класс, который выполняет умножение двух чисел.
 *
 * @param a Первый множитель.
 * @param b Второй множитель.
 * @return Результат умножения a на b.
 */
public class Multiply extends MathOperation{
    public Multiply(double a, double b) {
        super(a, b);
    }

    @Override
    public double execute() {
        return a*b;
    }
}
