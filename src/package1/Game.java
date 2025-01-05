package package1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;



public class Game { // diese klasse erzeugt und ruft alle dinge auf, also so zu sagen die steuerung

	public static void main(String[] args) {
		
		//Timer pause=new Timer();
		
		
		//Fenster beginn ->Erzeugung und Festlegung von Eigenschaften
		GUI fenster = new GUI(); //erzeugung des fensters
		fenster.setSize(Variablen.width, Variablen.height); //fenstergröße
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //damit sich das Spiel schließt, wenn man auf den x button drückt und nicht im hintergrund weiterläuft
		fenster.setLocationRelativeTo(null);	//das Fenster wird in der Mitte(null) erstellt
		//fenster.setLayout(null); //schau nach
		fenster.setUndecorated(true);//schaltet obere leiste aus
		//fenster.setTitle(Variablen.titel);	//gibt dem Fenster einen Namen
		fenster.setResizable(false);	//größe ist nicht mehr verstellbar
		fenster.setVisible(true);	//macht das fenster sichtbar	
		fenster.makeBuffFrame(); //damit das Fenster auch die "hilfe" bekommt, es ist so zu sagen ein bild hinter einem bild, damit gibt es weniger grafikfehler
		//Fenster Ende
		
		
		//Buttons beginn
		Button buttons=new Button();
		buttons.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttons.setSize(400,400);
		buttons.setUndecorated(true);
		buttons.setResizable(false);
		buttons.setVisible(true);
		//findet die Mitte des Bildschirms heraus und setzt das Fenster etwas daneben. Damit die Buttons nebendran sind
		 Dimension bildschirm = Toolkit.getDefaultToolkit().getScreenSize();
		  int x = bildschirm.width;
	      int y = bildschirm.height;
	     
	      int buttonX = (x - buttons.getWidth()) / 2;
	      int buttonY = (y - buttons.getHeight()) / 2;
	     
	      buttons.setLocation(buttonX+600, buttonY);
		
		//Buttons Ende
	      
	      
		
		
		while(Variablen.gameloop) { //gameloop, das herz des games
			//System.out.println("Spieler x Position: "+Variablen.xSpieler+" und y position: "+Variablen.ySpieler);
			
			  try {
			        
			        Thread.sleep(250);
			        
			      } catch (InterruptedException e) {			        
			        e.printStackTrace();
			      }
			
			fenster.update();
			
			fenster.repaint();//zeichnet es (neu)
			
			
			
			/*try { //dies ist für die performance und die Spielgeschwindigkeit
				TimeUnit.MILLISECONDS.sleep(12);	//verlangsamt den ablauf um 10 millisekunden, fps zahl sinkt //oder  Thread.sleep(10);
			
			}catch (InterruptedException e) { // falls dies nicht möglich ist
				e.printStackTrace();//es wird ein fehler ausgegeben
			}*/
			
			System.out.println("Spieler Position auf map: "+/*Variablen.map[*/Variablen.xSpieler/40/*][*/+" x.  "+Variablen.ySpieler/40+" y. "+"   Spieler Position "+Variablen.xSpieler+" x  "+Variablen.ySpieler+" y."); 
		   
			
		
		
		}
	}

}
