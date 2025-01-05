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
		
		Variablen.gedrücktKey[e.getKeyCode()]= true;//die gedrückte taste wird im array für die tasten als true(gedrückt) geändert
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Variablen.gedrücktKey[e.getKeyCode()]= false;//nun wird die gedrückte taste im array wieder zurück gestellt, da sie ja nicht für immer als gedrückt (gespeichert) sein soll
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	public static boolean istKeyGedrückt(int keycode) {//methode zum überprüfen ob eine taste gedrückt wurde
		return Variablen.gedrücktKey[keycode];
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
