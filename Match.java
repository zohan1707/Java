import java.util.Scanner;

public class Match {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ararat(n));

    }


    public static int ararat(int n) {
        if (n%2==0){
            System.out.println("Ввы ввели четное число " + n);
        }else if (n%2==1){
            System.out.println("Вы ввели не четное число " +n);}
        return n;
    }
}



