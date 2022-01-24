package com.learning.spring.debug.custom.circular.reference;

/**
 * @author lifang
 * @since 2022/1/24
 */
public class X {

    private Y y;

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }
}
