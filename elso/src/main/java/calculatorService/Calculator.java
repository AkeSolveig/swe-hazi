package calculatorService;

public class Calculator {
        public static void calculation(double num1, char op, double num2) {
            double o = 0;

            switch (op) {

                // case to add two numbers
                case '+':

                    o = num1 + num2;

                    break;

                // case to subtract two numbers
                case '-':

                    o = num1 - num2;

                    break;

                // case to multiply two numbers
                case '*':

                    o = num1 * num2;

                    break;

                // case to divide two numbers
                case '/':

                    o = num1 / num2;

                    break;

                default:

                    System.out.println("You enter wrong input");


            }

            System.out.println("The final result:");

            System.out.println();

            // print the final result
            System.out.println(num1 + " " + op + " " + num2
                    + " = " + o);
            }
        }

