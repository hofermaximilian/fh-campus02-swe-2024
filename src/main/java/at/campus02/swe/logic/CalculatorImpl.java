package at.campus02.swe.logic;


import at.campus02.swe.Calculator;
import at.campus02.swe.CalculatorException;

import java.util.ArrayList;
import java.util.Stack;

public class CalculatorImpl implements Calculator {

    private Stack<Double> stack_ = new Stack<Double>();

    @Override
    public double perform(Operation op) throws CalculatorException {

        double b = 0;
        double a = 0;
        ArrayList<Integer> a1 = new ArrayList<>();

        switch (op) {
            case add:
                b = pop();
                a = pop();
                return a + b;
            case sub:
                b = pop();
                a = pop();
                return a - b;
            case div:
                b = pop();
                a = pop();
                double c = a / b;
                if (Double.isInfinite(c))
                    throw new CalculatorException("Division by zero");
                return c;
            case mul:
                b = pop();
                a = pop();
                return a * b;
            case mod:
                b = pop();
                a = pop();
                double d = a % b;
                if (Double.isInfinite(d))
                    throw new CalculatorException("Division by zero");
                return d;
            case sin:
                a = pop();
                return Math.sin(Math.toRadians(a));
            case cos:
                a = pop();
                return Math.cos(Math.toRadians(a));
            case dotproduct:
                while (!stack_.isEmpty()) {
                    a1.add((int) pop());
                }
                int numElements = a1.getFirst();
                a1.removeFirst();

                int result = 0;
                for (int i = 0; i < a1.size() / 2; i++) {
                    result += a1.get(i) * a1.get(i + numElements);
                }
                return result;
        }

        return 0;
    }

    @Override
    public double pop() throws CalculatorException {
        if (stack_.isEmpty())
            throw new CalculatorException();
        return stack_.pop();
    }

    @Override
    public void push(double v) {
        stack_.push(v);
    }

    @Override
    public void clear() {
        stack_.clear();
    }
}
