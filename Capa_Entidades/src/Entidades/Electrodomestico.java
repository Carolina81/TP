package Entidades;

public class Electrodomestico {

	//ATRIBUTOS
		private double precioBase; 
		private Color color;
		private Consumo consumo;
		private double peso;
	
	//PROPIEDADES
		protected double getPrecioBase() {
			return precioBase;
		}
		protected Color getColor() {
			return color;
		}
		protected Consumo getConsumo() {
			return consumo;
		}
		protected double getPeso() {
			return peso;
		}
		
	//METODOS CONSTRUCTORES
		public Electrodomestico()
		{
			
		}
		
		public Electrodomestico(double precio, double peso)
		{
			
		}
		
		public Electrodomestico(Color color, double precio, Consumo consumo, double peso)
		{
			
		}
}
