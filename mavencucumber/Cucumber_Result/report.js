$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFeature.feature");
formatter.feature({
  "line": 1,
  "name": "MyntraApp SIT Testing",
  "description": "",
  "id": "myntraapp-sit-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Myntra Login page validation",
  "description": "",
  "id": "myntraapp-sit-testing;myntra-login-page-validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Open browser and open Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter \"\u003cusername\u003e\" and \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Verify the login open functionality",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "myntraapp-sit-testing;myntra-login-page-validation;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8,
      "id": "myntraapp-sit-testing;myntra-login-page-validation;;1"
    },
    {
      "cells": [
        "tester1",
        "password1"
      ],
      "line": 9,
      "id": "myntraapp-sit-testing;myntra-login-page-validation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "Myntra Login page validation",
  "description": "",
  "id": "myntraapp-sit-testing;myntra-login-page-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Open browser and open Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter \"tester1\" and \"password\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Verify the login open functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_browser_and_open_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "tester1",
      "offset": 7
    },
    {
      "val": "password",
      "offset": 21
    }
  ],
  "location": "Steps.enter_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.verify_the_login_open_functionality()"
});
formatter.result({
  "status": "skipped"
});
});