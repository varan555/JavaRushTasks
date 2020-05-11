package com.javarush.task.task36.task3608.model;

/**
 * Created by JUVA on 12.02.2020.
 */
public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
}
