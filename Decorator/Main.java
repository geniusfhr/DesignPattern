package space.fhr;



//Main类 程序的入口 StarBucks的管理者


public class Main {

    public static void main(String[] args) {

	    Beverage beverage = new DecoratorA(new DecoratorB(new Milk()));
        System.out.println(beverage.getDescription() + " 价格: " + beverage.cost());

        beverage = new DecoratorB(new DecoratorB(new DecoratorA(new Cola())));
        System.out.println(beverage.getDescription() + " 价格: " + beverage.cost());


    }
}
