package com.javarush.task.task36.task3601;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JUVA on 28.04.2020.
 */
public class Controller {
    Model model = new Model();
    public List<String> onShowDataList() {
        return model.getStringDataList();
    }

}
