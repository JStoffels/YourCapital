package nl.jf.yc;

import java.util.ArrayList;

public class Data {

	public ArrayList<Kandidaat> arrKandidaat = new ArrayList<Kandidaat>();

	public void addData(){
		arrKandidaat.add(new Kandidaat("Henk", 25));
		arrKandidaat.add(new Kandidaat("Samantha", 31));
		arrKandidaat.add(new Kandidaat("Cesar", 26));
		arrKandidaat.add(new Kandidaat("Jaap", 22));
		arrKandidaat.add(new Kandidaat("Karel", 20));
	}
}
