package servlets;

import java.io.IOException;

import beans.Client;
import beans.Commande;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreationCommandeServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_commande.jsp").forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nomClient");
		String prenom = request.getParameter("prenomClient");
		String adresse = request.getParameter("adresseClient");
		String telephone = request.getParameter("telephoneClient");
		String email = request.getParameter("emailClient");
	
		Client client = new Client();
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresse(adresse);
		client.setTelephone(telephone);
		client.setEmail(email);
	
		
		String montant = request.getParameter("montantCommande");
		String modePaiement = request.getParameter("modePaiementCommande");
		String statutPaiement = request.getParameter("statutPaiementCommande");
		String modeLivraison = request.getParameter("modeLivraisonCommande");
		String statutLivraison = request.getParameter("statutLivraisonCommande");
		
		Commande commande = new Commande();
		commande.setClient(client);
		commande.setModeLivraison(modeLivraison);
		commande.setModePaiement(modePaiement);
		commande.setMontant(montant);
		commande.setStatutLivraison(statutLivraison);
		commande.setStatutPaiement(statutPaiement);

		request.setAttribute("commande", commande);
		
		request.getRequestDispatcher("/WEB-INF/afficher_commande.jsp").forward(request, response);
	}

}
