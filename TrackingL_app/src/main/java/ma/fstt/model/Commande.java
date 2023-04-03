package ma.fstt.model;

public class Commande {
    private Long id_commande  ;

    private int date_commande ;

    private String livreur ;

    public Commande() {
    }

    public Commande(Long id_commande , String date_commande, String livreur) {
        this.id_commande  = id_commande ;
        this.date_commande = Integer.parseInt(date_commande);
        this.livreur = livreur;
    }

    public Long getId_commande () {
        return id_commande  ;
    }

    public void setId_commande(Long id_commande ) {
        this.id_commande   = id_commande ;
    }

    public String getDate_commande() {
        return String.valueOf(date_commande);
    }

    public void setDate_commande(int date_commande) {
        this.date_commande = date_commande;
    }

    public String getLivreur() {
        return livreur;
    }

    public void setLivreur(String livreur) {
        this.livreur = livreur;
    }

    @Override
    public String toString() {
        return "Livreur{" +
                "id_commande=" + id_commande +
                ", date_commande='" + date_commande + '\'' +
                ", livreur='" + livreur + '\'' +
                '}';
    }
}

