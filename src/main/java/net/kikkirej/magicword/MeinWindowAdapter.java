package net.kikkirej.magicword;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import net.kikkirej.magicword.actions.LockAction;

public class MeinWindowAdapter extends WindowAdapter {
	@Override
    public void windowClosing(WindowEvent e) {
        new LockAction().run();
    }
	
	@Override
	public void windowIconified(WindowEvent e) {
		new LockAction().run();
	}

	
}
