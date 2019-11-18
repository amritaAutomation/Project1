$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AllFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 32398284,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "This is for login scenario",
  "description": "",
  "id": "login-feature;this-is-for-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter username",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enter password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on manage users on left",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click SRM tab",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click add new SRM button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "fill in all details",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click save",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "navigate to manageUser and SRM tab",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "update user from Action menu",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 18450971694,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_username()"
});
formatter.result({
  "duration": 1555881,
  "error_message": "java.lang.NullPointerException\r\n\tat PageActions.LoginPage.enterUsername(LoginPage.java:36)\r\n\tat StepDef.StepDef.user_enter_username(StepDef.java:32)\r\n\tat ✽.Then user enter username(AllFeatures.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDef.user_enter_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.click_on_manage_users_on_left()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.click_SRM_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.click_add_new_SRM_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.fill_in_all_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.click_save()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.navigate_to_manageUser_and_SRM_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.update_user_from_Action_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 155855,
  "status": "passed"
});
});