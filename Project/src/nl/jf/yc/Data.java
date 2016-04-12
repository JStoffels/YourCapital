package nl.jf.yc;

import java.util.ArrayList;

public class Data extends Kandidaat {

	public Data(){
		addData();
	}

	private ArrayList<Kandidaat> arrKandidaat = new ArrayList<Kandidaat>();
	//private ArrayList<String> arrSkills = new ArrayList<String>();

	//voegt kandidaten toe aan array arrKandidaat
	public void addData(){
		arrKandidaat.add(new Kandidaat("Henk", 25, "bla", "bla2"));
		arrKandidaat.add(new Kandidaat("Samantha", 31, "BBQ", "Lammetjes"));
		arrKandidaat.add(new Kandidaat("Cesar", 26));
		arrKandidaat.add(new Kandidaat("Jaap", 22));
		arrKandidaat.add(new Kandidaat("Karel", 20));
	}

	public ArrayList<Kandidaat> getArrayTotaal(){
		return this.arrKandidaat;
	}

	/*public String getResultaat(String s){
		if(arrKandidaat == null){
			getArrayTotaal();
		}
		if(s==""){
			return getArrayTotaal();
		}else if(s!=""){
			for(Kandidaat k: arrKandidaat){
				if(s.equals(k.getNaam().toString())){
					return k.getNaam();
				}
			}
		}
		return "Invalid entry";   
	}*/

	/*public String getArrayTotaal(){
	String sb = "";
	for (int i =0; i < arrKandidaat.size(); i++){
		sb = sb.concat(arrKandidaat.get(i).getNaam() + "   " + arrKandidaat.get(i).getLeeftijd() + " " + arrKandidaat.get(i).getArrSkills()+"<br>");    		
	}

	return sb;
}

public String getArrayNaam(String s, int x){
	String sb = "";
	for (int i =0; i < arrKandidaat.size(); i++){
		sb = sb.concat(arrKandidaat.get(i).getNaam() + " " + arrKandidaat.get(i).getLeeftijd() + "<br>");    		
	}
	return sb;
}  */  
}
