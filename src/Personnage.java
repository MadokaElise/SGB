public class Personnage {
	
	
	private int mana;
	private int pvs;
	private int force;
	private int agilite;
	

	public Personnage(){
		
		mana=0;
		pvs=0;
		force=0;
		agilite=0;
	}

	
	public Personnage(int pmana, int ppvs, int pagilite, int pforce){
		
		mana=pmana;
		pvs=ppvs;
		force=pforce;
		agilite=pagilite;
		
	}
	
	public int getMana(){
		
		return mana;
	}
	
	public int getPvs(){
		
		return pvs;
	}
	public int getForce(){
		
		return force;
	}
	public int getAgilite(){
		
		return agilite;
	}

	public void setPVs(int ppvs){
		this.pvs=ppvs;
	}
	public void setMana(int pmana){
		this.mana=pmana;
	}
	public void setForce(int pforce){
		this.force=pforce;
	}
	public void setAgilite(int pagilite){
		this.agilite=pagilite;
	}
}

