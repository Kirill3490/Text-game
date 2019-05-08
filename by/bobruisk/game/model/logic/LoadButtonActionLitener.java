package by.bobruisk.game.model.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

import by.bobruisk.game.model.data.Player;

public class LoadButtonActionLitener implements ActionListener {
	private Player player;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Player loadGame() throws InvalidObjectException {
		File saveFilePath = new File("D:/GameSave/save.sav");

		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream(saveFilePath);
			if (fis != null) {
				ois = new ObjectInputStream(fis);
				Player player = (Player) ois.readObject();
				return player;
			}
		} catch (FileNotFoundException e) {
			// Error Message
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {

		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		throw new InvalidObjectException("Object fail");
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		try {
			this.player = loadGame();
			JOptionPane.showMessageDialog(null, "Персонаж успешно загружен");
		} catch (InvalidObjectException e) {
			JOptionPane.showMessageDialog(null, "Ошибка загрузки сохранения");
			e.printStackTrace();
		}
	}

}
