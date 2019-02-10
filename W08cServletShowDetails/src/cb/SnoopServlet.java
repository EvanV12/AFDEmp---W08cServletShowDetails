package cb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SnoopServlet
 */
@WebServlet("/SnoopServlet")
public class SnoopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SnoopServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userAgent = request.getHeader("user-agent");
		String clientBrowser = "Αγνωστος";
		if (userAgent != null)
			clientBrowser = userAgent;
		request.setAttribute("client.browser", clientBrowser);
		request.getRequestDispatcher("/showDetails.jsp").forward(request, response);
	}

}
