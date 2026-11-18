package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import readers.ConcreteCreator;
import readers.ReaderCreator;
import readers.ReaderProduct;
import writers.ConcreteCsvWriterCreator;
import writers.ConcreteTxtWriterCreator;
import writers.WriterCreator;
import writers.WriterProduct;

public class CafeModel {
	private Cafe cafe;
	
	public Cafe getCafe() {
		return cafe;
	}
	
	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	
	
	public void leseAusDate(String typ) throws IOException {
		ReaderCreator c = new ConcreteCreator();
		ReaderProduct p = c.factoryMethod(typ);
		this.cafe = p.leseausDatei(typ);
	}
	
	public void leseAusDateTxt(String typ) throws IOException {
		ReaderCreator c = new ConcreteCreator();
		ReaderProduct p = c.factoryMethod(typ);
		this.cafe = p.leseausDatei(typ);
	}
	
	public void schreibeCafesInModel() throws IOException {
		WriterCreator c = new ConcreteCsvWriterCreator();
		WriterProduct p = c.factoryMethod();
		p.schreibeCafesInModel(this.cafe);
	}
	
	public void schreibeCafesInTxt() throws IOException {
		WriterCreator c = new ConcreteTxtWriterCreator();
		WriterProduct p = c.factoryMethod();
		p.schreibeCafesInModel(cafe);
	}
}
