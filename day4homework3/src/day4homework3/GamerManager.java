package day4homework3;

public class GamerManager implements GamerService{

	GamerCheckService gamerCheckManager;
	
	public GamerManager(GamerCheckService gamerCheckManager) {
		this.gamerCheckManager=gamerCheckManager;
	}

	
	@Override
	public void register(Gamer gamer) {
		
		if (gamerCheckManager.IfisRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" isimli kullan�c� kay�t oldu.");
		}
		else {
			System.out.println("kullan�c� kay�t olamad�, kullan�c� bilgileri yanl��.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" isimli kullan�c� bilgilerini g�ncelledi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" isimli kullan�c� bilgilerini sildi.");
		
	}
	@Override
	public void show(Gamer gamer, Game game) {
		System.out.println("Ad�: "+gamer.getFirstName());
		System.out.println("Soyad�: "+gamer.getLastName());
		System.out.println("Do�um y�l�: "+gamer.getYearOfBirth());
		System.out.println("Adl��� oyun: "+game.getGameName());
		System.out.println("Ald��� oyun fiyat�: "+game.getPrice());	
	}

}
