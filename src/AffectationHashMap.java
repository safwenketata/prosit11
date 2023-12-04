import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class AffectationHashMap {
    Map<Employes,Departement> employeDep = new HashMap<>();

    void ajouterEmployeDepartement(Employes e, Departement d){
        employeDep.put(e,d);
    }
    void afficherEmployesEtDepartements(){
        for(Map.Entry<Employes,Departement> e : employeDep.entrySet()){
            System.out.println(e.getKey().getNom() + " " + e.getKey().getPrenom() + " is in the " + e.getValue().getNbrEmploye()+ " Departement");
        }
    }

    void supprimerEmploye(Employes e){
        employeDep.remove(e);
    }
    void supprimerEmployeEtDepartement(Employes e, Departement d){
        Departement dep = employeDep.get(e);
        if(d.equals(dep)){
            supprimerEmploye(e);
        }
    }
    void afficherEmployes(){
        for(Employes e : employeDep.keySet()){
            System.out.println(e);
        }

        Set<Employes> keys = employeDep.keySet();
        Iterator<Employes> it = keys.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    void afficherDepartements(){
        for(Departement d : employeDep.values()){
            System.out.println(d);
        }
        Collection<Departement> values = employeDep.values();
        Iterator<Departement> it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    boolean rechercherEmploye (Employes e){
        return employeDep.containsKey(e);
    }
    boolean rechercherDepartement (Departement d){
        return employeDep.containsValue(d);
    }
    TreeMap<Employes, Departement> trierMap(){
        Comparator<Employes> c = new Comparator<Employes>() {
            @Override
            public int compare(Employes o1, Employes o2) {
                return o1.getID()- o2.getID();
            }
        };
        TreeMap<Employes, Departement> tree = new TreeMap<>(c);
        tree.putAll(employeDep);
        return tree;

    }
}