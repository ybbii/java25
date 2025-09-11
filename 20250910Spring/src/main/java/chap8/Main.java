package chap8;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		MemberDao dao = ctx.getBean(MemberDao.class);
		
//		Member member = new Member(null, "hong@korea.com", "1234", "홍기준", LocalDateTime.now());
//		dao.insert2(member);
//		System.out.println("입력" + member.getId());
		
		System.out.println(dao.count("hong@korea.com") + "건");
		
		Member member = dao.selectByEmail2("hong@korea.com");
		System.out.println(member);

	}

}
