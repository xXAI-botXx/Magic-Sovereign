package package1;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import package1.Imageloader;

public class Spielwelt {

 
  
  private Spieler spieler1;
  
  

  
  public Spielwelt() {
    
	 
    
    spieler1 = new Spieler();
    
  
    
  }
  
 
  
  public void update() {
    
	  ladenNexteMap();
   
    spieler1.update();//spieler bewegung wird geupdatet und an fps angepasst
    
  }
  
  public void draw(Graphics g) {
    
    g.setColor(Color.GRAY);
    g.fillRect(0, 0, Variablen.width, Variablen.height);
   
   
   
		g.drawImage(Variablen.karte1, 0,0, null);
	
    spieler1.draw(g);//spieler wird gezeichnet
  }
  
  
  
  public void ladenNexteMap() {
	  
	 
	  
	  
			  
			  if(Variablen.map[Variablen.ySpieler/40][Variablen.xSpieler/40]==2){//laden der Map 2
				/* Variablen.xSpieler=360;
				 Variablen.ySpieler=40;
				 Variablen.spielerMap[9][15]=0;
				 Variablen.spielerMap[9][1]=1;*/
				  
				 
				  Variablen.map1Test=false;
				  Variablen.map2Test=true;
				  
				  if(Variablen.map1Test==true) {
				 
				  System.out.println("Beginn-ladenNexteMap wurde durchgeführt.-Ende ");
				  
				  }
					  
				  
			  
			  }
			  
			  if(Variablen.map[Variablen.ySpieler/40][Variablen.xSpieler/40]==3) {
				
				  Variablen.map1Test=true;
				  Variablen.map2Test=false;
				  
				  if(Variablen.map2Test == true) {
				  
				  
				  System.out.println("Beginn-ladenNexteMap wurde durchgeführt.-Ende ");
				  
				
					  
				    }
				  
			  }
			  
	/*		  public void kampf(int id) {
					 JFrame kampf=new JFrame(); 
					 
					/* Dimension bildschirm = Toolkit.getDefaultToolkit().getScreenSize();
					  int x = bildschirm.width;
				      int y = bildschirm.height;
				     
				      int kampfX = (x - kampf.getWidth()) / 2;
				      int kampfY = (y - kampf.getHeight()) / 2;
				     
				      kampf.setLocation(kampfX-400, kampfY);  \
				      
					  kampf.setLocationRelativeTo(null);
				      kampf.setUndecorated(true);
					  kampf.setSize(Variablen.width, Variablen.height); //fenstergröße
					  kampf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //damit sich das Spiel schließt, wenn man auf den x button drückt und nicht im hintergrund weiterläuft
					  kampf.setResizable(false);
					  kampf.setVisible(true);
					  prüfeGewonnen(id);
						//buttons hinzufügen
				  }
				  
				  public void überprüfeGegner() {
					  if(Variablen.mkMap[Variablen.ySpieler/40][Variablen.xSpieler/40]==1) {//vlt anders herum y,x
						//  kampf(1);
					  }
				  }
				  
				 
				  
				// public void prüfeMK() {	  
				//  }
				 
				 public void gestorben() {
					 
				 }
				 
				 
				 
				 public void prüfeGewonnen(int id) {
					/* if(Variablen.magischeKreaturen[id].getLeben() =< 0) {
						 gewonnen();
					 }  \
				 }
				 
				 public void gewonnen() {
					 
				 }
				 
				 public void gegnerZug() {
					 if(Variablen.aktion == true) {
						 Variablen.aktion=false;
						 //angriff von gegner
					 }
				 }
				 
				 //man hat einen aktionszähler,diser wird auf true gesetzt wenn ein angriff oder ein item eingesetzt wurde und dann gibt es einen feindlichen angriff wenn es true ist und es wird dann wird auf false gestzt
				  
				 
				 public void musik() {
					
					//musik beginn
					 
//					 if(Variablen.musik == true)
//							try {
//								FileInputStream file2 = new FileInputStream("src/audio/001 Pokemon Exploration Team Theme.mp3");
//							   	 Player musik = new Player(file2);
//							   	 musik.play();
//							}catch(FileNotFoundException e) {
//								e.printStackTrace();
//							}catch(JavaLayerException e2) {
//						   	  e2.printStackTrace();
//						     }
				 
					 }
						//musik ende
				     */
				    	
	  
  }
  
  
  public void kampf() {
	  
  }
  
}
