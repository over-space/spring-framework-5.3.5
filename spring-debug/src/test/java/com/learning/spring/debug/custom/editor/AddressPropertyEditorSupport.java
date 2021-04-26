package com.learning.spring.debug.custom.editor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyEditorSupport;

public class AddressPropertyEditorSupport extends PropertyEditorSupport {

    private static final Logger logger = LogManager.getLogger(AddressPropertyEditorSupport.class);


    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        logger.info("自定义属性编辑器，解析属性值。");

        String[] s = text.split("_");
        Address address = new Address();
        address.setProvince(s[0]);
        address.setCity(s[1]);
        address.setTown(s[2]);
        this.setValue(address);
    }
}
