package space.fhr;

/**
 * 具体装饰者B
 *
 * Created by fhr on 16/3/12.
 */
public class DecoratorB extends Decorator {

    Beverage beverage;          //持有被装饰者的引用

    //构造器
    DecoratorB(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + " 加上配料B";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }
}
