package space.fhr;

import javax.swing.*;

/**
 * 具体策略 B
 *  Created by fhr on 16/3/2.
 */


public class StrategyB implements Strategy {

    @Override
    public double computerAverage(double[] score) {

       /*
       * bubble sort to remove the biggest and  smallest score
       * and computer the average
       *
       */

        for(int i = score.length-1; i > 0; i--){
            for(int j = 0; j < i; j++ ){
                if(score[j] > score[j+1]){
                    double t = score[j];
                    score[j] = score[j+1];
                    score[j+1] = t;
                }
            }
        }

        double sum = 0;
        for(int i = 1; i < score.length-1; i++){
            sum += score[i];
        }



        return sum / (score.length-2);
    }
}
