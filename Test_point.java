class Point 
{
    private String Nom;
    private int Abs;
    private int Ord;

    public Point(int Abs, int Ord)
    {
        this.Nom="O";
        this.Abs=Abs;
        this.Ord=Ord;
    }

    public Point(String n)
    {
        this.Nom=n;
        this.Abs=0;
        this.Ord=0;
    }

    public Point(String Nom , int Abs , int Ord)
    {
        this.Nom=Nom;
        this.Abs=Abs;
        this.Ord=Ord;
    }

    public void Affiche()
    {
        System.out.println(this.Nom+" ("+this.Abs+","+this.Ord+")");
    }

    public void TranslHoriz (int a) 
    {
        this.Abs+=a;
    }

    public void TranslVert (int a) 
    {
        this.Ord+=a;
    }

    public void Translation (int a, int b)
    {
        this.Abs+=a;
        this.Ord+=b;
    }

    public boolean Coincide (Point p) 
    {
        return (this.Abs==p.Abs) && (this.Ord==p.Ord);
    }

    public String getNom()
    {
       return Nom;
    }

    public int getAbscisse()
    {
        return Abs;
    }

    public int getOrdonnee()
    {
        return Ord;
    }

    public void setNom(String ch)
    {
        this.Nom=ch;
    }

    public void setAbscisse(int a)
    {
        this.Abs=a;
    }

    public void setOrdonnee(int a)
    {
        this.Ord=a;
    }
}

public class Test_point 
{ 
    public static void main (String [] args) 
    { 
        Point p1; 
        p1 = new Point (3, 5); 
        Point p2 = new Point ("a"); 
        Point p3 = new Point ("b", 3,5);  

        System.out.println("\n ---------------------------\n"); 
        System.out.println("les points crees sont :"); 

        p1.Affiche (); 
        p2.Affiche ();
        p3.Affiche ();

        System.out.println("\n ---------------------------\n"); 
        if (p1.Coincide(p3) == true) 
            System.out.println("Les 2 points p1 et p3 coincident"); 
        else 
            System.out.println("Les 2 points ne coincident pas"); 

        System.out.println("\n ---------------------------\n"); 
        System.out.println("translation des point "); 

        p1.TranslHoriz (4); 
        p2.TranslVert (3); 
        p3.Translation (5,2); 

        p1.Affiche (); 
        p2.Affiche (); 
        p3.Affiche (); 

        System.out.println("\n ---------------------------\n"); 
        System.out.println("modification des attributs des points") ; 

        p1.setNom("SRI21"); 
        p2.setAbscisse(25); 
        p3.setOrdonnee(50); 

        p1.Affiche (); 
        p2.Affiche (); 
        p3.Affiche (); 

        System.out.println("\n ---------------------------\n"); 
        System.out.println("utilisation des methodes get"); 

        String x=p1.getNom(); 
        int y=p1.getAbscisse(); 
        int z=p1.getOrdonnee(); 

        System.out.println(" le nom du point p1 est : " + x); 
        System.out.println(" son abscisse est : " + y); 
        System.out.println(" son ordonnee est : " + z);

        p3.Nom="Test" ; 
        p3.Abs=2 ; 
        p3.Ord=4 ; /*les attributs sont "private" alors non accessible en dehors de la classe */
    }
}