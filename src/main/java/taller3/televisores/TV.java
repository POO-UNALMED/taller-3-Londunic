package taller3.televisores;

public class TV {	
	Marca marca;
	private int precio =500;
	private int canal =1;
	private int volumen =1;
	private boolean estado;
	static int numTV;
	Control control;
	
	public TV (Marca marca,boolean estado ){
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}

	public void setCanal(int canal) {
		if (estado==true) {
			if (canal<=120 && canal>0) {
				this.canal=canal;
			}
		}
	}
	public void setVolumen(int volumen) {
		if (estado==true) {
			if(volumen<8 && volumen>=0) {
				this.volumen=volumen;
			}
		}
	}
	public int getPrecio() {
		return precio;
	}	
	public int getCanal() {
		return canal;
	}
	public Control getControl() {
		return control;
	}	
	public int getVolumen() {
		return volumen;
	}
	public Marca getMarca() {
		return marca;
	}
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int valor) {
		numTV=valor;
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (estado==true){
			if(canal<120) {
				canal++;
			}
		}
	}
	public void canalDown() {
		if (estado==true){
			if(canal>1) {
				canal--;
			}
		}
	}
	public void volumenUp() {
		if (estado==true){
			if(volumen<7) {
				volumen++;
			}
		}
	}
	public void volumenDown() {
		if (estado==true){
			if(volumen>0) {
				volumen--;
			}
		}
	}
}
