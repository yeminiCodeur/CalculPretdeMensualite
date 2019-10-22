package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import metier.CreditMetier;

public class ControllerServlet extends HttpServlet {
	CreditMetier metier;
@Override
	public void init() throws ServletException {
		metier = new CreditMetier();
	}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.setAttribute("model",  new CreditModel());
	req.getRequestDispatcher("vueCredit.jsp").forward(req, resp);
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
    
    if(req.getParameter("credit").equals("") && req.getParameter("montant").equals("") && req.getParameter("duree").equals("")) {
    	req.getRequestDispatcher("cueCredit.jsp").forward(req, resp);
    
    }else {
    	    double montant =  Double.parseDouble(req.getParameter("credit"));
            double taux    =  Double.parseDouble(req.getParameter("taux")) ;
            int duree      =  Integer.parseInt(req.getParameter("duree"));
            CreditModel m= new CreditModel();
			m.setCredit(montant);
			m.setDuree(duree);
			m.setTaux(taux);
			double mensualite =  metier.calculMensualite(duree, taux, montant);
			m.setMensualite(mensualite);
			req.setAttribute("model", m);
		    req.getRequestDispatcher("vueCredit.jsp").forward(req, resp);
    }	
}
 
 
}
