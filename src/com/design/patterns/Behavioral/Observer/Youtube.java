package com.design.patterns.Behavioral.Observer;

public class Youtube {

    public static void main(String[] args) {
        Subscriber sub1=new Subscriber("Youssif");
        Subscriber sub2=new Subscriber("Saad");
        Subscriber sub3=new Subscriber("Tawfik");

        Channel ch=new Channel("CS Concepts");

        ch.register(sub1);
        ch.register(sub2);
        ch.register(sub3);

        ch.uploadVideo("Design Patterns Course");

        ch.unregister(sub2);
        ch.uploadVideo("SOLID Principles");
    }
}
