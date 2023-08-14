package Operations;

public abstract class MathOperation {


    protected double a;
    protected double b;
    public abstract double execute();
    public MathOperation(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
}
