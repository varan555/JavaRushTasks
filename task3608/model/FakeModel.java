package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JUVA on 12.02.2020.
 */
public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users =  new ArrayList<User>();
        users.add(new User( "A" ,1,1));
        users.add(new User( "B" ,2,2));
        modelData.setUsers(users);

    }
    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }
}
