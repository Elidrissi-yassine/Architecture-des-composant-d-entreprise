package model;

public class Student {
    private int id;
    private String nom;
    private String prenom;
    private Genre genre;
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public Genre getGenre() {
        return genre;
    }
    public Student(int id, String nom, String prenom, Genre genre) {
        this.id = id;this.nom = nom;this.prenom = prenom;this.genre = genre;
    }

}
