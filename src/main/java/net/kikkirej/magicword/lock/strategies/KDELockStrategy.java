package net.kikkirej.magicword.lock.strategies;

import java.io.IOException;

public class KDELockStrategy implements LockStrategy {
    @Override
    public void lock() throws IOException, Exception {
        Runtime.getRuntime().exec("qdbus org.freedesktop.ScreenSaver /ScreenSaver Lock");
    }
}
