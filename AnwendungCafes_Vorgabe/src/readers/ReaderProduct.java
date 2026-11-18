package readers;

import java.io.IOException;

import business.Cafe;

public abstract class ReaderProduct {
	public abstract Cafe leseausDatei(String typ) throws IOException;
}
