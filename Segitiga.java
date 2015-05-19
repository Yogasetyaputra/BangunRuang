public class Segitiga
{
	int alas;
	int tinggi;
	int sisimiring;

	public void CetakKeLayar()
	{
		System.out.println("Alas: " + alas);
		System.out.println("Tinggi: " + tinggi);
		System.out.println("Sisimiring: " + sisimiring);

	}

	public  void ubahProperty(int alasBaru, int tinggiBaru, int sm)
	{
		alas = alasBaru;
		tinggi = tinggiBaru;
		sisimiring = sm;
	}

	public double hitungLuas()
	{
		double luas;
		luas = ((0.5) * alas * tinggi);
		return luas;
	}

	public int hitungKeliling()
	{
		int keliling;
		keliling = (alas + sisimiring + sisimiring);
		return keliling;
	}
}
