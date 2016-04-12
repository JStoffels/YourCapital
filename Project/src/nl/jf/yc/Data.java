package nl.jf.yc;

import java.util.ArrayList;

public class Data extends Kandidaat {

	//constructor Data, voegt gegevens toe in addData methode
	public Data(){
		addData();
	}

	//arraylist met Kandidaat objecten
	private ArrayList<Kandidaat> arrKandidaat = new ArrayList<Kandidaat>();
	//private ArrayList<String> arrSkills = new ArrayList<String>();

	//voegt kandidaten toe aan array arrKandidaat door Kandidaat constructor met naam, leeftijd en skills aan te roepen
	public void addData(){
		arrKandidaat.add(new Kandidaat("Henk", 25, "Blaat", "Meh", "Behhh"));
		arrKandidaat.add(new Kandidaat("Samantha", 31, "BBQ", "Lammetjes"));
		arrKandidaat.add(new Kandidaat("Cesar", 26, "JAVA", "HTML", "PHP"));
		arrKandidaat.add(new Kandidaat("Jaap", 22, "Scrum Master"));
		arrKandidaat.add(new Kandidaat("Karel", 20, "Klaverjassen"));
	}

	//getter
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
