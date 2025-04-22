package complement;

import java.awt.Color;

public class Cylindre extends Cercle {
		float hauteur=12;
		
		protected float surface() {
			return (float) Math.PI*rayon*rayon*hauteur;
		}
	
		public Cylindre(float r, float hauteur) {
			super(hauteur);
			this.rayon=r;
			this.hauteur=hauteur;
		}
		public Cylindre(Point p) {
		  //exist implicitement super(p);
			setP(p);
		}
		public Cylindre(Color couleur) {
			super(couleur);
//			this.couleur= couleur;    not needed
		}
		public Cylindre(float r,float hauteur,Point p,Color couleur){
			super(hauteur,p,couleur);
			this.rayon=r;
			this.hauteur=hauteur;
			setP(p);
			this.couleur=couleur;
		}
		

		
		@Override
		public void afficher() {
			System.out.println("je suis un Cylindre "+ getP());
		}
		
		@Override
		public boolean equals (Object c) {
			Cylindre o=(Cylindre) c;
			if(rayon==o.rayon && hauteur==o.hauteur && getP()==o.getP() && couleur==o.couleur) return true;
			else return false ;
		}
		
		@Override
		void afficher(boolean flag) {
			if(flag==false)
			System.out.println(surface());
			else
				System.out.println("je suis un cylindre de couleur"+couleur.toString()+" ,Mes coordonnes sont : "+ getP()+" , ma surface est : "+surface()+" , mon rayon : "+rayon);
			
		}
		
		
		public static void main(String[] args) {
		//	Cylindre c = new Cylindre();
			
			
		//	System.out.println(c.couleur +""+ c.hauteur + c.rayon); 
		

            Point g = new Point(3,4);
			Rectangle r = new Rectangle();
			Cercle cr = new Cercle(33.4f,g,Color.black);
			Cylindre cy = new Cylindre(44.5f,5.77f,g,Color.CYAN);
			r.afficher(); 
			cr.afficher(); 
			cy.afficher();
			
			System.out.println("La surface du rectangle: "+r.surface());
			System.out.println("La surface du cercle: "+cr.surface());
			System.out.println("La surface du cylindre: "+cy.surface());
			
			Point x = new Point(22,7);
			
			
		//****	3/b. x.afficher(); // the method is undifined for the type point
			
			
			Cylindre c1 = new Cylindre(14,8,new Point(4,12),Color.blue);
			Cylindre c2 = new Cylindre(14,8,new Point(4,12),Color.blue);
			
                  if(c1.equals(c2)) {
                	  System.out.println("sont égaux");
                  }
                  else System.out.println("sont pas égaux");
			}
		// ne sont pas egaux
		
	
		
		
				
}
//******2/ b.Implicit super constructor Cercle()
// is undefined for default constructor.
//Must define an explicit constructor


