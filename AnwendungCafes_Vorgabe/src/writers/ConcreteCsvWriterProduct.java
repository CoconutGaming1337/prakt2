package writers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Cafe;

public class ConcreteCsvWriterProduct extends WriterProduct {
	
	@Override
	public void schreibeCafesInModel(Cafe cafe) throws IOException{
		BufferedWriter aus = new BufferedWriter(new FileWriter("cafesAusgabe.csv", true));
		aus.write(cafe.gibCafeZurueck(';'));
		aus.close();
	}

}
