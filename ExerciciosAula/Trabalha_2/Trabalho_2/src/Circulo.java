public class Circulo {

	
	private int raio;
	private Ponto ponto  = new Ponto();
	private Ponto centro = new Ponto();
	

	

	public void setRaio(int r){

		this.raio = r;

	}
	
	public void setCentro(int x, int y){
		this.centro.x = x;
		this.centro.y = y;
    }
	
	public void desenharCirculo(Cor cor, Imagem img) {
		
		int y = raio;
		int u = 1;
		int x = 0; 
		int E = 0; 
		int v = 2 * raio - 1; 
		
		while (x < y) {
			ponto.x = centro.x + x;
			ponto.y = centro.y + y;
			img.SetPixel(ponto, cor);

			ponto.x = centro.x + y;
			ponto.y = centro.y - x;
			img.SetPixel(ponto, cor);

			ponto.x = centro.x - x;
			ponto.y = centro.y - y;
			img.SetPixel(ponto, cor);

			ponto.x = centro.x - y;
			ponto.y = centro.y + x;
			img.SetPixel(ponto, cor);

		    x++; E += u; u += 2;

		    if (v < 2 * E){
		    	y--; 
		    	E -= v; 
		    	v -= 2;
		    }
		    if (x > y) 
		    	break;

			ponto.x = centro.x + y;
			ponto.y = centro.y + x;
			img.SetPixel(ponto, cor);

			ponto.x = centro.x + x;
			ponto.y = centro.y - y;
			img.SetPixel(ponto, cor);
		    
			ponto.x = centro.x - y;
			ponto.y = centro.y - x;
			img.SetPixel(ponto, cor);

			ponto.x = centro.x - x;
			ponto.y = centro.y + y;
			img.SetPixel(ponto, cor);
		}
	}

}
