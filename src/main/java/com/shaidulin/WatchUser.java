package com.shaidulin;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchUser {

    private final List<Watch> watches;

    private int currentIndex = 0;

    public WatchUser(List<Watch> watches) {
        if (watches.isEmpty()) {
            throw new IllegalStateException("No beans of type Watch found");
        }
        this.watches = watches;
    }

    public String startWatch() {
        return watches.get(currentIndex).start();
    }

    public String stopWatch() {
        return watches.get(currentIndex).stop();
    }

    public void changeWatch() {
        currentIndex = (currentIndex + 1) % watches.size();
    }
}