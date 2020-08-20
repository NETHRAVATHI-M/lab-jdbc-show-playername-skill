package model;

public class Player{
	private long playerId;
	private String name;
	private String Country;
	private Skill skill;
	public Player(long playerId, String name, String country, Skill skill) {
		super();
		this.playerId = playerId;
		this.name = name;
		Country = country;
		this.skill = skill;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}


	