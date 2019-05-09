package by.bobruisk.game.model.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.bobruisk.game.model.data.Player;

public class LoadSaveWorker {
	
//	private Player player;
//	
//	public Player getPlayer() {
//		return player;
//	}
//
//	public void setPlayer(Player player) {
//		this.player = player;
//	}
//	
//	public boolean saveGame(Player player) {
//		File saveFilePath = new File("D:/GameSave/save.sav");
//		
//		boolean saveComplite = false;
//		
//		ObjectOutputStream saveWriter = null;
//		
//		try {
//			FileOutputStream fos = new FileOutputStream(saveFilePath);
//			if (fos != null) {
//				saveWriter = new ObjectOutputStream(fos);
//				saveWriter.writeObject(player);
//				saveComplite = true;
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO: handle exception
//		} finally {
//			if (saveWriter != null) {
//				try {
//					saveWriter.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		
//		return saveComplite;
//	}
//
//	public Player loadGame() throws InvalidObjectException{
//		File saveFilePath = new File("D:/GameSave/save.sav"); 
//		
//		ObjectInputStream ois = null;
//		try {
//			FileInputStream fis = new FileInputStream(saveFilePath);
//			if (fis != null) {
//				ois = new ObjectInputStream(fis);
//				Player player = (Player) ois.readObject();
//				return player;
//			}
//		} catch (FileNotFoundException e) {
//			//Error Message
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO: handle exception
//		} catch (ClassNotFoundException e) {
//
//		} finally {
//			try {
//				ois.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		throw new InvalidObjectException("Object fail");
//	}
}
