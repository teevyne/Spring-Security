Spring Boot, MongoDB: JWT Authentication with Spring Security

This tutorial helps you build a Spring Boot Authentication (Login & Registration) & role-based 
Authorization example with JWT, Spring Security and Spring Data MongoDB. You’ll know:

    Appropriate Flow for User Signup & User Login with JWT Authentication
    Spring Boot Application Architecture with Spring Security
    How to configure Spring Security to work with JWT
    How to define Data Models and association for Authentication and Authorization
    Way to use Spring Data MongoDB to interact with MongoDB Database
    
Contents

    Spring Boot JWT Authentication with MongoDB example
    Spring Boot Signup & Login with JWT Authentication Flow
    Spring Boot Server Architecture with Spring Security
    Technology
    Project Structure
    Setup new Spring Boot project
    Configure Spring Data MongoDB & App properties
    Create the models
    Implement Repositories
    Configure Spring Security
    Implement UserDetails & UserDetailsService
    Filter the Requests
    Create JWT Utility class
    Handle Authentication Exception
    Define payloads for Spring RestController
    Create Spring RestAPIs Controllers
    Run & Test
    
    
    Spring Boot JWT Authentication with MongoDB example

Let’s me describe our Spring Boot application.

    User can signup new account, or login with username & password.
    By User’s role (admin, moderator, user), we authorize the User to access resources (role-based Authorization)

So we’re gonna provide APIs as following table:
Methods	Urls	Actions
POST	/api/auth/signup	signup new account
POST	/api/auth/signin	login an account
GET	/api/test/all	retrieve public content
GET	/api/test/user	access User’s content
GET	/api/test/mod	access Moderator’s content
GET	/api/test/admin	access Admin’s content

– Spring Security will manage cors, csrf, session, rules for protected resources, authentication & authorization along with exception handler.
– The database we will use is MongoDB which can be accessed by the help of Spring Data MongoDB.