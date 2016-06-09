import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            int Flag = 0;
            Scanner ReadIn = new Scanner(System.in);
            Stack NewStack = new Stack(8);

            while(true){
                System.out.println("Список команд: " +
                        "\n0 - pop" +
                        "\n1 - push"+
                        "\n2 - вывести весь стек" +
                        "\n3 - выйти из программы");
                System.out.println("/----------------------------------/");
                System.out.print("Выберите команду: ");
                Flag = ReadIn.nextInt();
                switch (Flag) {
                    case 0:
                        NewStack.Pop();
                        break;
                    case 1:
                        System.out.print("Введите число, которое будет положено в стек: ");
                        NewStack.Push(ReadIn.nextInt());
                        break;
                    case 2:
                        NewStack.GetStack();
                        break;
                    case 3:
                        return;
                }
                System.out.println("\n/----------------------------------/");
            }
        }
    }
}
