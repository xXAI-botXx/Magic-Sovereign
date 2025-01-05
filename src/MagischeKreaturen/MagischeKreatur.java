package MagischeKreaturen;

public class MagischeKreatur {//vlt machst du für jede kreatur eine einzelne klasse und sie erben von dieser oder mit dieser werden sie aufgerufen, eins von beidem

	private boolean gehörtSpieler = false;
	private boolean istFrei = false;
	private int magischeKreaturID;
	private int magischeKreaturen[];
	private int leben;
	private int maxLeben;
	private int ausdauer;
	private int maxAusdauer;
	private int mana;
	private int maxMana;
	private boolean lebendig = true;
	
	public MagischeKreatur() {//Konstruktor
		package1.Variablen.magischeKreaturenAnzahl = package1.Variablen.magischeKreaturenAnzahl + 1;//counter
		magischeKreaturID=package1.Variablen.magischeKreaturenAnzahl;//setzt id
	}
	
	
	public MagischeKreatur(int kind) {
		
		
		istFrei=true;
		
	}
	
	
	//Methoden
		//getter
	public int getID() {
		return magischeKreaturID;
	}
	
	public int getLeben() {
		return leben;
	}
	
	public int getMaxLeben() {
		return maxLeben;
	}
	
	public int getAusdauer() {
		return ausdauer;
	}
	
	public int getMaxAusdauer() {
		return maxAusdauer;
	}
	
	public int getMana() {
		return mana;
	}
	
	public int getMaxMana() {
		return maxMana;
	}
	
	public boolean getLebendig() {
		return lebendig;
	}
	
		//setter
	
	public void setLeben(int i) {
		leben=i;
	}
	
	public void setMaxLeben(int i) {
		maxLeben=i;
	}
	
	public void setAusdauer(int i) {
		ausdauer=i;
	}
	
	public void setMaxAusdauer(int i) {
		maxAusdauer=i;
	}
	
	public void setMana(int i) {
		mana=i;
	}
	
	public void setMaxMana(int i) {
		maxMana=i;
	}
	
	public void lebenAbzug(int abzug){
		leben=leben-abzug;
	}
	
	public void lebenGewinnung(int hinzu) {
		if(leben+hinzu > maxLeben) {
			leben=maxLeben;
		}else {
		    leben=leben+hinzu;
		 }
		
		if(leben<=0) {
			gestorben();
		}
		//und das bei allen/m
	}
	
	public void maxLebenGewinnung(int hinzu) {
	
			maxLeben=maxLeben+hinzu;
		
	}
	
	public void ausdauerAbzug(int abzug) {
		ausdauer=ausdauer-abzug;
	}
	
	public void ausdauerGewinnung(int hinzu) {
		if(ausdauer+hinzu > maxAusdauer) {
			ausdauer=maxAusdauer;
		}else {
		ausdauer=ausdauer+hinzu;
		 }
	}
	
	public void maxAusdauerGewinnung(int hinzu) {
		maxAusdauer=maxAusdauer+hinzu;
	}
	
	public void manaAbzug(int abzug) {
		mana=mana-abzug;
	}
	
	public void manaGewinnung(int hinzu) {
		if(mana+hinzu > maxMana) {
			mana=maxMana;
		}else {
			mana=mana+hinzu;
		 }
	}
	
	public void maxManaGewinnung(int hinzu) {
		maxMana=maxMana+hinzu;
	}
	
	public void gestorben() {
		lebendig=false;
	}
	
	public void magischekreaturgefangen() {
		gehörtSpieler=true;
	}	
}
