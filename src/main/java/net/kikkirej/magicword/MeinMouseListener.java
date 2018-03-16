package net.kikkirej.magicword;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import net.kikkirej.magicword.actions.NedryAction;

public class MeinMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		new NedryAction().run();

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		new NedryAction().run();

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		new NedryAction().run();

	}

}
