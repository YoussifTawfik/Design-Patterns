package com.design.patterns.Behavioral.Observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String channelName, String courseName) {
        System.out.format("Hey %s, %s uploaded a new Video: %s\n",name,channelName,courseName);
    }
}
