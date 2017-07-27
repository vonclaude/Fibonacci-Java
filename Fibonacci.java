import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    List<Integer> fibonacci = new ArrayList<Integer>();
    int listLength;


    public static void main(String[] args) {

        Fibonacci fibonacciProgram = new Fibonacci();
        fibonacciProgram.start();
    }

    public void start() {

        LengthInput();
        StartValuesInput();
        for (int i = 0; i < listLength; i++) {
            fibonacciAdd(i);
        }
        System.out.println(fibonacci);
    }

    //Ask how long a sequence
    public void LengthInput() {

        System.out.println("How long a Fibonacci sequence: ");
        Scanner lengthScanner = new Scanner(System.in);
        listLength = lengthScanner.nextInt();
    }

    //Ask for starting value of sequence
    public void StartValuesInput() {

        System.out.println("Starting from 0 or 1: ");
        Scanner startScanner = new Scanner(System.in);
        fibonacciStartValues(startScanner.nextShort());
    }

    //Initial values
    public void fibonacciStartValues(Short startValue) {

        switch (startValue) {
            case 0:
                fibonacci.add(0);
                fibonacci.add(1);
                break;
            case 1:
                fibonacci.add(1);
                fibonacci.add(1);
                break;
            default:
                System.out.println("Please input either 0 or 1: ");
                StartValuesInput();
                break;
        }
    }

    //Add values to Fibonacci Sequence
    public void fibonacciAdd(int index) {

        int result = fibonacci.get(index) + fibonacci.get(index + 1);
        fibonacci.add(result);
    }
}