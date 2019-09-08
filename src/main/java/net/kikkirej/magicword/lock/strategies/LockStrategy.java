package net.kikkirej.magicword.lock.strategies;

import java.io.IOException;

public interface LockStrategy {
    void lock() throws IOException, Exception;
}
