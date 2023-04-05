
import java.util.Scanner;


public class MainProgram {
    public static void main(String[] args){
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if(number == 1){
            System.out.println(Calculations.list(empCorp));

        }
    }
}
