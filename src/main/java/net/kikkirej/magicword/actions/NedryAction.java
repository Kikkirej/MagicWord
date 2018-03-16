package net.kikkirej.magicword.actions;

import java.awt.Image;
import java.awt.Toolkit;

import net.kikkirej.magicword.ImagePanel;
import net.kikkirej.magicword.MagicWord;

public class NedryAction implements Runnable {

	public static boolean didRun;
	
	@Override
	public void run() {
//		new LockAction().run();
		if(didRun) {
			return;
		}
		didRun=true;
		Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
		Image image = defaultToolkit.getImage(getClass().getClassLoader().getResource("nedry.gif"));
//		JFrame jFrame = new JFrame();
//		jFrame.setContentPane(new ImagePanel(image));
//		jFrame.setAlwaysOnTop(true);
//		jFrame.addWindowListener(new MeinWindowAdapter());
//		jFrame.setLocation(200, 200);
//		jFrame.setSize(220,220);
//		jFrame.setVisible(true);
		
		for (ImagePanel imagePanel : MagicWord.arrayList) {
			imagePanel.setImage(image);
			imagePanel.repaint();
		}
	}

}
