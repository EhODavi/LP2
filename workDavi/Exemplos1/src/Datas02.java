
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datas02 {
	public static void main(String[] args) {

		// Conversor de Data em String e vice e versa
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date d1 = new Date(); // Data e hora do sistema
		System.out.println(d1);
		System.out.println("Data do Sistema: " + sdf.format(d1));

		Scanner scn = new Scanner(System.in);
		System.out.print("Data: ");
		String ds = scn.next();

		try {
			Date d2 = sdf.parse(ds);
			System.out.println(d2);
		} catch (ParseException e) {
//			e.printStackTrace();
			System.out.println("Errou");
		}
		scn.close();
	}
}
