# spring-cloud-stream-consumer

#####Prerequisites - Setting up RabbitMQ with Spring Cloud Stream

Getting RabbitMQ

It is easy to set-up RabbitMQ locally. You can follow the official download and installation guide when dealing with serious deployment. Here I want to show you how to get RabbitMQ locally in a really easy way. If you do not already have a Docker installed- get it from the official website. 

Assuming you already have Docker on your machine, the official docker hub repository for RabbitMQ is here. It contains plenty of useful information about running and setting up RabbitMQ with Docker. For now you won’t be needing all that as we are starting with just a single command:

```docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672  -p 5672:5672 rabbitmq:3-management```