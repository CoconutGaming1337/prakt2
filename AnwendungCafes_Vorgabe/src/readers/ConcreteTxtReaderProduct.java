package readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import business.Cafe;

public class ConcreteTxtReaderProduct extends ReaderProduct {

	@Override
	public Cafe leseausDatei(String typ) throws IOException {
		BufferedReader ein = new BufferedReader(new FileReader("Cafe.csv"));
		String[] zeile = ein.readLine().split(" ");
		ein.close();
		return new Cafe(zeile[0], 
			zeile[1], 
			zeile[2], 
			zeile[3], 
			zeile[4].split("_"));
	}

}
