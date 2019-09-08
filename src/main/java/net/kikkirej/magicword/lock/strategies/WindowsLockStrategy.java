package net.kikkirej.magicword.lock.strategies;

import java.io.IOException;

public class WindowsLockStrategy implements LockStrategy {
    @Override
    public void lock() throws Exception {
        Runtime.getRuntime().exec("C:\\Windows\\System32\\rundll32.exe user32.dll,LockWorkStation");
    }
}
