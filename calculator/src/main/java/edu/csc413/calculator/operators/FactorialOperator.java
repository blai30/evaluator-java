package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class FactorialOperator extends Operator {
    @Override
    public int priority() {
        return 3;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        return new Operand(factorial(op1.getValue()));
    }

    private int factorial(int value) {
        if (value != 0) {
            return value * factorial(value - 1);
        }
        return 1;
    }
}
