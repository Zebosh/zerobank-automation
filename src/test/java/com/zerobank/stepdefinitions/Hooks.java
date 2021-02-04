package com.zerobank.stepdefinitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.lang.module.Configuration;

public class Hooks {
    @Before
    public void setUp(){

        System.out.println("\tThis is coming from BEFORE");
       // Driver.get().get(ConfigurationReader.get("url"));
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("This is coming from after");
        Driver.closeDriver();
    }
}
