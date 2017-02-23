# README

## Spring Boot Customer Microservice

Microservices is a specialization of an implementation approach for service-oriented architectures (SOA) used to build flexible, independently deployable software systems. Services in a microservice architecture (MSA) are processes that communicate with each other over a network in order to fulfill a goal.

This project is a simple but functional example of Microservice using Spring Boot with oAuth2 Authentication. This project is mainly use to test [Zuul Server](https://github.com/mariocuellar1/zuul-server).

### How to install
It's an eclipse project, just import it and run. If you want to run more than one instance please use Spring profiles **instance1** and **instance2**.

### Parameters & Configuration
* **application.yml**
  * **security.oauth2.client.clientId**: Your client id. 
  * **security.oauth2.client.clientSecret** : Your client secret
  * **security.oauth2.resource.tokenInfoUri** : Oauth server location and checktoken URI. e.g: http://localhost:40051/oauth/check_token
  * **eureka.client.serviceUrl.defaultZone** : Eureka server URI(s)
  * **server.port** : Server Port

### How to test

Before you run this server you need to configure and init Eureka Server (or cluster) please make a look to [Eureka Server](https://github.com/mariocuellar1/eureka-server).  
You also need to configure and init your own Authorization Server, if you don't have one please take a look to our [Oauth2 Authorization Server](https://github.com/mariocuellar1/oauth-server-opaque)
This Microservice tries to register itself in Eureka Server, if Eureka server is down throws "java.net.ConnectException: Connection refused: connect" error, Microservice works but Zuul server not will be able to find it.

1. Configure application (application.yml above)
2. Start Microservice [rigth-clic, run  :) ]
3. Import postman project *CustomerMicroserviceTest.postman_collection.json* to postman
   * Get a valid aouth token using "Token - password" and set Authorization header in all other postman tests.
   * Test "Get all customers": List all customers
   * Test "Add Customers": Add new customer
   * Test "Get one customer": Retrieve data for one customer. You have to change URI to set a valid Customer Id.
   
   
And you Done !!!!  

### Notes:
- I use postman to test 'cause it's what I usually do :) , if you want, modify this readme adding other ways, CURL, junit, simple java ó whatever.
- Please feel free to add/modify/correct/update any part of this content as necessary

### Related Projects
- [Zuul Server](https://github.com/mariocuellar1/zuul-server)
- [Eureka Server](https://github.com/mariocuellar1/eureka-server)
- [oAuth Server](https://github.com/mariocuellar1/oauth-server-opaque)

### Other Projects:
- [Basic Resource Server using oauth and opaque token](https://github.com/mariocuellar1/basic-resource-server-opaque)
- [oAuth Server using JWT Token](https://github.com/mariocuellar1/oauth-server-jwt)
- [Basic Resource Server validating JWT Token](https://github.com/mariocuellar1/basic-resource-server-jwt)
- [Vehicles Microservice](https://github.com/mariocuellar1/vehicles-simple-microservice)
