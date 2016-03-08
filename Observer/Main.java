package space.fhr;

public class Main {

    public static void main(String[] args) {

        //构造中国日报
        ChinaDaily chinaDaily  =  new ChinaDaily();

        //构造学生 老师对象 同时向报社注册
        Student fhr = new Student("方浩然",chinaDaily);
        Student wlf = new Student("吴丽凡",chinaDaily);
        Teacher jack = new Teacher("Jack",chinaDaily);

        //新闻更新
        chinaDaily.setNewspaper(1,"今天是个好日子!");

        //Jack取消订阅
        chinaDaily.removeReader(jack);

        //新闻更新
        chinaDaily.setNewspaper(2,"今天小方得了一百分!");



    }
}
