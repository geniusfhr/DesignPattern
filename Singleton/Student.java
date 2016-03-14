package space.fhr;

/**
 * Student类 单例模式
 * Created by fhr on 16/3/14.
 */
public class Student {
    private static Student student;         //持有一个静态变量 (唯一)

    private String name;
    private int age;


    //构造方法私有
    private Student() {
        this.name = "AlphaGo";
        this.age = 10;
        System.out.println("Constructor");
    }

    //静态方法 getInstance
    public static Student getInstance() {
        if (student == null) {
            student = new Student();
        }

        return student;
    }


}
