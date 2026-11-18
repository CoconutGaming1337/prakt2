package readers;

public class ConcreteCreator extends ReaderCreator {

	@Override
	public ReaderProduct factoryMethod(String typ) {
		if(typ.equals("txt"))
			return new ConcreteTxtReaderProduct();
		else
			return new ConcreteCsvReaderProduct();
		
	}

}
