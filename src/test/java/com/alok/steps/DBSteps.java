package com.alok.steps;

import com.alok.DBUtil;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;

public class DBSteps {

    @Given("I connect to MySQL")
    public void connectToDb() throws Exception {
        Assertions.assertNotNull(DBUtil.getConnection());
    }
}