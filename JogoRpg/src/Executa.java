
public class Executa {

	public Executa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//***ReinoDoFogo***
		Cavaleiro cv = new Cavaleiro();
		cv.setNome("LanceLot");
		cv.setPontosDeVida(10);
		
		Mago mg = new Mago();
		mg.setNome("Gandalf");
		mg.setPontosDeVida(10);
		
		//***ReinoDoGelo***
		
		Fada fd = new Fada();
		fd.setNome("Sininho");
		fd.IncluiPontosDeVida(10);
		
		Monstro mt = new Monstro();
		mt.setNome("Smigol");
		mt.IncluiPontosDeVida(10);
		
		//Batalha
		
		Batalha bt = new Batalha();
		bt.setPersonagemFogo(cv);
		bt.setPersonagemGelo(fd);
		
		cv.RetiraPontosDeVida(fd.usarMagia()); //Fada Ataca Cavaleiro
		
		fd.RetiraPontosDeVida(cv.usarEspada()); //Cavaleiro Ataca Fada
		fd.RetiraPontosDeVida(cv.usarEspada()); //Cavaleiro Ataca Fada	
		
		cv.RetiraPontosDeVida(fd.usarMagia()); //Fada Ataca Cavaleiro
		cv.RetiraPontosDeVida(fd.usarMagia()); //Fada Ataca Cavaleiro
		cv.RetiraPontosDeVida(fd.usarMagia()); //Fada Ataca Cavaleiro
		cv.RetiraPontosDeVida(fd.usarMagia()); //Fada Ataca Cavaleiro
		cv.RetiraPontosDeVida(fd.usarMagia()); //Fada Ataca Cavaleiro
		cv.RetiraPontosDeVida(fd.usarMagia()); //Fada Ataca Cavaleiro
		cv.RetiraPontosDeVida(fd.usarMagia()); //Fada Ataca Cavaleiro
		
		
		System.out.println("A fada tem " +fd.getPontosDeVida());
		System.out.println("O cavaleiro tem " +cv.getPontosDeVida());
		
		System.out.println("O vencedor é: " +bt.Vencedor());
		System.out.println("O perdedor é: " +bt.Perdedor());
	}

}
