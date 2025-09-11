package spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MusicDao {

	private JdbcTemplate jdbcTemplate;

	public MusicDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Music selectByTitle(String title) {
		List<Music> results = jdbcTemplate.query("select * from music where title = ?",

				(rs, num) -> {
					Music mu = new Music(rs.getInt("num"), rs.getString("title"), rs.getString("name"));
					return mu;
				}, title);
		return results.isEmpty() ? null : results.get(0);
	}

	public void insert(Music music) {
		jdbcTemplate.update("insert into music (title, name) values (?, ?)", music.getTitle(), music.getName());
	}

	public void update(Music music) {
		jdbcTemplate.update("update music set title = ?, name = ? where num = ?", music.getTitle(), music.getName(),
				music.getNum());
	}

	public void delete(int num) {
		jdbcTemplate.update("delete from music where num = ?", num);
	}

	public List<Music> selectAll() {
		return jdbcTemplate.query("select num, title, name from music",
				(rs, rowNum) -> new Music(rs.getInt("num"), rs.getString("title"), rs.getString("name")));
	}

}
