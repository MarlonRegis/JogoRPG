
public class Cavaleiro extends ReinoDoFogo {

	public Cavaleiro() {

durabilidadeEspada=10;
	}
	private int durabilidadeEspada;
	
	public int usarEspada() {
		if(durabilidadeEspada>0){
			setDurabilidadeEspada(getDurabilidadeEspada()-1);
			return 1;
		}else{
			return 0;
		}
	}

	public int getDurabilidadeEspada() {
		return durabilidadeEspada;
	}

	public void setDurabilidadeEspada(int durabilidadeEspada) {
		this.durabilidadeEspada = durabilidadeEspada;
	}
	
	
}
