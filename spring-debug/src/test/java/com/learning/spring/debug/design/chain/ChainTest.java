package com.learning.spring.debug.design.chain;

import com.learning.spring.debug.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChainTest extends BaseTest {

    @Test
    void testChain(){

        Random random = new Random();

        List<Woman> womanList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            womanList.add(new Woman(random.nextInt(4), "我要出去逛街"));
        }

        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for (Woman woman : womanList) {
            father.handler(woman);
        }
    }
}
