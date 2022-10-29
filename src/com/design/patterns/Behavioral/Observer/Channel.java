package com.design.patterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private String name;
    private List<Observer> observerList;
    private String videoName;

    public Channel(String name) {
        this.name = name;
        observerList=new ArrayList<>();
    }

    public void uploadVideo(String videoName){
        this.videoName=videoName;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(obs->obs.update(name, videoName));
    }
}
