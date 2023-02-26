package calculatorService;

public class Calculator {
        public static void calculation(double num1, char op, double num2) {
            double o = 0;

            switch (op) {

                case '+':

                    o = num1 + num2;

                    break;

                case '-':

                    o = num1 - num2;

                    break;

                case '*':

                    o = num1 * num2;

                    break;

                case '/':

                    o = num1 / num2;

                    break;

                default:

                    System.out.println("You enter wrong input");


            }

            System.out.println("The final result:");

            System.out.println();

            System.out.println(num1 + " " + op + " " + num2
                    + " = " + o);
            }
        }

