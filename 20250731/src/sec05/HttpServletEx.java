package sec05;

abstract class HttpServlet {
	public abstract void service();
}

class LoginServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("로그인 합니다.");
	}
	
}

class FileDownloadServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("파일 다운로드 합니다.");
	}
	
}

public class HttpServletEx {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
		
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
