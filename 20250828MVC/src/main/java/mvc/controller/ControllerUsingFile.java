package mvc.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

/**
 * Servlet implementation class ControllerUsingFile
 */
@WebServlet("/ControllerUsingFile")
public class ControllerUsingFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private Map<String, CommandHandler> commandHandlerMap = new ConcurrentHashMap<>();
       

	@Override
	public void init() throws ServletException {
		String configFile = getInitParameter("configFile");
        Properties prop = new Properties();
        String configFilePath = getServletContext().getRealPath(configFile);
        try (FileReader fis = new FileReader(configFilePath)) {
            prop.load(fis);
        } catch (IOException e) {
            throw new ServletException(e);
        }
        Iterator keyIter = prop.keySet().iterator();
        while (keyIter.hasNext()) {
            String command = (String) keyIter.next();
            String handlerClassName = prop.getProperty(command);
            try {
                Class<?> handlerClass = Class.forName(handlerClassName);
                CommandHandler handlerInstance =
                        (CommandHandler) handlerClass.newInstance();
                commandHandlerMap.put(command, handlerInstance);
            } catch (ClassNotFoundException | InstantiationException
            | IllegalAccessException e) {
                throw new ServletException(e);
            }
        }
	}
	
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String command = req.getParameter("command");  // 예: /ControllerUsingFile?command=hello

        CommandHandler handler = commandHandlerMap.get(command);
        if (handler != null) {
            String view = handler.process(req, resp);
            if (view != null) {
                req.getRequestDispatcher(view).forward(req, resp);
            }
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Command not found: " + command);
        }
    }

    @Override
    public void destroy() {
        // 서블릿 종료 시, 자원 정리 등을 처리할 수 있음
    }
    
	/**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerUsingFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
