package package1;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import package1.Imageloader;


public class Spieler {
	
	//private MagischeKreaturen.MagischeKreatur myFirst=new MagischeKreaturen.MagischeKreatur();
	//private MagischeKreaturen.MagischeKreatur meineKreaturen[];
	//private boolean min1MK;
	//protected BufferedImage aussehen;
	
   
    
  public Spieler() {
	 // Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=1;//spawn wird in der array spieler karte eingetragen
  //  aussehen = Imageloader.loadImage("spieler_front");
   // meineKreaturen[0]=myFirst;
  }
  
  public void draw(Graphics g) {//spieler wird gezeichnet
   /* g.setColor(Color.RED);
    g.fillRect(Variablen.xSpieler, Variablen.ySpieler, Variablen.widthSpieler, Variablen.heightSpieler);*/
    
   g.drawImage(Variablen.spieler_src, Variablen.xSpieler,Variablen.ySpieler , null);
  
  }
  
  
  
  public void update() { //spieler position wird mit dessen bewegung bageglichen
	 
	 
	spielPause();
	  
	spielerPosition();
	  
    kollision();
    
    
    if(Variablen.keinePause==true){
    if(Variablen.keineKollision == true) {
    if(Eingabe.istKeyGedr�ckt(87)) { 
    	Variablen.ySpielerBewegung = -40; //wenn W gedr�ckt wird die bewegung(srichtung)ge�ndert
    	Variablen.spielerHatBewegt=true;
    	Variablen.spieler_src=Variablen.spieler_back;
    	Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=0;//die alte position wird auf null gestellt
    	Variablen.spielerMap[(Variablen.ySpieler/40)-1][Variablen.xSpieler/40]=1;//die neue position wird im feld festgesetzt
    }
    	
   	if(Eingabe.istKeyGedr�ckt(68)) { 
   		Variablen.xSpielerBewegung =  40; //wenn D gedr�ckt wird die bewegung(srichtung)ge�ndert
   		Variablen.spielerHatBewegt=true;
   		Variablen.spieler_src=Variablen.spieler_rechts;
   		Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=0;//die alte position wird auf null gestellt
    	Variablen.spielerMap[Variablen.ySpieler/40][(Variablen.xSpieler/40)+1]=1;//die neue position wird im feld festgesetzt
    
   	}
   		
   	if(Eingabe.istKeyGedr�ckt(65)) { 
   		Variablen.xSpielerBewegung = -40; //wenn A gedr�ckt wird die bewegung(srichtung)ge�ndert
   		Variablen.spielerHatBewegt=true;
   		Variablen.spieler_src=Variablen.spieler_links;
   		Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=0;//die alte position wird auf null gestellt
    	Variablen.spielerMap[Variablen.ySpieler/40][(Variablen.xSpieler/40)-1]=1;//die neue position wird im feld festgesetzt
    
   	}
   		
   	if(Eingabe.istKeyGedr�ckt(83)) { 
   		Variablen.ySpielerBewegung = 40; //wenn S gedr�ckt wird die bewegung(srichtung)ge�ndert
   		Variablen.spielerHatBewegt=true;
   		Variablen.spieler_src=Variablen.spieler_front;
   		Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=0;//die alte position wird auf null gestellt
    	Variablen.spielerMap[(Variablen.ySpieler/40)+1][Variablen.xSpieler/40]=1;//die neue position wird im feld festgesetzt
    
   	}  
    }
 
   		
   Variablen.xSpieler += Variablen.xSpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird 
   Variablen.ySpieler += Variablen.ySpielerBewegung ; //die bewegung des spielers wird mit der vergangen zeit des letzten fensters abgeglichen, damit die bewegungen immer an der fps angepasst wird
    //System.out.println("Position auf X auf fenster "+Variablen.xSpieler+". position Y auf fenster "+Variablen.ySpieler+". Position X und y auf map"+ Variablen.map[Variablen.xSpieler/20][Variablen.ySpieler/20]);
    }
    
	  }
  
  
  
 /* public void kollision() {
	   if(Variablen.map[Variablen.ySpieler/40][Variablen.xSpieler/40] < 0) {
	  	  Variablen.keineKollision = false;
	    
       }
     }*/
	  
  
  
  
  
  
	  
	  
	  
	/*  //fensterabgrenzung/kollision  vlt weg machen und map grafisch auf map[][] abgrenzen				ich m�chte nur eine Kollision und das durch die Map
    if(Variablen.xSpieler < 0) { 
    	Variablen.xSpieler = 0;//falls der spieler am linken rand der map befindet bleibt er bei der grenze, hierbei braucht man den k�rper nicht mit einzu berechenen, da links oben der null punkt ist
    	
    } 
    
    if(Variablen.xSpieler + Variablen.widthSpieler > Variablen.width) { //geht out of bounds
    	Variablen.xSpieler = 800 - Variablen.widthSpieler;//falls der spieler au�erhalb der rechten seite ist bleibt er an der grenze, dabei muss man die k�rperbreite mit brerechnen
    	
    }
    	
    if(Variablen.ySpieler < 0) { 
    	Variablen.ySpieler = 0;//falls sich der spieler au�erhalb der oberen seite des fensters befinden bleibt er an der grenze
    }
    	
    if(Variablen.ySpieler + Variablen.heightSpieler > Variablen.height) {
    	Variablen.ySpieler = Variablen.height - Variablen.heightSpieler;//falls sich der spieler au�erhab der unteren seite befindet bleibt er an der grenze, mit einberchnung der k�rpergr��e
    	
    }*/
  
 
  
  public void kollision() {
	  Variablen.keineKollision = true;
	    //System.out.println("y"+yPosition + "x"+xPosition);
	      if(Eingabe.istKeyGedr�ckt(87)) {
	    	if(Variablen.map[Variablen.ySpieler/40-1][Variablen.xSpieler/40]<0) { 
	    		Variablen.keineKollision = false;
	    	}
	      }
	    	
	      if(Eingabe.istKeyGedr�ckt(68)) {
	    	if(Variablen.map[Variablen.ySpieler/40][Variablen.xSpieler/40+1]<0) {
	    		Variablen.keineKollision = false;
	    	}
	      }
	    	
	      if(Eingabe.istKeyGedr�ckt(83)) {
	    	if(Variablen.map[Variablen.ySpieler/40+1][Variablen.xSpieler/40]<0) {
	    		Variablen.keineKollision = false;
	    	}
	      }
	    	
	      if(Eingabe.istKeyGedr�ckt(65)) {
	    	if(Variablen.map[Variablen.ySpieler/40][Variablen.xSpieler/40-1]<0) {
	    		Variablen.keineKollision = false;
	    	}
	      }
	    
	    
 }
  
  /*Idee zum Gameplay:
   * 	Man hat neben dem Fenster vier Pfeile. Auf diese kann man mit der Maus dr�cken und der Spieler bewegt sich. Damit w�re es besser, da der Charakter immer einzelne Schritte tut und es dann nicht so komisch kommt. Zudem w�re es f�r die Kollision besser/einfacher. Vielleicht sind dann auch die anderen men�s links aus�en und nicht etwa durch einen Tastendruck(oder beides).*/
  
  public void spielerPosition() {
	  
	  Variablen.xSpielerBewegung = 0; //die bewegung wird am anfang des loops immer zur�ckgesetzt, sonst existiert die alte bewegung immer noch
	  Variablen.ySpielerBewegung = 0;
	  Variablen.spielerHatBewegt=false;
	  
	  for(int x = 0; x<Variablen.spielerMap.length;x++){
		  for(int y = 0; y < Variablen.spielerMap.length;y++) {
			  if(Variablen.spielerMap[y][x] == 1) {
				  Variablen.xSpieler=x*40;
				  Variablen.ySpieler=y*40;
				  //System.out.println("x: "+x+" und y: "+y+" . x*40: "+x*40+" und y*40: "+y*40);
	  
	 
			  }
		  }
	  
	  }
	   Variablen.spielerMap[Variablen.ySpieler/40][Variablen.xSpieler/40]=1;//ich wei� nicht ob sich das nicht mit der bewegung schneidet, wird die eins wieder entfernt beim bewegen?
  }
  
  
  public static void spielPause() {
	  
		if(Eingabe.istKeyGedr�ckt(32)) {
			if(Variablen.keinePause ==true){
				Variablen.keinePause = false;
				System.out.println("Pause wurde aktiviert.");
				//Variablen.pausenZeit=2000000000;
			}else{
				 Variablen.keinePause = true;
				 System.out.println("Pause wurde deaktiviert. ");
		 // Variablen.pausenZeit=250;
			}
			}
			
		  
		  
		 

}
  
  public void aktualisierenSpielersrc() {
	  
  }
  
  public void meineMagischenKreaturen() {
    
  }
  
}
