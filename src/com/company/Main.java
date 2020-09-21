package com.company;

public class Main {

    // INSTRUCTION
    // 1. set a breakpoint at line int x = 10;
    // Choose Run -> Debug : Main (Shift F9)
    // The Debugger will start and you will see the variables window
    // What do you see in the variables window?
    // Press F7 once .. What do you see now in the Variables window
    // Press F7 again .. What do you see now in the Variables window
    // Press F 7 one more time .. What do you see now?
    // finish debugging the program then edit the code as follows:
    // Add the line   System.out.println("The sum of " + x + " and " + y + " is " + sum); and Carry out e
    // Start the debugger as previously done - what happens when you press F7 on this new line?

    public static void main(String[] args) {
	// write your code here

        int x = 10;

        int y = 20;

        int sum = x+y;

        System.out.println("The sum of " + x + " and " + y + " is " + sum);

    }
}
