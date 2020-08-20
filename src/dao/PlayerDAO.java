package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO{
	public List<Player>players = new ArrayList<Player>();
	public List< Player > getAllPlayers() {
		ConnectionManager con = new ConnectionManager();
		try {
			Statement st = con.getConnection().createStatement();
			String sql = "select ID,NAME,COUNTRY,S.ID,SKILLNAME FROM PERSON P INNERJOIN SKILL S WHERE S.ID = P,ID";
			ResultSet rs =  st.executeQuery(sql);
			while(rs.next()) {
				Long id = rs.getLong("ID");
				String name = rs.getString("NAME");
				String Country = rs.getString("country");
				Long Sid =  rs.getLong("ID");
				String skillName = rs.getString("skillName");
				Skill s = new Skill(Sid,skillName);
				Player p = new Player(id,name,Country,s);
				players.add(p);
				return players;
				
			}
			
			
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
