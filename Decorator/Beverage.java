package space.fhr;

/**
 * 饮料抽象类
 * 作为父类
 * Created by fhr on 16/3/12.
 */


public abstract class Beverage {
    String description = "unknownBeverage";     //饮料描述

    public abstract double cost();  //抽象方法 返回饮料价格

    public String getDescription(){
        return description;
    }



}
