public class PowersOfNumbers {

    public static void main(String[] args) {
        double a1 = 1;
        double a2 = 2;
        double a3 = 3;
        double a4 = 4;
        double a5 = 5;
        for (int i = 2; i <= 4; i++) {
            System.out.println(a1 + " у степені " + i + " дорівнює " + PowerA234(a1, i));
        }
        for (int i = 2; i <= 4; i++) {
            System.out.println(a2 + " у степені " + i + " дорівнює " + PowerA234(a2, i));
        }
        for (int i = 2; i <= 4; i++) {
            System.out.println(a3 + " у степені " + i + " дорівнює " + PowerA234(a3, i));
        }
        for (int i = 2; i <= 4; i++) {
            System.out.println(a4 + " у степені " + i + " дорівнює " + PowerA234(a4, i));
        }
        for (int i = 2; i <= 4; i++) {
            System.out.println(a5 + " у степені " + i + " дорівнює " + PowerA234(a5, i));
        }

    }

    static double PowerA234(double a, int n) {
        double b = Math.pow(a, n);
        return b;
    }
}
