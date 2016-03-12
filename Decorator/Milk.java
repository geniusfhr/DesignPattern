package space.fhr;

/**
 * 牛奶类 饮料的一种 扩展自抽象饮料类
 *
 * Created by fhr on 16/3/12.
 */
public class Milk extends Beverage {

    //构造方法
    Milk() {
        this.description = "主饮料(牛奶)";
    }


    //重写价格
    @Override
    public double cost() {
        return 6.0;
    }

}
