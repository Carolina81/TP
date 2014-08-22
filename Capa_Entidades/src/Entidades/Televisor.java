package Entidades;

public class Televisor extends Electrodomestico {

	//ATRIBUTOS
		private int resolucion;
		private boolean TDT;
		
	//PROPIEDADES
		public int getResolucion() {
			return resolucion;
		}
		public boolean isTDT() {
			return TDT;
		}
		
	//METODOS CONSTRUCTORES
		public Televisor()
		{
			super();
		}
		
		public Televisor(double precio, double peso)
		{
			super(precio,peso);
		}
		
		public Televisor(int resolucion, boolean TDT, Color color, double precio, Consumo consumo, double peso)
		{
			super(Color color, double precio, Consumo consumo, double peso);
			this.TDT = TDT;
			this.resolucion = resolucion;
		}
}
