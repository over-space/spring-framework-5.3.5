package com.learning.spring.debug.design.chain;

public class Woman implements People{

    /**
     * 妇女个人状态
     * 1 - 未出嫁
     * 2 - 出嫁
     * 3 - 夫死
     */
    private int type;

    /**
     * 妇女请示内容
     */
    private String request;

    public Woman(int type, String request){
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
