package servlets;

import java.io.IOException;

import beans.Client;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreationClientServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_client.jsp").forward(request, response);
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
		
		request.setAttribute("client", client);
		
		request.getRequestDispatcher("/WEB-INF/afficher_client.jsp").forward(request, response);
	}

}
