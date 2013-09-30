
public class Imagem {
	private int width;
	private int height;
	private String cor;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		if (cor.equals("c") || cor.equals("C"))
		this.cor = "c";
		else this.cor = "g";
	}

	public void setPixel(Ponto p, Cor c) {
		
	}
	
	public void addShape(Shape s, Cor c) {
		
	}

}
