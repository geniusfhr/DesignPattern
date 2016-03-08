package space.fhr;

import java.rmi.Remote;
import java.util.ArrayList;

/**
 * 中国日报 实现报社接口
 *
 * Created by fhr on 16/3/8.
 */
public class ChinaDaily implements Newspaper {

    private int newsNumber;                 //新闻编号
    private String newsContent;             //新闻内容

    private ArrayList<Reader> readers  ;      //阅读者


    ChinaDaily(){
        readers = new ArrayList<Reader>();
    }

    //订阅者实现注册
    @Override
    public void registerNewspaper(Reader r) {
        readers.add(r);         //注册
        System.out.println("注册者("+r.getReaderName()+")订阅成功!");
    }



    //移除订阅者
    @Override
    public void removeReader(Reader r) {
        if (!readers.isEmpty()){
           readers.remove(readers.indexOf(r));          //移除订阅者!
            System.out.println("订阅者("+r.getReaderName()+")已移除!");
        }

    }


    //通知所有订阅者
    @Override
    public void notifyReader() {

        for(Reader reader : readers){
            reader.update(newsNumber,newsContent);      //订阅者更新数据
        }
        System.out.println("新闻已推送!");
    }


    //报社更新新闻
    void setNewspaper(int newsNumber,String newsContent) {
        this.newsNumber = newsNumber;
        this.newsContent = newsContent;

        notifyReader();         //新闻改变 通知所有订阅者


    }


}
