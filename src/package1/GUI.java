package package1;


import java.awt.Graphics;
import java.awt.image.BufferStrategy;


import javax.swing.JFrame;

public class GUI extends JFrame{ //in dieser klasse werden alle grafischen dinge und methoden von statten gehen (wie z.b das fenster), !zumindest werden hier alle grafischen dinge aufgerufen!
	
	
	private static final long serialVersionUID = 1L; //wurde automatisch hinzugefügt
			
			private BufferStrategy buffFrame; //dies "hilft" dem Frame, "zusätzliche" frames zur darstellung von mehreren bildern-> damit es beim rand weiter geht
			private Spielwelt spielwelt1;
			
	public GUI() {
		
		addKeyListener(new Eingabe());//die tastatureingabe wird dem fenster hinzugefügt, damit die tasten überhaupt erkannt werden
		
		
			spielwelt1 = new Spielwelt();	
	}
				

public void makeBuffFrame() {
				createBufferStrategy(2);
				buffFrame=getBufferStrategy();
}	
	
	
	
	
	public void repaint() {
		Graphics g = buffFrame.getDrawGraphics(); //das grafik objekt läuft über den buffer frame
		draw(g); // hier wird g (grafik) gezwichnet
		g.dispose();//lässt die grafik wieder verschwinden
		buffFrame.show(); //damit man die grafik auch sieht
		
	}
	
	public void draw(Graphics g) {//hier wird alles gezeichnet
		
		spielwelt1.draw(g);
		 
		
	}
	
	public void update() {//braucht den float der vergangenen zeit des letzten fensters um sie zu übergeben
		
		spielwelt1.update();
		
	}
	
	
}			