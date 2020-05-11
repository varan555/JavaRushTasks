package com.javarush.task.task36.task3601;

import java.util.List;

/**
 * Created by JUVA on 28.04.2020.
 */
public class Model {
    Service service = new Service();
    public List<String> getStringDataList() {
        return service.getData();
    }
}
