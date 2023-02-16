public class Main {
    public static void main(String[] args) {

        System.out.println("Testing sum");
        System.out.println("Case_001: 5 + 3 == 8 => " + (sum(5, 3) == 8));
        System.out.println("Case_002: 5 + 4 == 9 => " + (sum(5, 4) == 9));
        System.out.println("Case_003: 5 + 5 == 10 => " + (sum(5, 5) == 11));
    }

    static int sum(int x, int y) {
        return  x + y;
    }
}