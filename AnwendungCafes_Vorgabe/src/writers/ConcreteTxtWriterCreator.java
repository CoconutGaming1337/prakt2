package writers;

public class ConcreteTxtWriterCreator extends WriterCreator {

	@Override
	public WriterProduct factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteTxtWriterProduct();
	}

}
