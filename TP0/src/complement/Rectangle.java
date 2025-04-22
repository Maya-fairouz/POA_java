package complement;

import java.awt.Color;

public class Rectangle extends Form {
	protected float longeur=10, largeur=15;
			
			void déplacer (int x, int y) {
				Point a = getP();
				a.abs += x;
				a.ord += y;
				setP(a); }
			
			protected float surface() {
				return (longeur*largeur);

}           
            public Rectangle() {}
            
			public Rectangle(float longueur, float largeur) {
			    super();
				this.longeur = longueur;
				this.largeur = largeur;
			}
			
			public Rectangle(Point p) {
		        setP(p);
			}
			
			public Rectangle(Color couleur) {
              this.couleur=couleur;	
              //super. ... instead of this
			}
			
			public Rectangle(float longeur, float largeur, Point p,Color couleur) {
				this.longeur=longeur;
				this.largeur=largeur;
				setP(p);
				this.couleur=couleur; 
				
				
			}	
			@Override
		
			public boolean equals (Object c) {
				Rectangle o=(Rectangle) c;
			if(longeur==o.longeur && largeur==o.largeur) return true ;
			
			else return false ;
			
			
			}
			@Override
			public void afficher(boolean flag) {
				if(flag==false)
				System.out.println(surface());
				else
					System.out.println("je suis un rectangle de couleur"+couleur+" ,Mes coordonnes sont : "+ getP()+" , ma surface est :"+surface());
				}
		
	
			
			
			public static void main(String[] args) {
				
				Rectangle r1 = new Rectangle(12,12);			
       			Rectangle r2 = new Rectangle(12,12);	
       			
       			
       			
       			
	
}
}