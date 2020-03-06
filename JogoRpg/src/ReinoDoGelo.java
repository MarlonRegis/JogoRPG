
public class ReinoDoGelo extends Criacao {

	public ReinoDoGelo() {
		// TODO Auto-generated constructor stub
	}

	private String nome;
	int pontosDeVida;
	
	public void RetiraPontosDeVida(int p ) {
		pontosDeVida = pontosDeVida - p;
	}
	public void IncluiPontosDeVida(int p ) {
		pontosDeVida = pontosDeVida + p;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontosDeVida() {
		return pontosDeVida;
	}
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
}
