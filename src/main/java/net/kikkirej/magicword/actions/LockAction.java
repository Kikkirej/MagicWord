package net.kikkirej.magicword.actions;

import java.io.IOException;

public class LockAction implements Runnable {

	@Override
	public void run() {
		try {
			Runtime.getRuntime().exec("C:\\Windows\\System32\\rundll32.exe user32.dll,LockWorkStation");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
