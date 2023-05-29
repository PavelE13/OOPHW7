package DecoratorFactory;

public class DecLogComplexNumFactory implements iComplexNumFactory {
    private iLoggable logger;

    public DecLogComplexNumFactory(iLoggable logger) {
        this.logger = logger;
    }
    public iComplexNum create(double result1, double result2) {
        return new DecLogComplexNumCalc(new ComplexNumCalc(result1, result2), logger);
    }
}
