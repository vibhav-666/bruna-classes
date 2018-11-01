$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/shopping Card.feature");
formatter.feature({
  "line": 1,
  "name": "test e-commerce website",
  "description": "",
  "id": "test-e-commerce-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "validate the create account page",
  "description": "",
  "id": "test-e-commerce-website;validate-the-create-account-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@CreateAccount"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "i enter my details",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "is should be able to sign up and validate \"\u003curl\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "test-e-commerce-website;validate-the-create-account-page;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 31,
      "id": "test-e-commerce-website;validate-the-create-account-page;;1"
    },
    {
      "cells": [
        "http://automationpractice.com/index.php?controller\u003dmy-account"
      ],
      "line": 32,
      "id": "test-e-commerce-website;validate-the-create-account-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5727755298,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i open the automationPractice website",
  "keyword": "Given "
});
formatter.match({
  "location": "Ecommerce.i_open_the_automationPractice_website()"
});
formatter.result({
  "duration": 6814602603,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "validate the create account page",
  "description": "",
  "id": "test-e-commerce-website;validate-the-create-account-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@CreateAccount"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "i enter my details",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "is should be able to sign up and validate \"http://automationpractice.com/index.php?controller\u003dmy-account\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Ecommerce.i_enter_my_details()"
});
formatter.result({
  "duration": 12912328658,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php?controller\u003dmy-account",
      "offset": 43
    }
  ],
  "location": "Ecommerce.is_should_be_able_to_sign_up_and_validate(String)"
});
formatter.result({
  "duration": 47246076,
  "status": "passed"
});
formatter.after({
  "duration": 792257120,
  "status": "passed"
});
});