package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DeptDAO;
import DAO.EmpDAO;
import DTO.DeptDTO;
import DTO.EmpDTO;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String view = null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		if (com.equals("/list") || com.equals("/")) {
			EmpDAO dao = new EmpDAO();
			List<EmpDTO> list = dao.selectList();
			request.setAttribute("list", list);
			view = "emplist.jsp";
		} else if (com.equals("/list2") || com.equals("/")) {
			DeptDAO dao2 = new DeptDAO();
			List<DeptDTO> list2 = dao2.selectList();
			request.setAttribute("list2", list2);
			view = "deptlist.jsp";
		} else if (com.equals("/insertForm")) {
			view = "redirect:insertForm.jsp";
		} else if (com.equals("/insertForm2")) {
			view = "redirect:insertForm2.jsp";
		} else if (com.equals("/insert")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			String hiredate = request.getParameter("hiredate");
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			EmpDAO dao = new EmpDAO();
			dao.insertOne(new EmpDTO(empno, ename, job, hiredate, deptno));
			view = "redirect:list";
		} else if (com.equals("/insert2")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			String dname = request.getParameter("dname");
			String loc = request.getParameter("loc");
			DeptDAO dao2 = new DeptDAO();
			dao2.insertOne(new DeptDTO(deptno, dname, loc));
			view = "redirect:list2";
		} else if (com.equals("/delete")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmpDAO dao = new EmpDAO();
			dao.deleteOne(empno);
			view = "redirect:list";
		} else if (com.equals("/delete2")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			DeptDAO dao2 = new DeptDAO();
			dao2.deleteOne(deptno);
			view = "redirect:list2";
		} else if (com.equals("/updateForm")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmpDAO dao = new EmpDAO();
			EmpDTO dto = dao.selectOne(empno);
			request.setAttribute("dto", dto);
			view = "updateForm.jsp";
		} else if (com.equals("/updateForm2")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			DeptDAO dao2 = new DeptDAO();
			DeptDTO dto2 = dao2.selectOne(deptno);
			request.setAttribute("dto2", dto2);
			view = "updateForm2.jsp";
		} else if (com.equals("/update")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			String hiredate = request.getParameter("hiredate");
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			EmpDAO dao = new EmpDAO();
			dao.updateOne(new EmpDTO(empno, ename, job, hiredate, deptno));
			view = "redirect:list";
		} else if (com.equals("/update2")) {
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			String dname = request.getParameter("dname");
			String loc = request.getParameter("loc");
			DeptDAO dao2 = new DeptDAO();
			dao2.updateOne(new DeptDTO(deptno, dname, loc));
			view = "redirect:list2";
		}
		

		if (view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		} else {
			request.getRequestDispatcher(view).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
