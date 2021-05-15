package day4homework3;

public class GameSaleManager implements GameSaleService{

	Gamer gamer;
	public GameSaleManager(Gamer gamer) {
		this.gamer=gamer;
	}
	
	@Override
	public void buy(Game game) {
		System.out.println(gamer.getFirstName()+" isimli kullan�c� "+game.getGameName()+" isimli oyunu sat�n ald�.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(gamer.getFirstName()+" isimli kullan�c� "+game.getGameName()+" isimli oyunu iade etti.");
		
	}

	

}
