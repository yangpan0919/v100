package com.study.best;

import com.study.best.example.FirstView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launch(BestApplication.class, FirstView.class, args);
    }

}
