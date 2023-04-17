package review4;

public class Arrays {
    public static void main(String[] args) {

        int i = 10;
//we store elements based  on indexes
        int[] arr = new int[3];
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;

        //access also by indexes
        System.out.println(arr[1]);

        String[] planets= {"earth","mars","jupiter","saturn","neptune"};

        System.out.println("  Enhanced for lop");

        for(String planet: planets){
            System.out.println(planet);
        }

    }
}
