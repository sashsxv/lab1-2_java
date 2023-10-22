public class Equation {

    public static double solveEquation24() {
        double a = 0.345;
        double b = -2.25;
        double c = 2.65;
        double d = 3.99;
        double y = (Math.cos(b) + Math.sin(Math.sqrt(a))) / (2 * Math.log10(c) + Math.exp(d));
        return y;
    }


    public static double solveEquation15() {
        double a = 1.25;
        double b = 3.09;
        double c = 4.25;
        double d = 0.56;
        
        // Math.acos(b) = NaN не рахується навіть через калькулятори

        double y = (2 * Math.sqrt((Math.tan(a) / Math.abs(Math.acos(b))))) - (3 * Math.pow(Math.exp(c - a) * Math.sinh(d), 1 / 3));
        return y;
    }

    public static double solveEquation6() {
        double a = -1.23;
        double b = -0.34;
        double c = 0.707;
        double d = 2.312;

        double y = 3 * (Math.log10(Math.abs(b / a)) + Math.sqrt(Math.sin(c) + Math.exp(d)));
        return y;
    }

    public static void main(String[] args) {

        double y1 = solveEquation24();
        double y2 = solveEquation15();
        double y3 = solveEquation6();

        System.out.println("Задача №25::: y = " + y1);
        System.out.println("Задача №15::: y = " + y2);
        System.out.println("Задача №6::: y = " + y3);
    }
}