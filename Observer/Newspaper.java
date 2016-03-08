package space.fhr;

/**
 * 报社接口
 *
 * Created by fhr on 16/3/8.
 */


public interface Newspaper {

    //注册订阅
    void registerNewspaper(Reader r);

    //移除订阅
    void removeReader(Reader r);

    //通知订阅者
    void notifyReader();


}
