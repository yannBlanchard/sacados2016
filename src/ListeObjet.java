import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yablanch on 19/02/2016.
 */
public class ListeObjet {
    public ListeObjet(ArrayList<Objet> listObjets) {
        this.listObjets = listObjets;
    }

    public ListeObjet(){

    }

    private ArrayList<Objet> listObjets = new ArrayList<Objet>();

    public void retire(int i){
        listObjets.remove(i);
    }

    public void retire(Objet o){
        listObjets.remove(o);
    }

    public void ajout(Objet o){
        listObjets.add(o);
    }

    public int getTaille(){
        return listObjets.size();
    }

   public void trie(){
       Collections.sort(listObjets);
   }

    public List<Objet> getListObjets() {
        return listObjets;
    }

    public void setListObjets(ArrayList<Objet> listObjets) {
        this.listObjets = listObjets;
    }

    public Objet get(int i)
    { return(listObjets.get(i));
    }

    public int getpoids(){
        int pds=0;
        for(int i=0; i<listObjets.size();i++) pds+=listObjets.get(i).getPoid();
        return pds;
    }
    public int getutil(){
        int u=0;
        for(int i=0; i<listObjets.size();i++) u+=listObjets.get(i).getUtilite();
        return u;
    }
    public ListeObjet duplique(){
        ListeObjet l;
        ArrayList<Objet> a = (ArrayList<Objet>)this.listObjets.clone();
        return l = new ListeObjet(a) ;
    }
    public void append(ListeObjet l){
        listObjets.addAll(l.getListObjets());
    }

    public int index(Objet o){
        // index si l'objet est dans la liste, -1 sinon'
        if  (listObjets.contains(o) )
        {return listObjets.indexOf(o);}
        else { return(-1);}
    }
    public String affiche(){
        String s="";
        for (int i=0 ;i<listObjets.size();i++)
            s=s+listObjets.get(i).toString();
        return s+"\n";
    }
    public String affichelnum(){
        String s="";
        for (int i=0 ;i<listObjets.size();i++)
            s=s+" "+listObjets.get(i).getNumero();
        return s+"\n";
    }
    public String affichelpoids(){
        String s="";
        for (int i=0 ;i<listObjets.size();i++)
            s=s+" "+listObjets.get(i).getPoid();
        return s+"\n";
    }
    public String affichelutil(){
        String s="";
        for (int i=0 ;i<listObjets.size();i++)
            s=s+" "+listObjets.get(i).getUtilite();
        return s+"\n";

    }
}
