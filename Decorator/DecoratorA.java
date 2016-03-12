package space.fhr;

/**
 * 具体装饰者A
 *
 * Created by fhr on 16/3/12.
 */
public class DecoratorA extends Decorator {
    Beverage beverage;       //核心饮料 被装饰者 持有核心的引用


    DecoratorA(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 加上配料A";
    }


    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }
}
