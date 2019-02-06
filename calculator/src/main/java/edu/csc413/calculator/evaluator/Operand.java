package edu.csc413.calculator.evaluator;
/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    private int operand;

    /**
     * construct operand from string token.
     */
    public Operand(String token) {
        try {
            operand = Integer.parseInt(token);
        } catch (NumberFormatException e) {
            operand = 0;
            System.out.println("Exception: string cannot be parsed into int. operand set to 0");
        }
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        operand = value;
    }

    /**
     * return value of operand
     */
    public int getValue() {
        return operand;
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
