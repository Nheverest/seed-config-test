# seedstack-config-test

## Overview
This project populates two classes (ConfigOne and ConfigTwo) with the same configuration object (someConfig) from application.yaml.

## Validation of the two config objects usage
Result can be tested using http://localhost:8080/hello
Displayed message is the concatenation of two strings extracted from ConfigOne and ConfigTwo. 

## Error in Config Tool
Running mvn seedstack:config does not yield consistent results.

Sometimes:

    someConfig
      firstName = "default first name from ConfigTwo" (String):
      lastName = "default last name from ConfigTwo" (String):

And sometimes:

    someConfig
      firstName = "default first name from ConfigOne" (String):
      lastName = "default last name from ConfigOne" (String):

## Analysis
Node object from seed-core is not designed to manage more than one class associated with the same application.yaml entry.
