package userservletwithjsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userservletwithjsp.dao.StudentDao;
import userservletwithjsp.dto.Student;
@WebServlet("/signup")
public class SignUpServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name=req.getParameter("userName");
	String email=req.getParameter("userEmail");
	String password=req.getParameter("userPassword");
	long phone=Long.parseLong(req.getParameter("userPhone"));
	
	Student student=new Student();
	student.setEmail(email);
	student.setName(name);
	student.setPhone(phone);
	
	StudentDao dao=new StudentDao();
	dao.saveStudent(student);
	
	
	req.setAttribute("message", "SIGNUPSUCCESSFULLY PLEASE LOGIN");
	RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
	dispatcher.forward(req, resp);
	
	
	
	
	
}
}
