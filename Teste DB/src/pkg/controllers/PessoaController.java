package pkg.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import pkg.beans.Pessoa;
import pkg.utility.JSON2JavaObject;

public class PessoaController {
	
	public boolean addPessoa(Pessoa pessoa) throws IOException{
		boolean adicionou = false;
		
		URL url = new URL("http://localhost:8080/addPessoa");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");

		con.setDoOutput(true);

		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");

//		byte[] output = pessoa.personToJSON().getBytes();

		try(OutputStream os = con.getOutputStream()) {
			byte[] input = pessoa.personToJSON().getBytes("utf-8");
			os.write(input, 0, input.length);			
		}
		
		System.out.println("aqui " + pessoa.personToJSON());

		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(con.getInputStream(), "utf-8"))) {
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}
			System.out.println(response.toString());
		}

		con.disconnect();

		return adicionou;
	}
	
	public List<Pessoa> getFuncionarios() throws IOException{
		List<Pessoa> resultadoFuncionario = new ArrayList<Pessoa>();
		
		URL url = new URL("http://localhost:8080/getFuncionarios");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");

		con.setDoOutput(true);

		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");

//		byte[] output = pessoa.personToJSON().getBytes();

//		try(OutputStream os = con.getOutputStream()) {
//			byte[] input = pessoa.personToJSON().getBytes("utf-8");
//			os.write(input, 0, input.length);			
//		}
//		
//		System.out.println("aqui " + pessoa.personToJSON());

		try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				resultadoFuncionario = JSON2JavaObject.toPessoa(responseLine.trim());
			}
			System.out.println(response.toString());
		}

		con.disconnect();

		
		
		return resultadoFuncionario;
	}
	
	public List<Pessoa> getPessoas() throws IOException{
		List<Pessoa> resultadoFuncionario = new ArrayList<Pessoa>();
		
		URL url = new URL("http://localhost:8080/getPessoas");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");

		con.setDoOutput(true);

		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");

//		byte[] output = pessoa.personToJSON().getBytes();

//		try(OutputStream os = con.getOutputStream()) {
//			byte[] input = pessoa.personToJSON().getBytes("utf-8");
//			os.write(input, 0, input.length);			
//		}
//		
//		System.out.println("aqui " + pessoa.personToJSON());

		try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				resultadoFuncionario = JSON2JavaObject.toPessoa(responseLine.trim());
			}
			System.out.println(response.toString());
		}

		con.disconnect();

		
		
		return resultadoFuncionario;
	}
	

}
