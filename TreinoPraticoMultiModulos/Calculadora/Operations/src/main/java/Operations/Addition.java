package Operations;
import Core.OperationCalculate;

public class Addition implements OperationCalculate {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public double Calculate(double n1, double n2) {
        return n1+n2;
    }
}