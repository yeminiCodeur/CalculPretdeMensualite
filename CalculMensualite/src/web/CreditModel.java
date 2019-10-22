package web;

public class CreditModel {
   private double taux;
   private double credit;
   private int duree;
   private double mensualite;
public double getTaux() {
	return taux;
}
public void setTaux(double taux) {
	this.taux = taux;
}
public double getCredit() {
	return credit;
}
public void setCredit(double credit) {
	this.credit = credit;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}
public double getMensualite() {
	return mensualite;
}
public void setMensualite(double mensualite) {
	this.mensualite = mensualite;
}
   public  CreditModel() {
	   
   }
public CreditModel(double taux, double credit, int duree, double mensualite) {
	super();
	this.taux = taux;
	this.credit = credit;
	this.duree = duree;
	this.mensualite = mensualite;
}
   
   
}
