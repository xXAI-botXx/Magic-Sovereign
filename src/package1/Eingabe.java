package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Eingabe implements KeyListener , ActionListener, MouseListener {

	
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		Variablen.gedr�cktKey[e.getKeyCode()]= true;//die gedr�ckte taste wird im array f�r die tasten als true(gedr�ckt) ge�ndert
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Variablen.gedr�cktKey[e.getKeyCode()]= false;//nun wird die gedr�ckte taste im array wieder zur�ck gestellt, da sie ja nicht f�r immer als gedr�ckt (gespeichert) sein soll
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	public static boolean istKeyGedr�ckt(int keycode) {//methode zum �berpr�fen ob eine taste gedr�ckt wurde
		return Variablen.gedr�cktKey[keycode];
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
		
	}

}
