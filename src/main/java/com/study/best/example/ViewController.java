package com.study.best.example;

import com.study.best.BestApplication;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.stage.Modality;

import java.io.IOException;

@FXMLController
public class ViewController {

    public void showToolWindow(Event event) throws IOException {
        BestApplication.showView(ToolView.class, Modality.NONE);
    }
}
