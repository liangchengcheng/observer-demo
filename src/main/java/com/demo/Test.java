package com.demo;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月15日10:47:52
 * Description:    {  }
 */
public class Test {

    private  CallBack callBack;

    /**
     * 注册事件
     */
    public void register(CallBack callBack){
        this.callBack=callBack;
    }

    /**
     * 需要调用的时候回调
     */
    public void call(){
        callBack.oncall();
    }

}
