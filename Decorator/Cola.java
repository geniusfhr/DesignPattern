package space.fhr;

/**
 * 可乐 扩展自饮料抽象类
 * 饮料的一种 核心
 *
 * Created by fhr on 16/3/12.
 */


public class Cola extends Beverage {

    Cola() {
        this.description = "主饮料(可乐)";
    }


    @Override
    public double cost() {
        return 5.0;
    }
}
