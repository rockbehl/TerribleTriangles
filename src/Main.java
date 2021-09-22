import java.util.Scanner;

public class Main {
    static int NUMBER;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        NUMBER = sc.nextInt();

        if (NUMBER % 2 == 0){
            while (NUMBER % 2 == 0) {
                System.out.println("Please enter an ODD number!");
                NUMBER = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();

        invOppTri(NUMBER);
        regularTri(NUMBER);
        System.out.println("----------- "+NUMBER+" --------------");
        invRegularTri(NUMBER);
        oppTri(NUMBER);
        System.out.println("----------- "+NUMBER+" --------------");
        equalTri(NUMBER);
        System.out.println("----------- "+NUMBER+" --------------");
        diamond(NUMBER);
        System.out.println("----------- "+NUMBER+" --------------");

        System.out.println("Number entered: "+NUMBER);

    }

    private static void regularTri(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

    }

    private static void invRegularTri(int num){

        for (int i = 0; i < num; i++) {
            for (int j = num; j >= i+1; j--) {
                System.out.print("X");
            }
            System.out.println();
        }

    }

    private static void oppTri(int num){

        for (int i = 0; i < num; i++) {
            for (int j = num; j >= i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

    }

    private static void invOppTri(int num){

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = num; j >= i+1; j--) {
                System.out.print("X");
            }
            System.out.println();
        }

    }

    private static void equalTri(int num){

        for (int i = num; i >= 1; i-= 2) {
            for (int j = num; j >= i; j-= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

       /* for (int i = 0; i <= num; i++) {

            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("X ");
            }

            System.out.println();
        }*/

    }

    private static void diamond(int num){

        for (int i = 1; i <= num; i+= 2) {
            for (int j = num; j >= i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        for (int i = num-2; i >= 1; i-= 2) {
            for (int j = num; j >= i; j-= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

    }

}
