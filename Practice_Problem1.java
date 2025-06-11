
public class Practice_Problem1 {

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double averageOfThreeNumbers(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static void main(String[] args) {
        System.out.println(addTwoNumbers(5, 10));
        System.out.println(celsiusToFahrenheit(25));
        System.out.println(areaOfCircle(7));
        System.out.println(calculateSimpleInterest(1000, 5, 2));
        System.out.println(perimeterOfRectangle(5, 10));
        System.out.println(power(2, 3));
        System.out.println(averageOfThreeNumbers(3, 4, 5));
        System.out.println(kilometersToMiles(10));
        System.out.println(volumeOfCylinder(3, 5));
        System.out.println(areaOfCircle(7));
        System.out.println(celsiusToFahrenheit(30));
    }
}