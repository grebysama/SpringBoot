package pkg.utility;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

import pkg.beans.Pessoa;

public class JSON2JavaObject {


	public static ArrayList<Pessoa> toPessoa(String json) {

		System.out.println(json);
		
		String strAux = json.substring(1, json.length()-2);

		ArrayList<String> jsonPersons = new ArrayList<String>(); 
		ArrayList<Pessoa> personList = new ArrayList<Pessoa>();

		String strJsonAux = "";

		System.out.println("chicote = " + strAux);

		for(int i = 0; i < strAux.length(); i++) {

			strJsonAux += strAux.charAt(i);

			if(i < strAux.length()-1 ) {

				if(strAux.substring(i, i+2).equals("},") || i == strAux.length()-1) {

					jsonPersons.add(strJsonAux);

					strJsonAux = ""; i++;

				}

			}else {

				jsonPersons.add(strJsonAux+"}");

				break; }

		}


		for(int i = 0; i < jsonPersons.size(); i++) {

			try {

				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
				objectMapper.setVisibility(VisibilityChecker.Std.defaultInstance().
						withFieldVisibility(Visibility.ANY));


				Pessoa person = objectMapper.readValue(jsonPersons.get(i), Pessoa.class);

				personList.add(person);

			} catch (JsonProcessingException e) { // TODO Auto-generated catch block
				e.printStackTrace(); }

		}

		for(int i = 0; i < personList.size(); i++) {

			System.out.println(personList.get(i).getId() + " " +
					personList.get(i).getNome());

		}

		return personList; }


	public static ArrayList<String> toString(String json) {

		String strAux = json.substring(1, json.length() - 2);

		ArrayList<String> jsonPersons = new ArrayList<String>();

		String strJsonAux = "";

		System.out.println("chicote = " + strAux);

		for (int i = 0; i < strAux.length(); i++) {

			strJsonAux += strAux.charAt(i);

			if (i < strAux.length() - 1) {

				if (strAux.substring(i, i + 2).equals("},") || i == strAux.length() - 1) {

					jsonPersons.add(strJsonAux);

					strJsonAux = "";
					i++;

				}

			} else {

				jsonPersons.add(strJsonAux + "}");

				break;
			}

		}

		return jsonPersons;
	}

}
