package by.bobruisk.game.controller;

import by.bobruisk.game.model.data.Player;
import by.bobruisk.game.view.MainWindow;
import by.bobruisk.game.view.fightwindow.FightWindow;

public class Main {
	public static void main(String[] args) {
		//MainWindow window = new MainWindow();
		Player player = new Player();
		FightWindow window = new FightWindow();
		window.setPlayer(player);
		window.init();
	}
}
