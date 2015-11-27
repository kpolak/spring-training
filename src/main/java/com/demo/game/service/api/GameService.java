package com.demo.game.service.api;

import com.demo.game.model.Game;

public interface GameService {

	Iterable<Game> listGames();
	Game getGame(long id);

	Game startGame(String playerName);
	Game joinGame(long gameId, String playerName);

	Game moveUp(long gameId, String playerName);
	Game moveDown(long gameId, String playerName);
	Game moveRight(long gameId, String playerName);
	Game moveLeft(long gameId, String playerName);

}