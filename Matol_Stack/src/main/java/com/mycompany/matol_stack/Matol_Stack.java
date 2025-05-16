package com.mycompany.matol_stack;

import java.util.Scanner;
import java.util.Stack;

public class Matol_Stack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        String word;
        boolean run = true;

        while (run) {
            System.out.print("Enter a word (if done type 'OK'): ");
            word = scan.nextLine();

            if (word.equals("OK")) {
                run = false;
                } else {
                    stack.push(word); 
                            
                }
            }
        System.out.print("Reverse sentence: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
