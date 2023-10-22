public class Equation{

    public static double solve(double a, double b, double c, double d) {
        double tg = Math.tan(a);
        double sh = Math.sinh(b);
        double ln = Math.log(Math.abs(d + c));

        // Числитель
        double numerator = Math.pow(tg, 1 / c);

        // Знаменник
        double denominator = 2 - sh / ln;

        // Результат
        double y = numerator / denominator;

        return y;
    }

    public static void main(String[] args) {
        double a = 1.27;
        double b = 10.99;
        double d = 4;
        double c = -25.32;

        double y = solve(a, b, c, d);

        System.out.println("y = " + y);
    }
}