package com.learning.spring.debug.custom.autowired;

/**
 * @author lifang
 * @since 2021/12/15
 */
public class D2 {

    @Depend
    private D1 d1;

    public D1 getD1() {
        return d1;
    }
}
