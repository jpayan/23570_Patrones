import Components.*;
import Components.Decorators.Espresso;
import Components.Decorators.Milk;
import Components.Decorators.Water;

public class Main {
    public static void main(String[] args) {
        Beverage payeLatte = new PayeLatte("Big");
        payeLatte = new Milk(payeLatte);
        payeLatte = new Espresso(payeLatte);

        System.out.println(payeLatte.getDescription());
        System.out.println(payeLatte.getCost());

        Beverage payucaExpress = new PayucaExpress("Small");
        payucaExpress = new Espresso(payucaExpress);
        payucaExpress = new Water(payucaExpress);

        System.out.println(payucaExpress.getDescription());
        System.out.println(payucaExpress.getCost());

        Beverage chaiPay = new ChaiPay("Medium");
        chaiPay = new Milk(chaiPay);
        chaiPay = new Water(chaiPay);

        System.out.println(chaiPay.getDescription());
        System.out.println(chaiPay.getCost());

        Beverage payucaMocha = new PayucaMocha("");
        payucaMocha = new Espresso(payucaMocha);
        payucaMocha = new Water(payucaMocha);
        payucaMocha = new Milk(payucaMocha);

        System.out.println(payucaMocha.getDescription());
        System.out.println(payucaMocha.getCost());
    }
}
