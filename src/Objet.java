/**
 * Created by yablanch on 19/02/2016.
 */
public class Objet implements Comparable {
    private int numero;
    private int poid;
    private int utilite;

    public Objet(int numero, int poid, int utilite) {
        this.numero = numero;
        this.poid = poid;
        this.utilite = utilite;
    }

    public int getNumero() {
        return numero;
    }

    public int getPoid() {
        return poid;
    }

    public int getUtilite() {
        return utilite;
    }

    public double getRatio() {
        return (double)utilite/poid;
    }

    @Override
    public int compareTo(Object o) {
        if(this.getRatio() == ((Objet) o).getRatio()){
            return 0;
        }
        else if(this.getRatio() < ((Objet) o).getRatio()){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "L'objet numéro" + numero +
                " et de poid=" + poid +
                " et d'utilite=" + utilite
                ;
    }
}
