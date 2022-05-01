public class Polygone {
    private Point [] tab=null;
    public void addPoint(Point p)
    {
        if(tab == null)
        {
            tab[0].setX(p.getX());
            tab[1].setY(p.getY());
        }
        if(tab != null)
        {
            tab[tab.length].setX(p.getX());
            tab[tab.length + 1] = tab[tab.length];
        }
    }
     public void affichageTab()
     {
         for(Point it : tab)
         {
             System.out.println(it+" ");
         }
     }
}
