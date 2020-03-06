
public class Batalha {

	
	public Batalha() {
		// TODO Auto-generated constructor stub
	}
	private ReinoDoFogo personagemFogo;
	private ReinoDoGelo personagemGelo;
	
	public ReinoDoFogo getPersonagemFogo() {
		return personagemFogo;
	}
	public void setPersonagemFogo(ReinoDoFogo personagemFogo) {
		this.personagemFogo = personagemFogo;
	}
	public ReinoDoGelo getPersonagemGelo() {
		return personagemGelo;
	}
	public void setPersonagemGelo(ReinoDoGelo personagemGelo) {
		this.personagemGelo = personagemGelo;
	}
			
	public String Vencedor(){
		if(personagemFogo.getPontosDeVida()>personagemGelo.getPontosDeVida()){
		return personagemFogo.getNome();
	}else{
		return personagemGelo.getNome();
	}
}
	public String Perdedor() {
		if(personagemGelo.getPontosDeVida()<personagemFogo.getPontosDeVida()) {
			return personagemGelo.getNome();
		}else {
			return personagemFogo.getNome();
		}
	}
	}


