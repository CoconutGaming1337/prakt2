package writers;

public class ConcreteCsvWriterCreator extends WriterCreator {

	@Override
	public WriterProduct factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteCsvWriterProduct();
	}

}
