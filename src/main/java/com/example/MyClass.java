package com.example;

import com.demo.CallBack;
import com.demo.CallBackImp;
import com.demo.Test;
import com.demo2.ConcreteObserver1;
import com.demo2.ConcreteObserver2;
import com.demo2.Observer;
import com.demo2.Subject;

public class MyClass {

    public static void main(String[] args) {

    }

    private void demo1(){
        Test test =new Test();
        test.register(new CallBack() {
            @Override
            public void oncall() {
                System.out.println("回调函数被调用");
            }
        });
        test.call();
    }
    private void demo2(){
        CallBack callBack=new CallBackImp();
        Test test=new Test();
        test.register(callBack);
        test.call();
    }

    private  void demo3(){
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        Subject subject = new Subject();
        subject.register(observer1);
        subject.register(observer2);
        subject._notify();
        subject.unRegister(observer1);
        subject._notify();
    }
}
