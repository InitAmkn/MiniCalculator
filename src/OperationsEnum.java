public enum Opirations {
    ADD("+"),
    SUBTRACT("-"),
    DIVIDE("/"),
    MULTIPLY("*");
    String s;

    Opirations(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
