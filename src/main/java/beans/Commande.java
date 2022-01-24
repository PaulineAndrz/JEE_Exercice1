package beans;

import java.util.Date;

public class Commande {
	
	Date date;
	String montant;
	String modePaiement;
	String statutPaiement;
	String modeLivraison;
	String statutLivraison;
	Client client;

	public Commande() {
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public String getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}

	public String getStatutPaiement() {
		return statutPaiement;
	}

	public void setStatutPaiement(String statutPaiement) {
		this.statutPaiement = statutPaiement;
	}

	public String getModeLivraison() {
		return modeLivraison;
	}

	public void setModeLivraison(String modeLivraison) {
		this.modeLivraison = modeLivraison;
	}

	public String getStatutLivraison() {
		return statutLivraison;
	}

	public void setStatutLivraison(String statutLivraison) {
		this.statutLivraison = statutLivraison;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
