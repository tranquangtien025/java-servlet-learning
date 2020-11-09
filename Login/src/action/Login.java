package action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;
//import service.StudentService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/jsp/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if ("Tien".equals(username) && "123".equals(password)) {
//			Student stu = new Student("SV001", "Tien", "Quang Tri");
			ArrayList<Student> list = new ArrayList<>();
			list.add(new Student("SV001", "Tien", "Quang Tri"));
			list.add(new Student("SV002", "Tien", "Quang Binh"));
			list.add(new Student("SV003", "Tien", "Binh Dinh"));
			list.add(new Student("SV004", "Tien", "Quang Nam"));
			list.add(new Student("SV005", "Tien", "Hue"));
			list.add(new Student("SV005", "Tien", "Ha Tinh"));
			request.setAttribute("list", list);
//			StudentService studentService = new StudentService();
//			Student stu = studentService.getStudent(username);
//			request.setAttribute("student", stu);
			request.setAttribute("username", username);
//			request.getRequestDispatcher("/WEB-INF/jsp/Welcome.jsp").forward(request, response);
			request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
		}
	}

}
