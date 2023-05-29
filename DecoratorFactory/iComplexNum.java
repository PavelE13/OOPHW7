package DecoratorFactory;

public interface iComplexNum {

    iComplexNum add(double argx1, double argx2, double argy1, double argy2);
    iComplexNum multiply(double argx1, double argx2, double argy1, double argy2);
    iComplexNum divider(double argx1, double argx2, double argy1, double argy2);
    String getResult();
    }
