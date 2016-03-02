package space.fhr;


//Main类 作为顶层类 程序的入口 管理整个应用

public class Main {

    public static void main(String[] args) {

        double score[] = {1,2,3,4,6};

        ComputerAverage game = new ComputerAverage();

        game.setStrategy(new StrategyA());
        Person mm = new Person("MM",game.getAverage(score));

        game.setStrategy(new StrategyB());
        Person gg = new Person("GG",game.getAverage(score));


        System.out.println(mm.getName()+ " 的得分是" + mm.getScore());
        System.out.println(gg.getName()+ " 的得分是" + gg.getScore());

    }
}

//Person类
class Person {

    private String name;            //姓名
    private double score;              //分数

    public Person(String name,double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}
