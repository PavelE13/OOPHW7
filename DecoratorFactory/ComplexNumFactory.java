package DecoratorFactory;

public class ComplexNumFactory {
    public iComplexNum create(double result1, double result2) {
        return new ComplexNumCalc(result1, result2);
    }
}
