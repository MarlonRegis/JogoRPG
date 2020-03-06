
public class Fada extends ReinoDoGelo {

private int durabilidadeMagia ;

public int getDurabilidadeMagia() {
	return durabilidadeMagia;
}
public void setDurabilidadeMagia(int durabilidadeMagia) {
	this.durabilidadeMagia = durabilidadeMagia;
}

public void incluirPontosDeVida(int p){
	p= 3;
	setPontosDeVida(getPontosDeVida() + p);
}

public int usarMagia() {
	if(durabilidadeMagia>0){
		setDurabilidadeMagia(getDurabilidadeMagia()-1);
		return 1;
	}else{
		return 0;
	}
}
Fada(){
		durabilidadeMagia = 10;
	}
}
