package net.kikkirej.magicword;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;

public class MagicWord {
	
	
	public static ArrayList<ImagePanel> arrayList;

	public static void main(String[] args) throws AWTException {
		arrayList = new ArrayList<ImagePanel>();
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] gs = ge.getScreenDevices();
		for (GraphicsDevice graphicsDevice : gs) {
			JFrame jFrame = new JFrame();
			jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			jFrame.setUndecorated(true);
			jFrame.setAlwaysOnTop(true);
			Rectangle bounds = graphicsDevice.getDefaultConfiguration().getBounds();
			BufferedImage capture = new Robot().createScreenCapture(bounds);
			ImagePanel imagePanel = new ImagePanel(capture);
			jFrame.setContentPane(imagePanel);
			arrayList.add(imagePanel);
			jFrame.setVisible(true);
			graphicsDevice.setFullScreenWindow(jFrame);
			jFrame.addWindowListener(new MeinWindowAdapter());
			jFrame.addMouseListener(new MeinMouseListener());
			jFrame.addKeyListener(new MeinKeyListener());
			
		}

	}
	

}
