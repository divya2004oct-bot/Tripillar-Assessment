package mod2;

public class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum (int): " + add(5, 10));
        System.out.println("Sum (double): " + add(5.5, 4.5));
    }
}
