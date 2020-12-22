import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datas01 {
	public static void main(String[] args) {

		// Conversor de Data em String e vice e versa
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scn = new Scanner(System.in);

		System.out.print("Data 1: ");
		String ds1 = scn.next();
		System.out.print("Data 2: ");
		String ds2 = scn.next();

		try {
			Date d1 = sdf.parse(ds1);
			Date d2 = sdf.parse(ds2);

			long dif = d2.getTime() - d1.getTime();
			dif = dif / (24 * 60 * 60 * 1000);
			System.out.println(dif);

			if (d1.after(d2))
				System.out.println(ds1 + " é depois " + ds2);
			else
				System.out.println(ds1 + " é antes " + ds2);

		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		scn.close();
	}
}
