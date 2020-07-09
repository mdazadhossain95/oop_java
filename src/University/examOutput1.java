package University;

public class examOutput1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println(i + " ");
            try {
                System.out.println(1 / 0);
            } catch (Exception ex) {
                System.out.println("Hello Exception");
            }
        }
    }
}
