package com.javastudio.tutorial.api;

public interface DeliveryPlatform {

    void deliver(Email email);

    String getServiceStatus();

    AuthenticationStatus authenticate(Credentials credentials);
}
