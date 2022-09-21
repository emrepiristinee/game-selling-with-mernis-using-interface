package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void Add(Game game) {
		System.out.println(
				game.GameName + " oyunu " + game.Price + " $ fiyatýyla eklendi.");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println(
				game.GameName + " oyunu " + game.Price + " $ fiyatýyla silindi.");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(
				game.GameName + " oyunu " + game.Price + " $ fiyatýyla güncellendi.");
		
	}

}
