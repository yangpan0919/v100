package com.study.best.support;

import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 注释{@link FXMLController}用于标记JavaFX控制器类。
 */
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface FXMLController {

}
