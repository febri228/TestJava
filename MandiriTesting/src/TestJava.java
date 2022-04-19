
public class TestJava {
	
	public static void main(String[] args) {
		//Soal 2 penggabungan array
		int[] angka1 = {20,10,40,10,30};
		int[] angka2 = {30,10,70,50,30};
		int[] angka3 = {90,80};
		int panjang = angka1.length + angka2.length + angka3.length;
		int[] gabung = new int[panjang];
		int index = 0;
		int temp = 0;
		
		for(int angka : angka1) {
			gabung[index] = angka;
			index++;
		}
		
		for(int angka : angka2) {
			gabung[index] = angka;
			index++;
		}
		
		for(int angka : angka3) {
			gabung[index] = angka;
			index++;
		}
		
		System.out.println("Sebelum di sorting: ");
		for(int gabungAngka : gabung) {
			System.out.print(gabungAngka + " ");
		}
		
		for(int i = 1; i < gabung.length; i++) {
			for(int j = i; j > 0; j--) {
				if(gabung[j] < gabung[j-1]) {
					temp = gabung[j];
					gabung[j] = gabung[j-1];
					gabung[j-1] = temp;
				}
			}
		}
		
		System.out.println("\nSesudah di sorting: ");
		for(int gabungAngka : gabung) {
			System.out.print(gabungAngka + " ");
		}
		
		
	}

}
