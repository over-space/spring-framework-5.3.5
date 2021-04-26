package com.learning.spring.debug.custom.editor;

/**
 * 自定义属性编辑器
 * 1. 自定义属性编辑器，继承PropertyEditorSupport#setAsText接口。
 * 2. 自定义属性编辑器注册器，实现PropertyEditorRegistrar。
 * 3. 通过配置文件将自定义属性编辑器注册器(PropertyEditorRegistrar)注册到CustomEditorConfigurer#propertyEditorRegistrars中
 */