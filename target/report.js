$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/FlightSearchPage.feature");
formatter.feature({
  "name": "Booking an one way journey",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "selecting journey",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in Home page",
  "keyword": "Given "
});
formatter.step({
  "name": "navigate to book a login page \"\u003cUserName\u003e\", \"\u003cPass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "providing journey deails",
  "keyword": "When "
});
formatter.step({
  "name": "click Book Now",
  "keyword": "And "
});
formatter.step({
  "name": "Naviate to Flight Selectio Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Pass"
      ]
    },
    {
      "cells": [
        "shiva27.rokz@gmail.com",
        "wsxft0987"
      ]
    }
  ]
});
formatter.scenario({
  "name": "selecting journey",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BookAFlight.user_should_be_in_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to book a login page \"shiva27.rokz@gmail.com\", \"wsxft0987\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookAFlight.navigate_to_book_a_login_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "providing journey deails",
  "keyword": "When "
});
formatter.match({
  "location": "BookAFlight.providing_journey_deails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Book Now",
  "keyword": "And "
});
formatter.match({
  "location": "BookAFlight.click_Book_Now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Naviate to Flight Selectio Page",
  "keyword": "Then "
});
formatter.match({
  "location": "BookAFlight.naviate_to_Flight_Selectio_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should select Flight",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should see available flight",
  "keyword": "Given "
});
formatter.match({
  "location": "BookAFlight.user_should_see_available_flight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should select flight and types",
  "keyword": "When "
});
formatter.match({
  "location": "BookAFlight.should_select_flight_and_types()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "continue the booking",
  "keyword": "And "
});
formatter.match({
  "location": "BookAFlight.continue_the_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "redirect to Extras page",
  "keyword": "Then "
});
formatter.match({
  "location": "BookAFlight.redirect_to_Extras_page()"
});
formatter.result({
  "status": "passed"
});
});