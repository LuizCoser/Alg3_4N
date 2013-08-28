import

java.util.ArrayList;

import

java.util.Collections;

public class Jogo {

	public static void main(String[] args) {

		String[] naipe = {

		"O", "P", "C", "E" };

		String[] carta = {

		"A", "2", "3", "4", "5", "6", "7", "8", "9", "X", "J", "Q", "K" };

		ArrayList<String> baralho =

		new ArrayList<String>();

		for (int i = 0; i < carta.length; i++) {

			baralho.add(carta[i] + naipe[0]);

			baralho.add(carta[i] + naipe[1]);

			baralho.add(carta[i] + naipe[2]);

			baralho.add(carta[i] + naipe[3]);

		}

		Collections.shuffle(baralho);

		System.

		out.println("----------ANTES DE DAR AS CARTAS----------");

		System.

		out.println("Baralho atual: " + baralho);

		System.

		out.println(baralho.size() + " cartas no baralho");

		ArrayList<String> j1 =

		new ArrayList<String>();

		ArrayList<String> j2 =

		new ArrayList<String>();

		ArrayList<String> j3 =

		new ArrayList<String>();

		ArrayList<String> j4 =

		new ArrayList<String>();

		for (int i = 0; i < 5; i++) {

			j1.add(baralho.get(i));

			j2.add(baralho.get(i + 1));

			j3.add(baralho.get(i + 2));

			j4.add(baralho.get(i + 3));

			baralho.remove(i);

			baralho.remove(i + 1);

			baralho.remove(i + 2);

			baralho.remove(i + 3);

		}

		System.

		out.println("----------DEPOIS DE DAR AS CARTAS----------");

		System.

		out.println("Baralho atual: " + baralho);

		System.

		out.println(baralho.size() + " cartas no baralho");

	}

}