package com.learning.spring.debug.custom.autowired;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;

/**
 * @author lifang
 * @since 2021/12/15
 */
public class DependAnnotationBeanPostProcessor extends AutowiredAnnotationBeanPostProcessor {

    public DependAnnotationBeanPostProcessor() {
        super();
        setAutowiredAnnotationType(Depend.class);
    }
}
