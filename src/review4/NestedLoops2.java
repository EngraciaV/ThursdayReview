package review4;

public class NestedLoops2 {
    public static void main(String[] args) {

        System.out.println("what is the output??");

        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if(i == 2){
                    continue;
                }
                System.out.println("HELLO");

            }
            System.out.println("Bye");
        }
    }
}
