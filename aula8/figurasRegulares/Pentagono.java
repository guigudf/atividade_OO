package figurasRegulares;

public class Pentagono extends FiguraRegular{

	public Pentagono(float lado) {
        this.raio = raioPentagono;
		super(lado);
	}

	public float calcularArea() {
		float area = 5 * lado * raio; 
		return area;
	}
	
	public float calcularPerimetro() {
		return 5 * lado;
	}

}
