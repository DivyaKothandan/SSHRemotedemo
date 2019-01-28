$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/hp/workspace/BDDTest/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login application",
  "description": "",
  "id": "login-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid login into application",
  "description": "\r\nGiven: Launch URL of the application\r\nWhen: User is already in Login Page of the application\r\nThen: User enters username and Password\r\nThen: User clicks Login button\r\nThen: User is in Homepage\r\nThen: User close the browser",
  "id": "login-application;valid-login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
});