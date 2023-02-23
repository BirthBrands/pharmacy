package cscorner;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddMedicineServlet
 */
public class AddMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMedicineServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String batchNo = request.getParameter("batchNo");
            String name = request.getParameter("name");
	        String description = request.getParameter("description");
	        String price = request.getParameter("price");
	        String quantity = request.getParameter("quantity");
	        String section = request.getParameter("section"); 
	        String expiryDate = request.getParameter("expiryDate");
	        String dealerName = request.getParameter("dealerName");
	        String dealerContact = request.getParameter("dealerContact");
	        
	        // Set up the database connection
	        String url = "jdbc:mysql://localhost:3306/pms";
	        String username = "root";
	        String password = "1432";
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(url, username, password);
	            
	            // Create a prepared statement to insert the data into the database
	            String query = "INSERT INTO medicine (batch_no, name,  description, price, quantity, section, expiry_date, dealer_name, dealer_contact,  ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	            PreparedStatement stmt = conn.prepareStatement(query);
	            stmt.setString(1, batchNo);
	            stmt.setString(2, name);
	            stmt.setString(3, description);
	            stmt.setString(4, price);
	            stmt.setString(5, quantity);
	            stmt.setString(6, section);
	            stmt.setString(7, expiryDate);
	            stmt.setString(8, dealerName);
	            stmt.setString(9, dealerContact);
	            
	            
	            
	            // Execute the query and close the database connection
	            stmt.executeUpdate();
	            conn.close();
	            
	            // Redirect to a success page
	            response.sendRedirect("success.jsp");
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }


		
	

}
