/*
Calculator Application
Your task is to create a console-based calculator application that allows users to perform basic mathematical operations such as addition, subtraction, multiplication, and division. The application should fulfill the following requirements:
Objectives:
• Implement the calculator application as a Maven project.
• The calculator should support addition, subtraction, multiplication, and division operations. Users should be able to enter the numbers and the operator to perform the desired operation.
• The program should continue running until the user chooses to end it. After each operation, the user should have the option to perform another calculation or exit the program.
Optional:
• The addition and subtraction operations should be able to handle any number of operands.
• Implement proper exception handling to handle any errors or invalid inputs entered.
• Write JUnit tests to verify the correctness of each mathematical operation.
Submission:
Upload on GitHub then send the repository link to your teacher.
Good luck!
 */

package se.lexicon;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


//Welcome text
        System.out.println("Welcome to fokka's calculator project!");{
        }
//Scanner init and description
        Scanner input = new Scanner(System.in);

//Variables
        char op; double n1, n2, result;
        System.out.println("Input number");
        n1 = input.nextDouble();
        System.out.println("Input operator");
        op = input.next().charAt(0);
        System.out.println("Input number");
        n2 = input.nextDouble();

//Switch operations
        switch (op){
            case '+':
                result = n1 + n2;
                System.out.println(n1 + "+" + n2 + "=" + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println(n1 + "-" + n2 + "=" + result);
                break;
            case '/':
                result = n1 / n2;
                System.out.println(n1 + "/" + n2 + "=" + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println(n1 + "*" + n2 + "=" + result);
                break;

            default:
                System.out.println("Cant you read? Use only one of the four basic operators");
                break;
        }


        }
    }

