package com.study.best.support;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.ResourceBundle;

import static java.util.Objects.requireNonNull;

/**
 * 在读取资源包时使用自定义{@link Charset}的控件，默认字符集;
 * 同时加入国际化
 */
public final class ResourceBundleControl extends ResourceBundle.Control {

    private final Charset charset;

    public ResourceBundleControl(Charset charset) {
        this.charset = requireNonNull(charset);
    }

    @Override
    public ResourceBundle newBundle(
            final String baseName,
            final Locale locale,
            final String format,
            final ClassLoader loader,
            final boolean reload) {
        return ResourceBundle.getBundle("eap", new LanguageUtil().getLocale());//new Locale("zh", "TW");Locale.getDefault()
    }
}
