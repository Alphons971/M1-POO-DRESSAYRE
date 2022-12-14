
import java.io.Serializable;

public class Point implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Attributs
	public String nom;
	public double x;
	public double y;
	
	
	//Constructeurs

	public Point(double x,double y ,String nom ){
		this.x=x;
		this.y=y;
		this.nom=nom;
	}
	public Point(double x ,double y) {
		this(x,y,"");
	}
	public Point() {
		
		this.nom="";
	}

	//Methodes
	public String toString() {
		return  nom+"(x:"+x+", y:"+y+")";
	}
	
}
