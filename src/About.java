

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class About
 */
@WebServlet("/About")
public class About extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public About() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("About Us"
				+ ""
				+ ""
				+ "Currently, many barbers and hair stylists are stuck in the dark ages of booking"
				+ " and scheduling via phone calls and record appointments on pen and paper."
				+ " This can lead to back and forth checking of availability for both the barber "
				+ "and the customer. This can be a long and tedious process that wastes time on both ends. "
				+ "In today’s day and age, customers want is instant gratification. If the customer can get a result faster;"
				+ " in this case, an appointment booked faster, the instant gratification is satisfied. The current process"
				+ " of calling to book an appointment can often fail to satisfy the customer.\r\n" + 
				"\r\n" + 
				" \r\n" + 
				"To improve this process of booking an appointment, we are choosing to develop a web application that will"
				+ " help the customer book an appointment with ease. Our goal is to make the process of booking an appointment "
				+ "simple, fast, intuitive, and efficient.  Also hope to streamline the information gathered so that the barber"
				+ " has a clear view of the tasks ahead of him or her. Overall, we hope to save time for both the customer and barber.");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
