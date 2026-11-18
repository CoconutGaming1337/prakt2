package writers;

import java.io.IOException;

import business.Cafe;

public abstract class WriterProduct {
	
	public abstract void schreibeCafesInModel(Cafe cafe) throws IOException;
	
}
