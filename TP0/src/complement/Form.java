package complement;

import java.awt.Color;


abstract class Form {
	
	public Color couleur=Color.RED;
	private Point p = new Point(20,20);
	public float rayon;
	
	public final void changerCouleur(Color c) {
	couleur=c; 
	}
	
	abstract protected float surface();
	
	abstract void  afficher(boolean flag)  ;
	
	public void afficher () {
		System.out.println(p);
	}
	
	public Point getP() { 
		return p;
		}
	public void setP(Point p) { 
		this.p = p; 
		}
	
	
public static void main(String[] args) {
		
	Form tabForm[];
	tabForm = new Form[5];  

	System.out.println(Color.RED.getRed());// creating 5 objects 
	tabForm[0]=new Rectangle(12,25,new Point(2,3),Color.RED);
	tabForm[1]=new Rectangle(20,10,new Point(5,10),Color.GREEN);
	tabForm[2]=new Cercle(12, new Point(10,10),Color.YELLOW);
	tabForm[3]=new Cylindre(5,20, new Point(15,20),Color.WHITE);
	tabForm[4]=new Cylindre(8,14, new Point(5,15),Color.BLACK);
	
    // tabForm[4].changerCouleur(Color.RED);
	
	
	for(int i=0;i<tabForm.length;i++) {
		tabForm[i].afficher(true);
	}
	
	
	
	Rectangle ee = new Rectangle(55,88);
	Rectangle er = new Rectangle(44,88);
	
	System.out.println(ee.equals(er));
	
}





	}
//
