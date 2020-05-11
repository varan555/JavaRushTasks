package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JUVA on 17.02.2020.
 */
public class EditUserView implements View {

    private Controller controller;

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }



        public void refresh(ModelData modelData) {
            System.out.println("User to be edited:");
            System.out.println("\t"+modelData.getActiveUser());
            System.out.println("===================================================");
        }
}
