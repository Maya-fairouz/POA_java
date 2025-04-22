package complement;

import java.awt.Color;
//set/get content pane
class Cercle extends Form {
		protected float rayon=15;

		@Override
		protected float surface() {
			return (float) (Math.PI*rayon*rayon); }
	
	public Cercle(float r) {
       super.rayon=r;		
	}
	public Cercle(Point p) {
		setP(p);
		
	}
	public Cercle(Color couleur) {
		super.couleur=couleur;
		
	}
	public Cercle(float r, Point p, Color couleur) {
		this.rayon=r;
		setP(p);
		this.couleur=couleur;	
	}
	
	public Cercle() {

	}

	@Override
	public boolean equals (Object c) {
		Cercle o=(Cercle) c;
		if(rayon==o.rayon )return true;  

		return false ;


	}
	@Override
	public void afficher() {
		System.out.println("je suis un Cercle "+ getP());
	}
	
	void afficher(boolean flag) {
		if(flag==false)
		System.out.println(surface());
		else
			System.out.println("je suis un cercle de couleur :"+couleur+" , Mes coordonnes sont : "+getP()+", Mon rayon est :"+rayon+" , ma surface est : "+surface());
		}
	public static void main(String[] args) {
		
		Cercle cr1 = new Cercle(12);			
		Cercle cr2 = new Cercle(12);	
			
			if(cr1.equals(cr2)) {
      	  System.out.println("sont égaux");
        }
        else System.out.println("sont pas égaux");
			
	}	
	}



