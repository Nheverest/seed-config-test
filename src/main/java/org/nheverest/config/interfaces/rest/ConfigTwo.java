package org.nheverest.config.interfaces.rest;

import org.seedstack.coffig.Config;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Config("someConfig")
public class ConfigTwo {
    private String firstName = "default first name from ConfigTwo";
    private String lastName = "default last name from ConfigTwo";

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}