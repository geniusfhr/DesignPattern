package space.fhr;

/**
 *
 * 具体策略A 实现Strategy接口
 *
 * Created by fhr on 16/3/2.
 */


public class StrategyA implements Strategy {


    //实现接口 计算平均
    @Override
    public double computerAverage(double[] score) {
        double sum = 0;
        for(double s : score){
            sum += s;
        }
        return sum/score.length;
    }
}
