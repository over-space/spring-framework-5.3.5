package com.learning.spring.debug.test;

import com.learning.spring.debug.BaseTest;
import com.learning.spring.debug.design.observer01.BadmanObservable;
import com.learning.spring.debug.design.observer01.Goodman01Observer;
import com.learning.spring.debug.design.observer01.Goodman02Observer;
import com.learning.spring.debug.design.observer01.Observer;
import org.junit.jupiter.api.Test;

public class SpringDebugObserverTest extends BaseTest {


    @Test
    void testObserver01() {
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
