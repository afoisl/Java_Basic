package loop.ex;

public class Ex {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < rows-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
