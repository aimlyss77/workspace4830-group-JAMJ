/**
 * @file SimpleFormInsert.java
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SimpleFormInsert")
public class Scheduling extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public Scheduling() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String fname = request.getParameter("fname");
	      String lname = request.getParameter("lname");
	      String phone = request.getParameter("phone");
	      String email = request.getParameter("email");
	      String address = request.getParameter("address");
	      String date = request.getParameter("date");
	      String time = request.getParameter("time");
	      String service = request.getParameter("service");
	      
      Connection connection = null;
      String insertSql = " INSERT INTO myTable (id, FNAME, LNAME, PHONE, EMAIL, ADDRESS, DATE, TIME, SERVICE) values (default, ?, ?, ?,?,?,?,?,?)";

      try {
         DBConnection.getDBConnection();
         connection = DBConnection.connection;
         PreparedStatement preparedStmt = connection.prepareStatement(insertSql);
         preparedStmt.setString(1, fname);
         preparedStmt.setString(2, lname);
         preparedStmt.setString(3, phone);
         preparedStmt.setString(4, email);
         preparedStmt.setString(5, address);
         preparedStmt.setString(6, date);
         preparedStmt.setString(7, time);
         preparedStmt.setString(8, service);
         preparedStmt.execute();
         connection.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Please fill out the form ";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h2 align=\"center\">" + title + "</h2>\n" + //
            "<ul>\n" + //

            "  <li><b>First Name</b>: " + fname + "\n" + //
            "  <li><b>Last Name</b>: " + lname + "\n" + //
            "  <li><b>Phone</b>: " + phone + "\n" + //
            "  <li><b>E-mail</b>: " + email + "\n" + //
            "  <li><b>Address</b>: " + address + "\n" + //
            "  <li><b>Date</b>: " + date + "\n" + //
            "  <li><b>Time</b>: " + time + "\n" + //
            "  <li><b>Type of Service</b>: " + service + "\n" + //

            "</ul>\n");

      out.println("<a href=/webproject/scheduling.html>Search Data</a> <br>");
      out.println("</body></html>");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}