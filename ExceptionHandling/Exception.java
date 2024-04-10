package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Exception obj = new Exception();
        try {
            obj.add();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

    }

    int add() throws ArithmeticException {
        // try {
        System.out.println("enter the numbers");
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt();
        int b = ss.nextInt();
        if (b == 0) {
            throw new ArithmeticException("cannot divide by Zero");
        }
        int c = a / b;
        System.out.println(c);
        ss.close();

        // } catch (ArithmeticException e) {
        // System.out.println(e.getMessage());
        // } catch (InputMismatchException e) {
        // System.out.println("enter only numbers");
        // } finally {
        // System.out.println("all good");
        // }
        return 0;

    }

}
