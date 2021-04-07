package app;

import javax.swing.JOptionPane;

import figurasRegulares.Circulo;
import figurasRegulares.Quadrado;
import figurasRegulares.Triangulo;
import figurasRegulares.Pentagono;
import figurasRegulares.Hexagono;

public class Principal {

	/**
	 * Referencias para as classes Triangulo e Circulo
	 */
	static Circulo circulos[] = new Circulo[0];
	static Triangulo triangulos[] = new Triangulo[0];
	static Quadrado quadrados[] = new Quadrado[0];
	static Pentagono pentagonos[] = new Pentagono[1];
	static Hexagono hexagonos[] = new Hexagono[0];

	
	public static void criarFiguraRegular() {
		String menuFiguras = "Informe qual figura regular deseja criar: \n"
				+ "1 - Circulo \n"
				+ "2 - Triangulo Equilatero \n"
				+ "3 - Quadrado \n"
				+ "4 - Pentagono \n"
				+ "5 - Hexagono \n"
				+ "0 - Voltar ao menu anterior";
		
		String strOpcao = JOptionPane.showInputDialog(menuFiguras);
		int opcao  = Integer.parseInt(strOpcao);
		
		switch (opcao) {
		case 1:  //criar um circulo 
			String strRaio = JOptionPane.showInputDialog("Informe o valor do raio");
			float raio = Float.parseFloat(strRaio);
			
			//criar um circulo
			Circulo temp = new Circulo(raio);
			
			//Armazenar temp em circulos
			//1o. copiar circulos para vetor temporario
			Circulo[] tempCirculos = new Circulo[circulos.length + 1];
			for (int i=0; i<circulos.length; i++)
				tempCirculos[i] = circulos[i];
			//2o. armazenar temp em tempCirculos
			tempCirculos[tempCirculos.length-1] = temp;
			//3o. atualizar a referencia circulos
			circulos = tempCirculos;
			
			break;
		
		case 2:  //criar triangulo equilatero
			String strLado = JOptionPane.showInputDialog("Informe o valor do lado do trianguloEquilatero");
			float lado = Float.parseFloat(strLado);
			
			//criar um triangulo equilatero
			Triangulo tt = new Triangulo(lado);
			
			//Armazenar tt em triangulos
			//1o. copiar triangulos para vetor temporario
			Triangulo[] tempTriangulos = new Triangulo[triangulos.length + 1];
			for (int i=0; i<triangulos.length; i++)
				tempTriangulos[i] = triangulos[i];
			//2o. armazenar tt em tempTriangulos
			tempTriangulos[tempTriangulos.length-1] = tt;
			//3o. atualizar a referencia triangulos
			triangulos = tempTriangulos;
			break;
			
		case 3: //criar quadrado
			String strLadoQuadrado = JOptionPane.showInputDialog("Informe o valor do lado do Quadrado");
			float ladoQuadrado = Float.parseFloat(strLadoQuadrado);

			//criar um Quadrado
			Quadrado q = new Quadrado(ladoQuadrado);

			//Armazenar q em quadrados
			//1o. copiar quadrados para vetor temporario
			Quadrado[] tempQuadrados = new Quadrado[quadrados.length + 1];
			for (int i=0; i<quadrados.length; i++)
				tempQuadrados[i] = quadrados[i];
			//2o. armazenar q em tempQuadrados
			tempQuadrados[tempQuadrados.length-1] = q;
			//3o. atualizar a referencia quadrados
			quadrados = tempQuadrados;
			break;


		case 4: //criar Pentagono
			String strRaioPentagono = JOptionPane.showInputDialog("Informe o valor do raio");
			float raioPentagono = Float.parseFloat(strRaioPentagono);
			String strLadoPentagono = JOptionPane.showInputDialog("Informe o valor do lado do Pentagono:");
			float ladoPentagono = Float.parseFloat(strLadoPentagono);

			//criar um Pentagono
			Pentagono p = new Pentagono(raioPentagono,ladoPentagono);

			//Armazenar p em pentagonos
			//1o. copiar pentagonos para vetor temporario
			Pentagono[] tempPentagono = new Pentagono[pentagonos.length + 1];
			for (int i=0; i<pentagonos.length; i++)
				tempPentagono[i] = pentagonos[i];
			//2o. armazenar p em tempPentagono
			tempPentagono[tempPentagono.length-1] = p;
			//3o. atualizar a referencia Pentagonos
			pentagonos = tempPentagono;
			break;

		case 5: //criar Hexagono
			String strLadoHexagono = JOptionPane.showInputDialog("Informe o valor do lado do Hexagono:");
			float ladoHexagono = Float.parseFloat(strLadoHexagono);

			//criar um Hexagono
			Hexagono h = new Hexagono(ladoHexagono);

			//Armazenar h em Hexagonos
			//1o. copiar Hexagonos para vetor temporario
			Hexagono[] tempHexagono = new Hexagono[hexagonos.length + 1];
			for (int i=0; i<hexagonos.length; i++)
				tempHexagono[i] = hexagonos[i];
			//2o. armazenar h em tempHexagono
			tempHexagono[tempHexagono.length-1] = h;
			//3o. atualizar a referencia Hexagonos
			hexagonos = tempHexagono;
			break;

		case 0: 
			return;
		}
		
	}
	
	public static float calcularAreaFiguraRegular() {
		//Por simplificacao, calcular area de todas as figuras regulares cadastradas
		for (int i=0; i<circulos.length; i++) {
			float area = circulos[i].calcularArea();
			String resposta = "Circulo "+ i + ": \n"
					+ "햞ea = " + area ;
			JOptionPane.showMessageDialog(null, resposta);
		}
		
		for (int i=0; i<triangulos.length; i++) {
			float area = triangulos[i].calcularArea();
			String resposta = "Triangulo "+ i + ": \n"
					+ "햞ea = " + area ;
			JOptionPane.showMessageDialog(null, resposta);
		}
		
		
		for (int i=0; i<quadrados.length; i++) {
			float area = quadrados[i].calcularArea();
			String resposta = "Quadrado "+ i + ": \n"
					+ "햞ea = " + area ;
			JOptionPane.showMessageDialog(null, resposta);
		}
		return 0;

		for (int i=0; i<pentagonos.length; i++) {
			float area = pentagonos[i].calcularArea();
			String resposta = "Pentagono "+ i + ": \n"
					+ "햞ea = " + area ;
			JOptionPane.showMessageDialog(null, resposta);
		}
		return 0;

		for (int i=0; i<hexagonos.length; i++) {
			float area = hexagonos[i].calcularArea();
			String resposta = "Hexagono "+ i + ": \n"
					+ "햞ea = " + area ;
			JOptionPane.showMessageDialog(null, resposta);
		}
		return 0;
	}
	
	public static float calcularPerimetroFiguraRegular() {
		//Por simplificacao, calcular perimetro de todas as figuras regulares cadastradas
		for (int i=0; i<circulos.length; i++) {
			float perimetro = circulos[i].calcularPerimetro();
			String resposta = "Circulo "+ i + ": \n"
					+ "Perimetro = " + perimetro ;
			JOptionPane.showMessageDialog(null, resposta);
		}

		for (int i=0; i<triangulos.length; i++) {
			float perimetro = triangulos[i].calcularPerimetro();
			String resposta = "Triangulo "+ i + ": \n"
					+ "Perimetro = " + perimetro ;
			JOptionPane.showMessageDialog(null, resposta);
		}


		for (int i=0; i<quadrados.length; i++) {
			float perimetro = quadrados[i].calcularPerimetro();
			String resposta = "Quadrado "+ i + ": \n"
					+ "Perimetro = " + perimetro ;
			JOptionPane.showMessageDialog(null, resposta);
		}
		return 0;
	}
	
	
	public static void main(String[] args) {

		int opcao = 0;

		do {
			String menu = "Informe a op豫o desejada: \n"
					+ "1 - Criar figura regular \n"
					+ "2 - Calcular area de figura regular \n"
					+ "3 - Calcular perimetro de figura regular \n"
					+ "0 - Sair";

			String strOpcao = JOptionPane.showInputDialog(menu);
			opcao = Integer.parseInt(strOpcao);

			switch (opcao) {
			case 1: 
				criarFiguraRegular();
				break;

			case 2: 
				calcularAreaFiguraRegular();
				break;

			case 3: 
				calcularPerimetroFiguraRegular();
				break;

			} 


		}
		while (opcao != 0);

		return;
	}
	
}
