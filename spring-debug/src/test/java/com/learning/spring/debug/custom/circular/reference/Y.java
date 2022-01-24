package com.learning.spring.debug.custom.circular.reference;

/**
 * @author lifang
 * @since 2022/1/24
 */
public class Y {

    private X x;

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }
}
