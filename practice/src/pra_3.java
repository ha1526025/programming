public class pra_3 {

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "の2乗は" + square(i));
        }
    }
}


