
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Project calculator. Task 2.9.1");
        int firstNumber = getInputInt(scanner, "pervoe");
        char operator = getInputOperand(scanner);

        int secondNumber = getInputInt(scanner, "vtoroe");

        switch (operator) {
            case '+' -> result = addition(firstNumber, secondNumber);
            case '-' -> result = subtraction(firstNumber, secondNumber);
            case '*' -> result = multiplier(firstNumber, secondNumber);
            case '/' -> result = division(firstNumber, secondNumber);
        }

        System.out.println("Resultat vuchisleniya: " + result);
    }

    public static int getInputInt(Scanner scanner, String numberName) {
        System.out.println("Vvedite " + numberName + " chislo");
        int inputNumber = scanner.nextInt();
        System.out.println("Vvedennoe " + numberName + " chislo: " + inputNumber);
        return inputNumber;
    }

    public static char getInputOperand(Scanner scanner) {
        char operator = ' ';
        String operatorStr = new String();
        do {
            System.out.println("Vvedite operand");
            operator = scanner.next().charAt(0);
            if (!chekAcceptableOperand(operator))
                System.out.println("Vveden nevernui operand!");
            else {
                switch (operator) {
                    case '+' -> operatorStr = "slozheniya";
                    case '-' -> operatorStr = "vuchitaniya";
                    case '*' -> operatorStr = "ymnozheniya";
                    case '/' -> operatorStr = "deleniya";
                }
                System.out.println("Vvedena operaciya " + operatorStr);
            }
        } while (!chekAcceptableOperand(operator));
        return operator;
    }

    public static boolean chekAcceptableOperand(char chekingOperand) {
        if ((chekingOperand == '*') || (chekingOperand == '/') || (chekingOperand == '-') || (chekingOperand == '+'))
            return true;
        else
            return false;
    }

    public static int addition(int a, int b) {
        int returnValue = 0;
        returnValue = a + b;
        return returnValue;
    }

    public static int subtraction(int fromValue, int deductibleValue) {
        int returnValue = 0;
        returnValue = fromValue - deductibleValue;
        return returnValue;
    }

    public static int multiplier(int a, int b) {
        int returnValue = 0;
        returnValue = a * b;
        return returnValue;
    }

    public static int division(int mainValue, int devider) {
        int returnValue = 0;
        returnValue = mainValue / devider;
        return returnValue;
    }
}
