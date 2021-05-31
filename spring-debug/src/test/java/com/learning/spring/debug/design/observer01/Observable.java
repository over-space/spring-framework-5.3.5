package com.learning.spring.debug.design.observer01;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public interface Observable {

    List<Observer> observers = new ArrayList<>();

    default void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    default void notify(String message){
        observers.forEach(observer -> observer.notify(message));
    }
}
