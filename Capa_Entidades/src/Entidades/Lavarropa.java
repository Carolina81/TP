package Entidades;

public class Lavarropa extends Electrodomestico {

	//ATRIBUTOS
		private double carga;
	
	//PROPIEDADES
		public double getCarga() {
			return carga;
		}
	
	//METODOS CONSTRUCTORES
		public Lavarropa()
		{
			super();
		}
		
		public Lavarropa(double precio, double peso)
		{
			super(precio,peso);
			
		}
		
		public Lavarropa(double carga, Color color, double precio, Consumo consumo, double peso)
		{
			super(Color color, double precio, Consumo consumo, double peso);
			this.carga = carga;		
		}
}
