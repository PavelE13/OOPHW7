package DecoratorFactory;

public class DecLogCalculator implements iCalculable {
    private iCalculable decorated;
    private iLoggable logger;

    public DecLogCalculator(iCalculable decorated, iLoggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, arg));
        iCalculable result = decorated.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public iCalculable multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        iCalculable result = decorated.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public int getResult() {
        int result = decorated.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }
}
