package com.shaidulin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WatchApplicationTests {

    @Autowired
    private WatchUser watchUser;

    @Test
    void test() {
        assertEquals("Timer started", watchUser.startWatch());
        assertEquals("Timer stopped", watchUser.stopWatch());
        watchUser.changeWatch();

        assertEquals("Alarm started", watchUser.startWatch());
        assertEquals("Alarm stopped", watchUser.stopWatch());
        watchUser.changeWatch();

        assertEquals("Clock started", watchUser.startWatch());
        assertEquals("Clock stopped", watchUser.stopWatch());
        watchUser.changeWatch();

        assertEquals("Timer started", watchUser.startWatch());
        assertEquals("Timer stopped", watchUser.stopWatch());
        watchUser.changeWatch();

        assertEquals("Alarm started", watchUser.startWatch());
        assertEquals("Alarm stopped", watchUser.stopWatch());
        watchUser.changeWatch();

        assertEquals("Clock started", watchUser.startWatch());
        assertEquals("Clock stopped", watchUser.stopWatch());

    }

}
