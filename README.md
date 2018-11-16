# Simple JMS Example
This repository created to explain spring boot + jms + activemq integration 
easily based on publisher/subscriber pattern. The project contains embedded 
ActiveMQ instance for using as a message broker. You can just run and see 
how the application consume messages by consumers which is created dynamicaly.

The application basically;
* Creates 1000 instance of *jmsexample.model.EmailMessage* object 
* Convert them to json before sending to queue automatically through jackson by *jmsexample.config.JacksonConfig* configuration
* Send the json messages to broker
* The messages consumes by *jmsexample.listener.EmailMessageListener* 

