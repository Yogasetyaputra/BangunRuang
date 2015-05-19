public class TestSegitiga
{
	public static void main(String[] args)
	{
		Segitiga bangun = new Segitiga();
		
		bangun.alas = 10;
		bangun.tinggi = 10;
		bangun.sisimiring = 20;
				
		bangun.CetakKeLayar();

		System.out.println("Luas: " + bangun.hitungLuas());
		System.out.println("Keliling: " + bangun.hitungKeliling());

		

	}
}
