package review2;

public class AnotherNestdIf {

    public static void main(String[] args) {

        /*
        If you have a covid vaccine yes or not
        if dose = 1 => you need 2 to be fully vacinated
        if dose =2 -> you are fully vacinated
        if dose =3 -> you fully and have booster
         */

        boolean vaccine = true;
        int dose = 1;

        if (vaccine){

            if (dose == 1){
                System.out.println("you need second dose");
            } else if (dose == 2) {
                System.out.println("You are fully vaccinated");
            } else if (dose == 3){
                System.out.println("You are fully vaccinated with booster");
            }
        }
    }
}
