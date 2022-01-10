package tacos.domain;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Repository
public class JDBCIngredientRepository implements IngredientRepository {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	


	@Override
	public List<Ingredient> findAll() {
		return jdbcTemplate.query("select id,name,type from Ingredient", this::mapRowToIngredient);
	}

	@Override
	public Ingredient findOne(String id) {
		return jdbcTemplate.queryForObject("select id,name,type from Ingredient where id = ?", this::mapRowToIngredient, id);
	}

	@Override
	public Ingredient save(Ingredient entity) {
		jdbcTemplate.update("insert into Ingredient (id,name,type) values(?,?,?)",entity.getId(),entity.getName(),entity.getType().toString());
		return entity;
	}

	private Ingredient mapRowToIngredient(ResultSet rs,int rowNum) throws SQLException {
		return new Ingredient(rs.getString("id"), rs.getString("name"),Ingredient.Type.valueOf(rs.getString("type")));
	}
}
