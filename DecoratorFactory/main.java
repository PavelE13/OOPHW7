package DecoratorFactory;

public class main {
    public static void main(String[] args) {
        /*//iCalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        iCalculableFactory calculableFactory = new DecLogCalcFactory(new Logger());*/
        iComplexNumFactory complexNumFactory = new DecLogComplexNumFactory(new Logger());
        // ViewCalculator view = new ViewCalculator(calculableFactory);
        // view.run();
    }
}
