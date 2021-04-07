package figurasRegulares;

public class Pentagono extends FiguraRegular{

	private static float raiz = (float) Math.sqrt(5 - (2 * Math.sqrt(5)));
	
	public Pentagono(float lado) {
		super(lado);		
	}

	public float calcularArea() {
		float area = (5 * super.calcularArea()) / (4 * raiz); 
		return area;
	}
	
	public float calcularPerimetro() {
		return 5 * lado;
	}

}
