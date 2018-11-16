# Simple JMS Example
This repository created to explain spring boot + jms + activemq integration 
easily based on publisher/subscriber pattern. The project contains embedded 
ActiveMQ instance for using as a message broker. You can just run and see 
how the application consume messages by consumers which is created dynamicaly.

The application basically;
* Create 1000 instance of *jmsexample.model.EmailMessage* objects
* Convert them to json before sending to queue automatically through jackson by *jmsexample.config.JacksonConfig* 
* Send the json messages to broker
* The messages consume by *jmsexample.listener.EmailMessageListener* 

