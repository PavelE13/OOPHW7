package DecoratorFactory;

public class DecLogComplexNumCalc implements iComplexNum {
    private iComplexNum decorcomplex;
    private iLoggable logger;

    public DecLogComplexNumCalc(iComplexNum decorcomplex, iLoggable logger) {
        this.decorcomplex = decorcomplex;
        this.logger = logger;
    }

    @Override
    public iComplexNum add(double argx1, double argx2, double argy1, double argy2) {
        String firstArgs = decorcomplex.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArgs, argx1, argx2, argy1, argy2));
        iComplexNum result = decorcomplex.add(argx1, argx2, argy1, argy2);
        return result;
    }

    @Override
    public iComplexNum multiply(double argx1, double argx2, double argy1, double argy2) {
        String firstArgs = decorcomplex.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multiply с параметром %d", firstArgs, argx1, argx2, argy1, argy2));
        iComplexNum result = decorcomplex.multiply(argx1, argx2, argy1, argy2);
        return result;
    }

    @Override
    public iComplexNum divider(double argx1, double argx2, double argy1, double argy2) {
        String firstArgs = decorcomplex.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода divider с параметром %d", firstArgs, argx1, argx2, argy1, argy2));
        iComplexNum result = decorcomplex.divider(argx1, argx2, argy1, argy2);
        return result;
    }

    @Override
    public String getResult() {
        String result = decorcomplex.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }
}
