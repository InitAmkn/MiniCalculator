public class MathOperation {

    /**
     * Метод, который выполняет сложение двух чисел.
     *
     * @param a Первое число для сложения.
     * @param b Второе число для сложения.
     * @return Результат сложения a и b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Метод, который выполняет вычитание двух чисел.
     *
     * @param a Уменьшаемое число.
     * @param b Вычитаемое число.
     * @return Результат вычитания b из a.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Метод, который выполняет умножение двух чисел.
     *
     * @param a Первый множитель.
     * @param b Второй множитель.
     * @return Результат умножения a на b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Метод, который выполняет деление двух чисел.
     *
     * @param a Делимое число.
     * @param b Делитель.
     * @return Результат деления a на b.
     * @throws ArithmeticException Если делитель b равен нулю.
     */
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return a / b;
    }
}
