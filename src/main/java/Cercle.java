public class Cercle {
    private double centreX;
    private double centreY;
    private double rayon;
    public Cercle(double centreX, double centreY, double rayon) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;

    }

    public void deplacer(double distanceX, double distanceY) {
        this.centreX += distanceX;
        this.centreY += distanceY;
    }

    public boolean isGrand() {
        return rayon > 100;
    }
    public void redimensionner(double £) {
        this.rayon = £*rayon;
    }
}
