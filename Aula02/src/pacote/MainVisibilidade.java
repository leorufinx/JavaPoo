package pacote;

public class MainVisibilidade {
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
	  //c1.ponta = 0.5f;
		c1.carga = 80;
		c1.status();
	}
}