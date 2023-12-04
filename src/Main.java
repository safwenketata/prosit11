import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        AffectationHashMap depHashset = new AffectationHashMap();
        Departement dep1 = new Departement(41,"1",0);
        Departement dep2 = new Departement(62,"2",0);

        Employes em1 = new Employes(2,"em","1","exmp",5);
        Employes em2 = new Employes(42,"emye","2","exmp",5);
        Employes em3 = new Employes(62,"nt","3","exmp",5);
        Employes em4 = new Employes(58,"exm","4","exmp",5);

        depHashset.ajouterEmployeDepartement(em1,dep1);
        depHashset.ajouterEmployeDepartement(em2,dep2);
        depHashset.ajouterEmployeDepartement(em3,dep2);
        depHashset.ajouterEmployeDepartement(em4,dep1);

        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.afficherDepartements();
        System.out.println("-------------------------");
        depHashset.afficherEmployes();
        System.out.println("-------------------------");
        System.out.println(depHashset.rechercherEmploye(em1));
        System.out.println(depHashset.rechercherDepartement(dep1));
        System.out.println("-------------------------");
        System.out.println(depHashset.trierMap());
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(em1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherEmploye(em1));
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(em2,dep1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(em2,dep2);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(em4);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherDepartement(dep1));
    }
}