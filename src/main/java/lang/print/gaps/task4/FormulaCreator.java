package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        byte nine = 9;
        char a = 'a';
        byte five = 5;
        char b = 'b';
        byte two = 2;
        byte seven = 7;
        byte four = 4;
        double formula = (nine * a * a - five * b + two + a - seven) * ((double) (a + b - four * a + b) / (two));
        System.out.println(formula);
    }
}
