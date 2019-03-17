$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Ramesh Aravind/eclipse-TestNG/CucumberRamesh/src/test/resources/Features/PaymentGateway.feature");
formatter.feature({
  "name": "To validate payment gateway",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Payment Gateway",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "The user is in payment gateway page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user select quantity \"\u003cquantity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user click buynow button",
  "keyword": "And "
});
formatter.step({
  "name": "The user fill the card details \"\u003ccard_nmuber\u003e\",\"\u003cmonth\u003e\",\"\u003cyear\u003e\",\"\u003ccvv_code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The user click pay button",
  "keyword": "And "
});
formatter.step({
  "name": "The user should see the success message and order id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "quantity",
        "card_nmuber",
        "month",
        "year",
        "cvv_code"
      ]
    },
    {
      "cells": [
        "1",
        "4330030149383044",
        "02",
        "2026",
        "233"
      ]
    },
    {
      "cells": [
        "2",
        "4330030149383044",
        "03",
        "2028",
        "233"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Payment Gateway",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "The user is in payment gateway page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentGateway.the_user_is_in_payment_gateway_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select quantity \"1\"",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentGateway.the_user_select_quantity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click buynow button",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentGateway.the_user_click_buynow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill the card details \"4330030149383044\",\"02\",\"2026\",\"233\"",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentGateway.the_user_fill_the_card_details(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click pay button",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentGateway.the_user_click_pay_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the success message and order id",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentGateway.the_user_should_see_the_success_message_and_order_id()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Payment Gateway",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "The user is in payment gateway page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentGateway.the_user_is_in_payment_gateway_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select quantity \"2\"",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentGateway.the_user_select_quantity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click buynow button",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentGateway.the_user_click_buynow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill the card details \"4330030149383044\",\"03\",\"2028\",\"233\"",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentGateway.the_user_fill_the_card_details(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click pay button",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentGateway.the_user_click_pay_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the success message and order id",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentGateway.the_user_should_see_the_success_message_and_order_id()"
});
formatter.result({
  "status": "passed"
});
});