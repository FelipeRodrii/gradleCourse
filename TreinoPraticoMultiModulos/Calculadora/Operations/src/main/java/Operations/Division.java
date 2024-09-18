package Operations;

import Core.OperationCalculate;

public class Division implements OperationCalculate {
    @Override
    public double Calculate(double n1, double n2) {
        return n1/n2;
    }
}
