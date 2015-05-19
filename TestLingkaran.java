public class TestLingkaran
{
	public static void main(String[] args)
	{
		Lingkaran bangun = new Lingkaran();
		
		bangun.jari= 10;
		bangun.diameter= 20;
		
				
		bangun.CetakKeLayar();

		System.out.println("Luas: " + bangun.hitungLuas());
		System.out.println("Keliling: " + bangun.hitungKeliling());

		

	}
}
