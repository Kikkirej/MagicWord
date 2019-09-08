package net.kikkirej.magicword.actions;

import net.kikkirej.magicword.lock.strategies.KDELockStrategy;
import net.kikkirej.magicword.lock.strategies.LockStrategy;
import net.kikkirej.magicword.lock.strategies.WindowsLockStrategy;

import java.io.IOException;

public class LockAction implements Runnable {

	@Override
	public void run() {
		try {
			LockStrategy lockStrategy = getLockStrategy();
			lockStrategy.lock();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private LockStrategy getLockStrategy() {
		String osname = System.getProperty("os.name");
		if(osname.toLowerCase().contains("windows")){
			return new WindowsLockStrategy();
		}else{
			return new KDELockStrategy();
		}
	}

	public static void main(String[] args) throws Exception {
		LockAction lockAction = new LockAction();
		LockStrategy lockStrategy = lockAction.getLockStrategy();
		System.out.println(lockStrategy);
		lockStrategy.lock();
	}

}
