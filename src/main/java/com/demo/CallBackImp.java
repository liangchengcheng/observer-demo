package com.demo;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class CallBackImp implements  CallBack {
    @Override
    public void oncall() {
        System.out.println("回调函数被调用");
    }
}
