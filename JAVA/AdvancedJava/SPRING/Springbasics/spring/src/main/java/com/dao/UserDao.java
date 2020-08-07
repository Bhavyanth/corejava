package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.pojo.UserDetails;

public class UserDao {
	
	private JdbcTemplate jdbcTemplate;  
	
	private NamedParameterJdbcTemplate namedTemplate;
	
	
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public void setNamedTemplate(NamedParameterJdbcTemplate namedTemplate) {
		this.namedTemplate = namedTemplate;
	}



	public int saveUserDetails(UserDetails e){  
	    String query="insert into user values( '"+e.getUserId()+"','"+e.getV()+"','"+e.getUsername()+"','"+e.getCreatedBy()+"','2020-07-28')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateUserDetails(UserDetails e){  
	    String query="update user set USERNAME='"+e.getUsername()+"'  where USER_ID='"+e.getUserId()+"'";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteUserDetails(UserDetails e){  
	    String query="delete from user where USER_ID='"+e.getUserId()+"'";  
	    return jdbcTemplate.update(query);  
	}  
	
	//Prepared statement 
	public Boolean savePrepstaUserDetails(final UserDetails e){  
	    String query="insert into user values(?,?,?,?,?)";  
	    return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setInt(1, e.getUserId());
				ps.setInt(2, e.getV());
				ps.setString(3, e.getUsername());
				ps.setString(4, e.getCreatedBy());
				ps.setDate(5, new java.sql.Date(2020, 07, 03));
				return ps.execute();
			}
	    	
		});
	} 
	
	public List<UserDetails>  getusersResultsetextractor() {
		return jdbcTemplate.query("select * from user ", new ResultSetExtractor<List<UserDetails>>() {

			public List<UserDetails> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<UserDetails> userdetails = new ArrayList<UserDetails>();
				 while(rs.next()){  
					 UserDetails user = new UserDetails();
					 user.setUserId(rs.getInt(1));
					 user.setV(rs.getInt(2));
					 user.setUsername(rs.getString(3));
					 user.setCreatedBy(rs.getString(4));
					 user.setCreatedDate(rs.getDate(5));
					 userdetails.add(user);
				 }
				
				
				return userdetails;
			}
			
		});
	}
	
	
	public List<UserDetails>  getusersRowmapper() {
		return jdbcTemplate.query("select * from user ", new  RowMapper<UserDetails>() {

			public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserDetails user = new UserDetails();
				 user.setUserId(rs.getInt(1));
				 user.setV(rs.getInt(2));
				 user.setUsername(rs.getString(3));
				 user.setCreatedBy(rs.getString(4));
				 user.setCreatedDate(rs.getDate(5));
				return user;
			}
			
		});
	}
	
	
	/* named template */
	
	public void saveUserNamedTempalte(UserDetails e) {
		String query = "insert into user values(:id,:ver,:name,:creby,:creda)";
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("id",e.getUserId());  
		map.put("ver",e.getV());  
		map.put("name",e.getUsername());  
		map.put("creby",e.getCreatedBy());
		map.put("creda",e.getCreatedDate());
		
		namedTemplate.execute(query, map, new PreparedStatementCallback() {

			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return ps.execute();
			}
		});
		
		
	}

}
