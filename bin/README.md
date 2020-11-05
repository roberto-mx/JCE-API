Jalisco con empleo API
======================

Backend repository for the *Jalisco con empleo* project.

Jalisco Con Empleo backend is in [https://jce-api.herokuapp.com/](jce-api.herokuapp.com)

Jalisco Con Empleo front end is in [https://jaliscoempleo.herokuapp.com/home](jaliscoempleo.herokuapp.com)

Requirements:
* java jdk 8
* maven
* git

Execute maven on localhost: `mvn boot-strap:run`

**Current version: v0.0.1.061020**


**v0.0.1.061020 version notes:**
* Base project archetype added and basic functionality
* Use of H2 database for demo deployed on heroku

Next release
* Add filters by ranking
* Add filters by location
* Add module for service providers evaluation from customer
* Allows service providers to upload pictures of their own work
* Show path of pictures of service providers
* Auth Layer for customer and service providers

Backlog
* Validate information of service providers 
* Implement openAPI
* Change db to PostgreSQL
* Refine relationships in POJOs classes
* Create a description on README file
* Deploy on AWS
* Change to gradle
