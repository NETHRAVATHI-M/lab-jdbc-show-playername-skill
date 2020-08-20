package controller;

import java.util.List;

import dao.PlayerDAO;
import model.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerDAO doa = new PlayerDAO();
		List<Player> l = doa.getAllPlayers();
		for (Object object : l) {
			System.out.println(object.toString());
		}
	}

}
