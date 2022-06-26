$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Amazon.feature");
formatter.feature({
  "name": "To validate the login functionality of amazon website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To enter the valid phno and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonStepUp.toLaunchTheBrowserAndHitTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid phno",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonStepUp.toEnterValidPhno()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the enter button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepUp.toClickTheEnterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepUp.toEnterInvalidPassword()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: manual break\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.stepDefinition.AmazonStepUp.toEnterInvalidPassword(AmazonStepUp.java:34)\r\n\tat ✽.To enter invalid password(src/test/resources/Amazon.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepUp.toClickTheSignInButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/facebook.feature");
formatter.feature({
  "name": "To validate the login functionality of Facebook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature02"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the browser and hit the facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_launch_the_browser_and_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the invalid userName and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature02"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "To pass the invalid userName in userName field",
  "rows": [
    {
      "cells": [
        "mama@gmail.com",
        "venky@gmail.com",
        "sanget@gmail.com",
        "kumban@gmail.com",
        "sabam@gmail.com",
        "beebam@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.to_pass_the_invalid_userName_in_userName_field(DataTable)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepDefinition.StepDefinition.to_pass_the_invalid_userName_in_userName_field(StepDefinition.java:27)\r\n\tat ✽.To pass the invalid userName in userName field(src/test/resources/facebook.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To pass the invalid password in password field",
  "rows": [
    {
      "cells": [
        "sjs",
        "uhxa",
        "jalih",
        "sjiuq"
      ]
    },
    {
      "cells": [
        "11111",
        "88888",
        "77777",
        "111111"
      ]
    },
    {
      "cells": [
        "sssss",
        "dddddd",
        "bbbbbb",
        "ccccc"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_pass_the_invalid_password_in_password_field(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To check with bulk of datas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To pass the bulk of datas\"\u003cuserName\u003e\" in userName field",
  "keyword": "When "
});
formatter.step({
  "name": "To pass the bulk of datas\"\u003cPassword\u003e\" in Password field",
  "keyword": "And "
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "Password"
      ]
    },
    {
      "cells": [
        "sara@gmail.com",
        "1234"
      ]
    },
    {
      "cells": [
        "verra@gmail.com",
        "87989"
      ]
    },
    {
      "cells": [
        "kadan11@gmail.com",
        "5678"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the browser and hit the facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_launch_the_browser_and_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check with bulk of datas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature02"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To pass the bulk of datas\"sara@gmail.com\" in userName field",
  "keyword": "When "
});
formatter.match({
  "location": "StepUpOutline.to_pass_the_bulk_of_datas_in_userName_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of datas\"1234\" in Password field",
  "keyword": "And "
});
formatter.match({
  "location": "StepUpOutline.to_pass_the_bulk_of_datas_in_Password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the browser and hit the facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_launch_the_browser_and_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check with bulk of datas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature02"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To pass the bulk of datas\"verra@gmail.com\" in userName field",
  "keyword": "When "
});
formatter.match({
  "location": "StepUpOutline.to_pass_the_bulk_of_datas_in_userName_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of datas\"87989\" in Password field",
  "keyword": "And "
});
formatter.match({
  "location": "StepUpOutline.to_pass_the_bulk_of_datas_in_Password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the browser and hit the facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_launch_the_browser_and_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check with bulk of datas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature02"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To pass the bulk of datas\"kadan11@gmail.com\" in userName field",
  "keyword": "When "
});
formatter.match({
  "location": "StepUpOutline.to_pass_the_bulk_of_datas_in_userName_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of datas\"5678\" in Password field",
  "keyword": "And "
});
formatter.match({
  "location": "StepUpOutline.to_pass_the_bulk_of_datas_in_Password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});