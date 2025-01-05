package package1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Button extends JFrame{
	private JButton hinten;
	private JButton vorne;
	private JButton links;
	private JButton rechts;
	private JButton schließen;
	private JButton start;
	private JButton info;
	private JButton pause;
	private JButton musik;
	private Icon untenI = new ImageIcon(getClass().getResource("/resources/pfeil_unten.png"));
	private Icon obenI = new ImageIcon(getClass().getResource("/resources/pfeil_oben.png"));
	private Icon linksI = new ImageIcon(getClass().getResource("/resources/pfeil_links.png"));
	private Icon rechtsI = new ImageIcon(getClass().getResource("/resources/pfeil_rechts.png"));
	private Icon pauseI = new ImageIcon(getClass().getResource("/resources/pause.png"));
	private Icon keinepauseI = new ImageIcon(getClass().getResource("/resources/keinepause.png"));
	
	public Button() {
		//super("Steuerung");
		//setLayout(new FlowLayout());//vorgefertigtes layout
		setLayout(null);
		
		hinten=new JButton(untenI);
		hinten.setBounds(150, 300, 100, 100);
		vorne=new JButton(obenI);
		vorne.setBounds(150, 100, 100, 100);
		links=new JButton(linksI);
		links.setBounds(50, 200, 100, 100);
		rechts=new JButton(rechtsI);
		rechts.setBounds(250, 200, 100, 100);
		schließen=new JButton("schließen");
		schließen.setBounds(300, 0, 100, 100);
		pause = new JButton(pauseI);
		pause.setBounds(0, 0, 300,100);
		//pause.setBounds(150, 200, 100,100);
		musik = new JButton(">");
		musik.setBounds(360, 360, 40, 40);
		
		this.add(links);
		this.add(rechts);
		this.add(vorne);
		this.add(hinten);
		this.add(schließen);
		this.add(pause);
		this.add(musik);
		
		actionHandler buttonEingabe=new actionHandler();
		hinten.addActionListener(buttonEingabe);
		vorne.addActionListener(buttonEingabe);
		links.addActionListener(buttonEingabe);
		rechts.addActionListener(buttonEingabe);
		schließen.addActionListener(buttonEingabe);
		pause.addActionListener(buttonEingabe);
		musik.addActionListener(buttonEingabe);
		
	}
	
	public Button(String name) {
		
		super("Start");
		setLayout(new FlowLayout());//vorgefertigtes layout
		
		start = new JButton("Start");
		schließen = new JButton("Schließen");
		info = new JButton("Info");
		
		this.add(start);
		this.add(schließen);
		this.add(info);
		
		actionHandler buttonStart = new actionHandler();
		info.addActionListener(buttonStart);
		start.addActionListener(buttonStart);
		schließen.addActionListener(buttonStart);
		
	}
	
	

private class actionHandler implements ActionListener {	//klasse für die aktionen
	

	@Override
	public void actionPerformed(ActionEvent action) {
		if(Variablen.keineKollision == true) {
			if(Variablen.keinePause==true){
			
				
				if(action.getSource() == vorne) {//funktion des Buttons vorne
					if(Variablen.map[Variablen.ySpieler/40-1][Variablen.xSpieler/40]>-1) { 
						Variablen.ySpielerBewegung = -40; //wenn W gedrückt wird die bewegung(srichtung)geändert
						Variablen.spielerHatBewegt=true;
						Variablen.spieler_src=Variablen.spieler_back;
						Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=0;//die alte position wird auf null gestellt
						Variablen.spielerMap[(Variablen.ySpieler/40)-1][Variablen.xSpieler/40]=1;//die neue position wird im feld festgesetzt
						Variablen.laufRichtung = 1;
    
						Variablen.xSpieler += Variablen.xSpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird 
						Variablen.ySpieler += Variablen.ySpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird
					    //System.out.println("Position auf X auf fenster "+Variablen.xSpieler+". position Y auf fenster "+Variablen.ySpieler+". Position X und y auf map"+ Variablen.map[Variablen.xSpieler/20][Variablen.ySpieler/20]);
					}  
				}else if(action.getSource() == hinten) {//funktion des Buttons hinten
					if(Variablen.map[Variablen.ySpieler/40+1][Variablen.xSpieler/40]>-1) {
						Variablen.ySpielerBewegung = 40; //wenn S gedrückt wird die bewegung(srichtung)geändert
						Variablen.spielerHatBewegt=true;
						Variablen.spieler_src=Variablen.spieler_front;
						Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=0;//die alte position wird auf null gestellt
						Variablen.spielerMap[(Variablen.ySpieler/40)+1][Variablen.xSpieler/40]=1;//die neue position wird im feld festgesetzt
						Variablen.laufRichtung = 2;
    
						Variablen.xSpieler += Variablen.xSpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird 
						Variablen.ySpieler += Variablen.ySpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird
							//System.out.println("Position auf X auf fenster "+Variablen.xSpieler+". position Y auf fenster "+Variablen.ySpieler+". Position X und y auf map"+ Variablen.map[Variablen.xSpieler/20][Variablen.ySpieler/20]);
					}    
				}else if(action.getSource() == links) {//funktion des Buttons links
					if(Variablen.map[Variablen.ySpieler/40][Variablen.xSpieler/40-1]>-1) {
						Variablen.xSpielerBewegung = -40; //wenn A gedrückt wird die bewegung(srichtung)geändert
						Variablen.spielerHatBewegt=true;
						Variablen.spieler_src=Variablen.spieler_links;
						Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=0;//die alte position wird auf null gestellt
						Variablen.spielerMap[Variablen.ySpieler/40][(Variablen.xSpieler/40)-1]=1;//die neue position wird im feld festgesetzt
						Variablen.laufRichtung = 3;
    
						Variablen.xSpieler += Variablen.xSpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird 
						Variablen.ySpieler += Variablen.ySpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird
							//System.out.println("Position auf X auf fenster "+Variablen.xSpieler+". position Y auf fenster "+Variablen.ySpieler+". Position X und y auf map"+ Variablen.map[Variablen.xSpieler/20][Variablen.ySpieler/20]);
					}  
				}else if(action.getSource() == rechts) {//funktion des Buttons rechts
					if(Variablen.map[Variablen.ySpieler/40][Variablen.xSpieler/40+1]>-1) {
						Variablen.xSpielerBewegung =  40; //wenn D gedrückt wird die bewegung(srichtung)geändert
						Variablen.spielerHatBewegt=true;
						Variablen.spieler_src=Variablen.spieler_rechts;
						Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=0;//die alte position wird auf null gestellt
						Variablen.spielerMap[Variablen.ySpieler/40][(Variablen.xSpieler/40)+1]=1;//die neue position wird im feld festgesetzt
						Variablen.laufRichtung = 4;
					
						Variablen.xSpieler += Variablen.xSpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird 
						Variablen.ySpieler += Variablen.ySpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird
							//System.out.println("Position auf X auf fenster "+Variablen.xSpieler+". position Y auf fenster "+Variablen.ySpieler+". Position X und y auf map"+ Variablen.map[Variablen.xSpieler/20][Variablen.ySpieler/20]);
					}    
				} else if(action.getSource() == start) {
					dispose();
					//Game game = new Game();
					//package1.main();
					//Variablen.startGame = true;
					//String[] strings = new String[100];
					//Game.Game();
					
				}else if(action.getSource() == info) {
			
				
			    } }//die if(keinePause == true) endet hier, damit ich die pause beenden kann und das Spiel beendet werden kann
				if(action.getSource() == pause){
			    	if(Variablen.keinePause == true) {
			    		Variablen.keinePause = false;
			    	}else {
			    		Variablen.keinePause=true;
			    	
			    }
				}else if(action.getSource() == schließen) {//funktion des Buttons vorne
						System.exit(0);
				}else if(action.getSource() == musik) {
				/*	if(Variablen.musik == true) {
						Variablen.musik = false;
					}else {
						//Variablen.musik = true;
					}*/
				}
		  
		}
		
		
	}
}


    
    
    	
   	
 
 
	  
}    
	     
	    	
	    		
	    
	    	
	      
	    	
	    		
	    	
	      
	    	
	      
	    	
	    		
	    	
	      
	    	
	     
	    	
	    		
	    
	    
 
  
  
  

	
	

