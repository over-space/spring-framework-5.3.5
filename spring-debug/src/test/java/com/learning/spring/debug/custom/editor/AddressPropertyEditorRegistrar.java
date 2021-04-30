package com.learning.spring.debug.custom.editor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public class AddressPropertyEditorRegistrar implements PropertyEditorRegistrar {

    private static final Logger logger = LogManager.getLogger(AddressPropertyEditorRegistrar.class);

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {

        logger.info("自定义属性编辑器，注册自定义属性编辑器。 ");

        registry.registerCustomEditor(Address.class, new AddressPropertyEditor());

    }
}
