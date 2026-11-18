package writers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Cafe;

public class ConcreteTxtWriterProduct extends WriterProduct {

	@Override
	public void schreibeCafesInModel(Cafe cafe) throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("cafesAusgabe.txt", true));
		aus.write(cafe.gibCafeZurueck(' '));
		aus.close();
	}

}
