package controleurs;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metiers.CompteMetier;
import beans.Compte;
/**
* Servlet implementation class Login2
*/
public class Login2 extends HttpServlet {
private static final long serialVersionUID = 1L;
 
 /**
 * @see HttpServlet#HttpServlet()
 */
 public Login2() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException {
// TODO Auto-generated method stub
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException {
// Récupérer paramètres
String Un = request.getParameter("UserName");
String Pw = request.getParameter("PassWord");
Compte Cpte = new Compte();
String Msg = "Données Obligatoires";
// Traiter paramètres
boolean resulta = false;
if (Un.trim().length()>0 && Pw.trim().length()>0){
CompteMetier CpteMetier = new CompteMetier();
Cpte = CompteMetier.Authentification(Un,Pw);
if (Cpte.getPoste().length()>0){
resulta = true;
}else{
Msg = "Nom d'utilisateur ou/et mot de passe incorrectes";
} }
// Générer page réponse
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
try {
out.println("<!DOCTYPE html>");
out.println("<html><head>");
out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
out.println("<title>ServletRequest </title></head>");
out.println("<body>");
RequestDispatcher Rd= null;
if (resulta){
request.setAttribute("cpte",Cpte);
if (Cpte.getPoste().equals("G")){
Rd = request.getRequestDispatcher("/AccueilGerant.jsp");
} else{
if (Cpte.getPoste().equals("A")){
Rd = 
request.getRequestDispatcher("/AccueilAcheteur.jsp");
} else{
Rd = 
request.getRequestDispatcher("/AccueilVendeur.jsp");
} }
Rd.forward(request, response);
} else {
out.println("<p>Vous n'êtes pas connecté " + "</p>");
out.println("<p> " + Msg + "</p>");
Rd = request.getRequestDispatcher("/index.html");
Rd.include(request, response);
}
out.println("</body>");
out.println("</html>");
} finally {
out.close();
} } }