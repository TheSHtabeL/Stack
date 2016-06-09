import java.util.Scanner;
import java.util.Arrays;
public class Stack {
    private int StackArray[];
    private int Summary;

    Stack(int size) {
        Summary = -1;
        StackArray = new int[size];
    }
    Stack (){
        Summary = -1;
    }

    void Pop() {
        if(Summary!=(-1)) {
            System.out.println(StackArray[Summary]);
            StackArray[Summary--] = 0;
        }else {
            System.out.println("Стек пуст.");
        }
    }
    void Push(int Element) {
        if((Summary+1) != StackArray.length) {
            StackArray[++Summary] = Element;
        }else {
            System.out.println("Стек заполнен.");
        }
    }
    int GetSummary() {
        return Summary;
    }
    void GetStack() {
        System.out.println("\nКоличество элементов в стеке: " + (Summary+1));
        System.out.println(Arrays.toString(StackArray));
    }
}
