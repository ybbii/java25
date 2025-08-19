package com.du;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.du.dao.EmpDao;
import com.du.dto.Emp;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if (com.equals("/") || com.equals("/emp")) {
			EmpDao empdao = new EmpDao();
			List<Emp> emplist = empdao.selectList();
			request.setAttribute("emplist", emplist);
			request.setAttribute("isUpdate", "no");  // update / insert 구분
			view = "emp.jsp";
		} else if (com.equals("/delete")) {
			String empno = request.getParameter("empno");
			EmpDao empdao = new EmpDao();
			empdao.delete(empno);
			view = "redirect:emp";
		} else if (com.equals("/insert")) {
			request.setCharacterEncoding("utf-8");
			String isUpdate = request.getParameter("isUpdate"); // update?
			int empno = Integer.parseInt(request.getParameter("empno"));
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			int mgr = Integer.parseInt(request.getParameter("mgr"));
			String hiredate = request.getParameter("hiredate");
			int sal = Integer.parseInt(request.getParameter("sal"));
			int comm = Integer.parseInt(request.getParameter("comm"));
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			EmpDao empdao = new EmpDao();
			if (isUpdate.equals("no")) {
				empdao.insert(emp);
			} else if (isUpdate.equals("yes")) {
				empdao.update(emp);
			}
			
			view = "redirect:emp";
		} else if (com.equals("/updateForm")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmpDao empdao = new EmpDao();
			Emp emp = empdao.selectOne(empno);
			request.setAttribute("dto", emp);
			List<Emp> emplist = empdao.selectList();
			request.setAttribute("emplist", emplist);
			request.setAttribute("isUpdate", "yes");  // update / insert 구분
			view = "insert.jsp";
		}
		
		if (view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		} else {
			request.getRequestDispatcher(view).forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}