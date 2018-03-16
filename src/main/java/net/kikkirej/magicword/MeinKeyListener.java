package net.kikkirej.magicword;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import net.kikkirej.magicword.actions.NedryAction;

public class MeinKeyListener implements KeyListener {

	int[] chars = {80, 76, 69, 65, 83, 69};
		
	
	int index = 0;
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		if(NedryAction.didRun) {
			return;
		}
		arg0.getKeyCode();
		try {
			if(chars[index] == arg0.getKeyCode()){
				index++;
				if(chars.length == index+1) {
					System.exit(0);
				}
			}else {
				new NedryAction().run();
			}
		} catch (Exception e) {
			new NedryAction().run();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

}
