package com.learning.spring.debug.design.observer01;

public class Test {

    public static void main(String[] args) {

        //被观察者
        BadmanObservable bm = new BadmanObservable();

        //观察者
        Observer gm1 = new Goodman01Observer();
        Observer gm2 = new Goodman02Observer();

        bm.registerObserver(gm1);
        bm.registerObserver(gm2);

        bm.run();
    }
}
