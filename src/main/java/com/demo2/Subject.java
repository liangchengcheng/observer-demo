package com.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class Subject  {

    List<Observer> lists= new ArrayList<Observer>();

    /**
     * 注册一个事件
     */
    public void register(Observer observer){
        lists.add(observer);
    }

    /**
     * 更新
     */
    public void _notify(){
        for (Observer observer:lists){
            observer.update();
        }
    }

    /**
     * 卸载事件
     */
    public void unRegister(Observer observer){
        lists.remove(observer);
    }
}
