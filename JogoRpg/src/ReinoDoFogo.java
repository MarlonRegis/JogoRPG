
public class ReinoDoFogo extends Criacao{

	public ReinoDoFogo() {
		// TODO Auto-generated constructor stub
	}
	private String nome;
	private int PontosDeVida;
		
	public void RetiraPontosDeVida(int p ) {
		
		PontosDeVida = PontosDeVida - p;
			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontosDeVida() {
		return PontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		PontosDeVida = pontosDeVida;
	}
	
	
	
	
	
}
