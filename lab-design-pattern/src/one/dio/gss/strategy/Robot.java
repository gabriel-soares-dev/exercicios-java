package one.dio.gss.strategy;

public class Robot {

	private Comportment comportment;

	public void setComportment(Comportment comportment) {
		this.comportment = comportment;
	}
	
	public void move() {
		comportment.move();
	}
	
}
