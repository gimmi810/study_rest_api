package com.rest.api.model.response;

import com.rest.api.entity.User;

public class ListResultTest {
    public static void main(String[] args) {
        SingleResult<User> a = new SingleResult<>();
        User u = new User(1, "xkgun","name");
        a.setData(u);


    }
}