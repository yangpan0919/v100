package com.study.best.support;

import javafx.scene.Parent;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * 默认的标准启动窗格实现将其子类化，并重写其方法，以便根据自己的行为进行自定义。
 * 可修改启动图片
 */
public class SplashScreen {

    private static String DEFAULT_IMAGE = "/icon.png";

    public String getDefaultImage() {
        return DEFAULT_IMAGE;
    }

    public void setDefaultImage(String defaultImage) {
        DEFAULT_IMAGE = defaultImage;
    }

    /**
     * Override this to create your own splash pane parent node.
     *
     * @return A standard image
     */
    public Parent getParent() {
        final ImageView imageView = new ImageView(getClass().getResource(getImagePath()).toExternalForm());
        final ProgressBar splashProgressBar = new ProgressBar();
        splashProgressBar.setPrefWidth(imageView.getImage().getWidth());

        final VBox vbox = new VBox();
        vbox.getChildren().addAll(imageView, splashProgressBar);

        return vbox;
    }

    /**
     * Customize if the splash screen should be visible at all.
     *
     * @return true by default
     */
    public boolean visible() {
        return true;
    }

    /**
     * 在开机图像加载之前
     */
    public void beforeShow() {

    }

    /**
     * 在主图像加载之后
     */
    public void mainShowAfter() {

    }


    /**
     * Use your own splash image instead of the default one.
     *
     * @return "/splash/javafx.png"
     */
    public String getImagePath() {
        return DEFAULT_IMAGE;
    }

}
