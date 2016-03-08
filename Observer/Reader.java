package space.fhr;

/**
 * 订阅者接口
 *
 * Created by fhr on 16/3/8.
 */

public interface Reader {

    //更新数据
    void update(int newsNumber,String newsContent);

    //显示推送内容
    void showNewspaper();

    //订阅者姓名
    String getReaderName();

}
