
public class Mago extends ReinoDoFogo {

	public Mago() {
		// TODO Auto-generated constructor stub
	}

	private int quantidadePoMagico;

	public int getQuantidadePoMagico() {
		return quantidadePoMagico;
	}

	public void setQuantidadePoMagico(int quantidadePoMagico) {
		this.quantidadePoMagico = quantidadePoMagico;
	}
	
	public int usarPoMagico(){
		setQuantidadePoMagico(getQuantidadePoMagico()-1);
		if(quantidadePoMagico > 0){
			return 1;
		}else{
			return 0;
		}
		
	}
	public void incluirPontosDeVida(){
		setPontosDeVida(getPontosDeVida()+1);
	}
	
}