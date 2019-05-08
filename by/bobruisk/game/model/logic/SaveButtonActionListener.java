package by.bobruisk.game.model.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import by.bobruisk.game.model.data.Player;

public class SaveButtonActionListener implements ActionListener {

	private Player player;
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public boolean saveGame(Player player) {
		boolean saveComplite = false;
		if (player != null) {
			new File("D:/GameSave/").mkdir();
			File saveFilePath = new File("D:/GameSave/save.sav");
			ObjectOutputStream saveWriter = null;

			try {
				FileOutputStream fos = new FileOutputStream(saveFilePath);
				if (fos != null) {
					saveWriter = new ObjectOutputStream(fos);
					saveWriter.writeObject(player);
					saveComplite = true;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO: handle exception
			} finally {
				if (saveWriter != null) {
					try {
						saveWriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} 
		return saveComplite;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (saveGame(player)) {
			JOptionPane.showMessageDialog(null, "Персонаж сохранен");
		} else {
			JOptionPane.showMessageDialog(null, "Сохранение не удалось");
		}
	}
}
