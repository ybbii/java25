package spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private static ApplicationContext ctx = null;
	private static MusicDao dao = null;

	public static void main(String[] args) throws IOException {
		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		dao = ctx.getBean(MusicDao.class);

		Music music = dao.selectByTitle("love");
		System.out.println(music);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("명령어를 입력하세요:");
			String command = reader.readLine();
			if (command.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			if (command.startsWith("new ")) {
				processNewCommand(command.split(" "));
				continue;
			} else if (command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			} else if (command.equals("list")) {
				processListCommand();
				continue;
			} else if (command.startsWith("delete ")) {
				processDeleteCommand(command.split(" "));
				continue;
			}
			printHelp();
		}
	}

	private static void processNewCommand(String[] arg) {
		if (arg.length != 3) {
			printHelp();
			return;
		}
		String title = arg[1];
		String name = arg[2];
		dao.insert(new Music(0, title, name));
		System.out.println("추가 완료: " + title + " - " + name);
	}

	private static void processChangeCommand(String[] arg) {
		if (arg.length != 4) {
			printHelp();
			return;
		}
		int num = Integer.parseInt(arg[1]);
		String title = arg[2];
		String name = arg[3];
		dao.update(new Music(num, title, name));
		System.out.println("수정 완료: " + num);
	}

	private static void processListCommand() {
		List<Music> list = dao.selectAll();
		if (list.isEmpty()) {
			System.out.println("등록된 음악이 없습니다.");
		} else {
			list.forEach(System.out::println);
		}
	}

	private static void processDeleteCommand(String[] arg) {
		if (arg.length != 2) {
			printHelp();
			return;
		}
		int num = Integer.parseInt(arg[1]);
		dao.delete(num);
		System.out.println("삭제 완료: " + num);
	}

	private static void printHelp() {
		System.out.println("명령어 사용법:");
		System.out.println("new [title] [name]");
		System.out.println("change [num] [title] [name]");
		System.out.println("list");
		System.out.println("delete [num]");
	}
}
