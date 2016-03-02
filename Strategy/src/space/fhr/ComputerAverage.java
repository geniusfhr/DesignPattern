package space.fhr;

/**
 * Context
 * 需要和接口交互的环境
 *
 * Created by fhr on 16/3/2
 *
 */


//接口的环境描述 接口的应用
public class ComputerAverage {

    Strategy strategy;                                  //策略接口

    public void setStrategy(Strategy strategy){         //设置策略
        this.strategy = strategy;
    }

    public double getAverage(double[] score){           //计算平均分
        if(strategy == null){
            System.out.println("The strategy has not been choose yet!");
            return -1;
        } else {
            return strategy.computerAverage(score);
        }
    }
}
