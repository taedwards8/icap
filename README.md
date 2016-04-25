# icap
Setup to run using Spring RESTful web service (https://spring.io/guides/gs/rest-service/)

To start application run the Maven command:

`mvn spring-boot:run`

To see the first n prime numbers where n is a number of your choosing go to url:

`http://localhost:8080/printPrimes?numberOfPrimes=n`

A list of integers will be returned.  For example

`http://localhost:8080/printPrimes?numberOfPrimes=3`

will return

`[2,3,5]`

To check whether i is a prime number where i is a number of your choosing go to url:

`http://localhost:8080/isAPrime?number=i`

A boolean value will be returned.  For example

`http://localhost:8080/isAPrime?number=5`

will return 

`true`

