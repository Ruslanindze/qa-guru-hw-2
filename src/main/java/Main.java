public class Main {
    public static void main(String... args) {

        System.out.println("Testing sum");
        System.out.println("Case_001: 25 + 13 == 38 => " + (sum(5, 3) == 38));
        System.out.println("Case_002: 5 + 4 == 9 => " + (sum(15, 4) == 19));
        System.out.println("Case_003: 15 + -5 == 10 => " + (sum(15, -5) == 10));
    }

    static int sum(int x, int y) {
        return  x + y;
    }
}
