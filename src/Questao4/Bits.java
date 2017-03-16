package Questao4;

public class Bits {
	private boolean[] b;
	
	public Bits(int n){
		b = new boolean[n];
	}

	public boolean[] getB() {
		return b;
	}

	public void setB(boolean v, int n) {
		this.b[n] = v;
	}
	public Bits or(Bits bt) throws Exception{
		Bits t = new Bits(b.length);
		if(bt.getB().length != this.b.length){
			throw new Exception("Tamanho diferentes");
		}else{
			for (int i = 0; i < b.length; i++) {
				t.setB(b[i]|| bt.getB()[i], i);
			}
		}
		return t;
		
	}
	public Bits and(Bits bt) throws Exception{
		Bits t = new Bits(b.length);
		if(bt.getB().length != this.b.length){
			throw new Exception("Tamanho diferentes");
		}else{
			for (int i = 0; i < b.length; i++) {
				t.setB(b[i]&& bt.getB()[i], i);
			}
		}
		return t;
		
	}

	public String toString(){
		String b2 = "";
		for(int k=0;k<b.length;k++){
			if(b[k]==true){
				b2+="1";
			}
			else if(b[k]==false){
			
				b2+="0";
			}
			
		}
		return b2;
	}

	
	

}
