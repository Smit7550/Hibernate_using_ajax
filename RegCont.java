package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RegDao;
import vo.RegVo;
import vo.RegVo1;

/**
 * Servlet implementation class RegCont
 */
@WebServlet("/RegCont")
public class RegCont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegCont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1 = request.getParameter("un");
		String s2 = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		RegVo obj = new RegVo();
		obj.setUsername(s1);
		obj.setPassword(s2);
		
		RegDao obj1 = new RegDao();
		List ls = obj1.search(obj);
		System.out.println(ls.size());
		if(ls.size()>0)
		{
			out.println("Username & Password Exist");
		}
		else
		{
			out.println("Username & Password does not Exist");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1 = request.getParameter("fn");
		PrintWriter out = response.getWriter();
		HttpSession s = request.getSession();

		RegVo1 obj = new RegVo1();
		obj.setFirstname(s1);
		
		RegDao obj1 = new RegDao();
		List ls = obj1.search(obj);
		s.setAttribute("list", ls);
		
		response.sendRedirect("Json.jsp");
		
	}

}
