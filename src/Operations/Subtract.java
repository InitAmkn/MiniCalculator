package Operations;
/**
 * Класс, который выполняет вычитание двух чисел.
 *
 * @param a Уменьшаемое число.
 * @param b Вычитаемое число.
 * @return Результат вычитания b из a.
 */
public class Subtract extends MathOperation{
    public Subtract(double a, double b) {
        super(a, b);
    }

    @Override
    public double execute() {
        return a-b;
    }
}
