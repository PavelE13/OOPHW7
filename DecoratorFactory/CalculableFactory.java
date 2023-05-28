package DecoratorFactory;

public class CalculableFactory {
    public iCalculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
