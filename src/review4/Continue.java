package review4;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }
            System.out.println(i);
            System.out.println("HI");
            System.out.println("Bye");

        }
    }
}
