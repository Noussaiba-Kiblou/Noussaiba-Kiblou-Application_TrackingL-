package ma.fstt.model;

public class Produit {
    private Long id_produit ;

    private String nom ;

    private int prix ;

    public Produit(long aLong, String string, String resultSetString) {
    }

    public Produit(Long id_produit, String nom, double prix) {
        this.id_produit = id_produit;
        this.nom = nom;
        this.prix = Integer.parseInt(String.valueOf(prix));
    }

    public Long getId_produit() {
        return id_produit;
    }

    public void setId_produit(Long id_produit) {
        this.id_produit = id_produit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = Integer.parseInt(prix);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id_produit=" + id_produit +
                ", nom='" + nom + '\'' +
                ", prix='" + prix + '\'' +
                '}';
    }
}
