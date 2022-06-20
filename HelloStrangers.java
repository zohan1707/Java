import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a;
        a = scr.nextInt();
        scr.nextLine();
        if (a == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        if (a < 0) {
            System.out.println("Seriously? Why so negative?");
        }
        else {
            String[] names = new String[a];
            for (int i = 0; i < a; i++) {

                names[i] = scr.nextLine();

            }
            for (int i = 0; i < a; i++) {
                System.out.println("Hello, " + names[i]);
            }

        }


    }
}



