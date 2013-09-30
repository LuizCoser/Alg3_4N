import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		String cmd = "";
		Scanner sc = new Scanner(System.in);
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();


		while (!cmd.equals("fim")) {
			cmd = sc.next();
			if (cmd.equals("triangulo")) {
				Triangulo triangulo = new Triangulo();
				p0.setX(sc.nextInt());
				p0.setY(sc.nextInt());
				triangulo.setP0(p0);
				p1.setX(sc.nextInt());
				p1.setY(sc.nextInt());
				triangulo.setP1(p1);
				p2.setX(sc.nextInt());
				p2.setY(sc.nextInt());
				triangulo.setP2(p2);
		
			}
			if (cmd.equals("circulo")) {
				Circulo circulo = new Circulo();
				p0.setX(sc.nextInt());
				p0.setY(sc.nextInt());
				circulo.setP0(p0);
				circulo.setRaio(sc.nextInt());
			}
			
			if (cmd.equals("retangulo")) {
				Retangulo retangulo = new Retangulo();
				p0.setX(sc.nextInt());
				p0.setY(sc.nextInt());
				retangulo.setP0(p0);
				p1.setX(sc.nextInt());
				p1.setY(sc.nextInt());
				retangulo.setP1(p1);
			}
			
			if (cmd.equals("imagem")) {
				Imagem imagem = new Imagem();
				imagem.setWidth(sc.nextInt());
				imagem.setHeight(sc.nextInt());
				imagem.setCor(sc.next());
			}
			System.out.println(cmd);
			System.out.println(p0.getX());
			System.out.println(p0.getY());
			System.out.println(p1.getX());
			System.out.println(p1.getY());
			System.out.println(p2.getX());
			System.out.println(p2.getY());

		
		}

	}

}