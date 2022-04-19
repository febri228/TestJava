import java.util.Scanner;

public class TestSoal1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan formula: ");
		String formula = scan.nextLine();
		
		String perkalian = formula.replaceAll("[1-9]*", "");
		String angka = formula.replaceAll("[1-9]*+", "");
		System.out.println(angka);
		
	}

}
