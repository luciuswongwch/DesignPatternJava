package com.luciuswong.singleresponsibility;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {
    private ObjectMapper mapper = new ObjectMapper();
    private UserValidator validator = new UserValidator();
    private UserPersistenceService persistenceService = new UserPersistenceService();

    public String createUser(String userJson) throws IOException {
        User user = mapper.readValue(userJson, User.class);
        if (!validator.validateUser(user)) {
            return "ERROR";
        }
        persistenceService.saveUser(user);
        return "SUCCESS";
    }
}