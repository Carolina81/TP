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
			this.color = new Color();
			this.consumo = new Consumo();			
		}
		
		public Electrodomestico(double precio, double peso)
		{
			this.color = new Color();
			this.consumo = new Consumo();
			this.peso = peso;
			this.precioBase = precio;
		}
		
		public Electrodomestico(Color color, double precio, Consumo consumo, double peso)
		{
			this.precioBase = precio;
			this.peso = peso;
			this.color = new Color();
			this.color = color.getDescripcion();
			this.consumo = new Consumo();			
		}
}
