import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập số vào đây");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();
        if (number % 2 == 0) {
            System.out.println("số "+number+" là số chẵn");
        }
        else {
            System.out.println("Số "+number+" là số lẻ");
        }

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y;
        y = (x>0) ?  1: -1;
        System.out.println(y);
    }
}