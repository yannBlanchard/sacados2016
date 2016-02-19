import java.util.ArrayList;

/**
 * Created by yablanch on 19/02/2016.
 */
public class Generator {
    public int nbinst;
    public int op; //Poid maximum d'un objet
    public int ow;//utilité maximum d'un objet
    public int t;
    public ArrayList<Instance> instances;

    public Generator(int nbinst, int op, int ow, int t, ArrayList<Instance> instances) {
        this.nbinst = nbinst;
        this.op = op;
        this.ow = ow;
        this.t = t;
        this.instances = instances;
        for(int i=0; i<nbinst;i++)
        {
            this.instances.add(MakeInstance(t,op,ow));
        }
    }

    public Instance MakeInstance(int taille, int ordrepoids, int ordreprofit)
    {
        Instance pb;
        int poids;
        int util;
        ListeObjet x;

        x=new ListeObjet();
        for(int i = 0; i<taille; i++) {
            poids=(int)(Math.random()*ordrepoids)+1;
            util=(int)(Math.random()*ordreprofit)+1;
            x.ajout(new Objet(i,poids, util));
        }
        poids=(int)(Math.random()*x.getpoids())+5;
        pb=new Instance(taille,x,poids);
        return pb;
    }

}
