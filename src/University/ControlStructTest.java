package University;

public class ControlStructTest {

    public static void main(String[] args) {

        // for loop
        for (int i=1; i<= 5; i++) {
            System.out.println("hello from for");
        }

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.println("Hello from while");
            j++;
        }

        //do while loop
        int k =1;
        do{
            System.out.println("Hello from do-while");
            k++;
        }while(k <= 5);
    }
}
