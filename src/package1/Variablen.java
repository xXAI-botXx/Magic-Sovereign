package package1;

import java.awt.image.BufferedImage;

public class Variablen {
	
	//Fenster
	//public static String titel= "Magic Sovereign";
	public static int height = 600;
	public static int width = 800;
	public static int pausenZeit=250;
	//Fenster Ende
	
	//Tiles
	public static int tileGrößeX=40;
	public static int tileGrößeY=40;
	
	public static BufferedImage karte1 = Imageloader.loadImage("karte1");
	public static BufferedImage spieler_front =  Imageloader.loadImage("spieler_front");
	public static BufferedImage spieler_back =  Imageloader.loadImage("spieler_back");
	public static BufferedImage spieler_links =  Imageloader.loadImage("spieler_links");
	public static BufferedImage spieler_rechts =  Imageloader.loadImage("spieler_rechts");
	public static BufferedImage spieler_src =spieler_front;
	//tiles ende
	
	//Spielwelt
	public static boolean keinePause = true;
	public static boolean map1Test=true;
	public static boolean map2Test=false;
	public static int tilesWidth = 20;//früher 40
	public static int tilesHeight = 15;//früher 30
	public static int level = 0;
	

	  public static int map1[]={ -1, -1, -1, -1,  0,  0,  0,  0, -1, -1,  0,  0, -1, -1, -1, -1, -1, -1, -1, -1}; //für die spieler kollision und die erstellung der textures
	  public static int map2[]={ -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1};
	  public static int map3[]={ -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1};
	  public static int map4[]={ -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1,  0,  0, -1};
	  public static int map5[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1, -1,  0,  0, -1};
	  public static int map6[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1, -1,  0,  0, -1};
	  public static int map7[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1, -1,  0,  0, -1};
	  public static int map8[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1,  0,  0,  0, -1};
	  public static int map9[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1,  0,  0,  0, -1};
	 public static int map10[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int map11[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int map12[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};    
	 public static int map13[]={  0,  0, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int map14[]={  0,  0, -1,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0};
	 public static int map15[]={  0,  0, -1, -1,  0,  0,  0,  0,  0, -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0};
	

	  
	    
	  public static int map[][]={map1,map2,map3,map4,map5,map6,map7,map8,map9,map10,map11,map12,map13,map14,map15}; //15  (nach unten) * 40(blockgröße) = 600  
	 
	  /*
	  //map1-Beginn
	  public static int map1id1[]={  1,  1,  1,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10}; //für die spieler kollision und die erstellung der textures
	  public static int map2id1[]={-14,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1};
	  public static int map3id1[]={-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map4id1[]={-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map5id1[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map6id1[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map7id1[]={-14,  9,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map8id1[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map9id1[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map10id1[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map11id1[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map12id1[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};    
	 public static int map13id1[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map14id1[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map15id1[]={-14,-14,  5,  3,  3,  3,  3,  9, 13,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	
	public static int mapid1[][]= {map1id1,map2id1,map3id1,map4id1,map5id1,map6id1,map7id1,map8id1,map9id1,map10id1,map11id1,map12id1,map13id1,map14id1,map15id1};
	
	
	  //map1-Ende*/
	  
	  
	  //map2-Beginn
	  public static int map1id2[]={  1,  1,  1,  1,  1,  1,-10, 12,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10}; //für die spieler kollision und die erstellung der textures
	  public static int map2id2[]={-14,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1};
	  public static int map3id2[]={-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map4id2[]={-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map5id2[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map6id2[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map7id2[]={-14,  9,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map8id2[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	  public static int map9id2[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map10id2[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map11id2[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map12id2[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};    
	 public static int map13id2[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map14id2[]={-14,-14,  5,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	 public static int map15id2[]={-14,-14,  5,  3,  3,  3,  3,  9, 13,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3};
	
	public static int mapid2[][]= {map1id2,map2id2,map3id2,map4id2,map5id2,map6id2,map7id2,map8id2,map9id2,map10id2,map11id2,map12id2,map13id2,map14id2,map15id2};
	  //map2-Ende
	  
	//Spielwelt Ende
	
	
	
	//Spieler
	public static int laufRichtung;
	public static int xSpieler = 760; //x koordinate des spielers
	public static int ySpieler = 560; //y koordinate des spielers
	public static int xSpielerBewegung; //bewgung auf der x achse des Spielers
	public static int ySpielerBewegung; //bewgung auf der y achse des Spielers
	public static int widthSpieler = 40; // breite des spielers
	public static int heightSpieler = 40; // höhe des spielers
	public static boolean keineKollision = true;
	public static boolean spielerHatBewegt = false;
	//public static int pausenZähler = 100;
	
	  public static int spielerMap1[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0}; //für ortsbestimmung des spielers
	  public static int spielerMap2[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int spielerMap3[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int spielerMap4[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int spielerMap5[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int spielerMap6[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int spielerMap7[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int spielerMap8[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int spielerMap9[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int spielerMap10[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int spielerMap11[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int spielerMap12[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};    
	 public static int spielerMap13[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int spielerMap14[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int spielerMap15[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	

	  
	    
	  public static int spielerMap[][]={spielerMap1,spielerMap2,spielerMap3,spielerMap4,spielerMap5,spielerMap6,spielerMap7,spielerMap8,spielerMap9,spielerMap10,spielerMap11,spielerMap12,spielerMap13,spielerMap14,spielerMap15}; /*15  (nach unten) * 40(blockgröße) = 600  */
	 
	//Spieler Ende
	  
	  //magische Kreaturen-beginn
	  public static int mkMap1[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0}; //für ortsbestimmung des spielers
	  public static int mkMap2[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int mkMap3[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int mkMap4[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int mkMap5[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int mkMap6[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int mkMap7[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int mkMap8[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	  public static int mkMap9[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int mkMap10[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int mkMap11[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int mkMap12[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};    
	 public static int mkMap13[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int mkMap14[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	 public static int mkMap15[]={  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
	

	  
	    
	  public static int mkMap[][]={spielerMap1,spielerMap2,spielerMap3,spielerMap4,spielerMap5,spielerMap6,spielerMap7,spielerMap8,spielerMap9,spielerMap10,spielerMap11,spielerMap12,spielerMap13,spielerMap14,spielerMap15}; /*15  (nach unten) * 40(blockgröße) = 600  */
	 
	  //magische Kreaturen-Ende
	  
	
	//Tastatureingabe
	public static boolean gedrücktKey[] = new boolean[1024];//es gibt 1024 tasten´und jeder hat einen boolean
	//Tatsatureingabe ende
	
	//Magische kreatur
	public static int magischeKreaturenAnzahl;
	public static int magischekreaturen[];
	public static int meineKreaturen[];
	//magische kreatur ende
	
	public static boolean gameloop = true;
}
