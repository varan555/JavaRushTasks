package com.javarush.task.task36.task3601;

import java.util.List;

/**
 * Created by JUVA on 28.04.2020.
 */
public class View {
    Controller controller = new Controller();
    public void fireShowDataEvent() {
        System.out.println(controller.onShowDataList());
    }
}
