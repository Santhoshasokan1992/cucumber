$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feauture/Fblogin.feature");
formatter.feature({
  "name": "To validate the Login Functionality of Facebook page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
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
  "name": "The user should Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with valid username with Invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user should type the valid username and invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_valid_username_and_invalid_password()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefenition.FbLoginStepdefenition.the_user_should_type_the_valid_username_and_invalid_password(FbLoginStepdefenition.java:66)\r\n\tat ✽.The user should type the valid username and invalid password(file:src/test/resources/Feauture/Fblogin.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user should click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_click_the_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should type the valid username \"\u003cuser\u003e\" and invalid\"\u003cpass\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "name": "The user should click the Login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "java",
        "java@123"
      ]
    },
    {
      "cells": [
        "python",
        "python@123"
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
  "name": "The user should Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user should type the valid username \"java\" and invalid\"java@123\" password",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_valid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_navigate_to_incorrect_credential_page()"
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
  "name": "The user should Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user should type the valid username \"python\" and invalid\"python@123\" password",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_valid_username_and_invalid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_navigate_to_incorrect_credential_page()"
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
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feauture/ListMap.feature");
formatter.feature({
  "name": "To validate the Login Functionality of Facebook page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
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
  "name": "The user should Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user should type the valid username and invalid passwords",
  "rows": [
    {
      "cells": [
        "santhosh",
        "santhosh@123",
        "asokan",
        "asokan@123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ListStepdefenition.theUserShouldTypeTheValidUsernameAndInvalidPasswords(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_navigate_to_incorrect_credential_page()"
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
  "name": "The user should Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user should type the invalid username and valid passwords",
  "rows": [
    {
      "cells": [
        "santhosh",
        "santhosh@123",
        "asokan",
        "asokan@123"
      ]
    },
    {
      "cells": [
        "santhosh",
        "santhosh@123",
        "thenmoli",
        "thenmoli@123"
      ]
    },
    {
      "cells": [
        "santhosh",
        "santhosh@123",
        "sathish",
        "sathish@123"
      ]
    },
    {
      "cells": [
        "Asokan",
        "Asokan@123",
        "Santhosh",
        "santhosh@123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ListStepdefenition.theUserShouldTypeTheInvalidUsernameAndValidPasswords(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_navigate_to_incorrect_credential_page()"
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
  "name": "The user should Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user should type the invalid username and invalid passwords",
  "rows": [
    {
      "cells": [
        "user1",
        "santhosh@123"
      ]
    },
    {
      "cells": [
        "pass1",
        "sathish@123"
      ]
    },
    {
      "cells": [
        "user2",
        "thenmoli@123"
      ]
    },
    {
      "cells": [
        "pass2",
        "Asokan@123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ListStepdefenition.theUserShouldTypeTheInvalidUsernameAndInvalidPasswords(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_navigate_to_incorrect_credential_page()"
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
  "name": "The user should Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and empty password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user should type the invalid username and empty passwords",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "sathish",
        "sathish@123"
      ]
    },
    {
      "cells": [
        "thenmoli",
        "thenmoli@123"
      ]
    },
    {
      "cells": [
        "Asokan",
        "Asokan@123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ListStepdefenition.theUserShouldTypeTheInvalidUsernameAndEmptyPasswords(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLoginStepdefenition.the_user_should_navigate_to_incorrect_credential_page()"
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
formatter.after({
  "status": "passed"
});
});