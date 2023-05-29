package DecoratorFactory;

public class ComplexNumCalc implements iComplexNum {
    private double result1;
    private double result2;

    public ComplexNumCalc(double result1, double result2) {
        this.result1 = result1;
        this.result2 = result2;
    }

    @Override
    public iComplexNum add(double argx1, double argx2, double argy1, double argy2) {
        return new ComplexNumCalc(argx1 + argx2, argy1 + argy2);
    }
    @Override
    public iComplexNum multiply(double argx1, double argx2, double argy1, double argy2) {
        double result1 = argx1 * argx2 - argy1 * argy2;
        double result2 = argx1 * argy2 + argy1 * argx2;
        return new ComplexNumCalc(result1, result2);
    }
    @Override
    public iComplexNum divider(double argx1, double argx2, double argy1, double argy2) {
        double sopryazh = argx2 * argx2 + argy2 * argy2;
        double result1 = (argx1 * argx2 + argy1 * argy2) / sopryazh;
        double result2 = (argx2 * argy1 - argx1 * argy2) / sopryazh;
        return new ComplexNumCalc(result1, result2);
    }
    @Override
    public String getResult() {
        return "(" + result1 + ", " + result2 + "i)";
    }
}

