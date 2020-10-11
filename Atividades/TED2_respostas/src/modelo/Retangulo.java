package modelo;

public class Retangulo {
	
	 private double area;
	 private double altura;

	 public Retangulo(double area, double altura) {
	        this.area = area;
	        this.altura = altura;
	 }
	 
	 public Retangulo(){}

	 
	 public double area() {
		 return (this.area * this.altura);
	 }

	public String toString() {
		return "Retangulo [area=" + area + ", altura=" + altura + "]";
	}


}
