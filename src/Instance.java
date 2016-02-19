/**
 * Created by yablanch on 19/02/2016.
 */
public class Instance {
    public int nbObjet;
    public ListeObjet objets;
    public int poidsMax;

    public Instance(int nbObjet, ListeObjet objets, int poidsMax) {
        this.nbObjet = nbObjet;
        this.objets = objets;
        this.poidsMax = poidsMax;
    }

    @Override
    public String toString() {
        return "Instance{" +
                "nbObjet=" + nbObjet +
                ", objets=" + objets + " Poid : " + objets.affichelpoids() + " Num " + objets.affichelpoids() + "Util " + objets.affichelutil() +
                ", poidsMax=" + poidsMax +
                '}';

    }
}
