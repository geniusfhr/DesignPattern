package space.fhr;

/**
 * Created by fhr on 16/3/8.
 */
public class Student implements Reader {

    private String name;            //订阅者姓名
    private int newsNumber;         //新闻编号
    private String newsContent;     //新闻内容


    public Student(String name,Newspaper newspaper){
        this.name = name;
        newspaper.registerNewspaper(this);              //新建订阅者的同时 向报社订阅
    }

    //更新数据
    @Override
    public void update(int newsNumber, String newsContent) {
        this.newsNumber = newsNumber;
        this.newsContent = newsContent;
        showNewspaper();
    }


    //返回姓名
    @Override
    public String getReaderName() {
        return name;
    }

    @Override
    public void showNewspaper() {
        System.out.println("Hello,我是学生"+name+",今天我看了第 "+newsNumber+" 号新闻:"
                            +newsContent);
    }

    void removeNewpaper(Newspaper newspaper){
        newspaper.removeReader(this);
    }
}
