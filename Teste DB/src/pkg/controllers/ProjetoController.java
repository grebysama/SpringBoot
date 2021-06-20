package pkg.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import pkg.beans.Projeto;


public class ProjetoController {
	
	public boolean addPessoa(Projeto projeto) throws IOException{
		boolean adicionou = false;
		
		URL url = new URL("http://localhost:8080/addProjeto");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");

		con.setDoOutput(true);

		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");

//		byte[] output = pessoa.personToJSON().getBytes();
		
		ObjectMapper mapper = new ObjectMapper();

	    // create a JSON object
	    ObjectNode projetoNode = mapper.createObjectNode();
	    
	    projetoNode.put("nome", projeto.getNome());
	    
	    if(projeto.getDataInicio() != null) {
	    	projetoNode.put("dataInicio", projeto.getDataInicio().toString());
	    }
	    if(projeto.getDataPrevisao() != null) {
	    	projetoNode.put("dataPrevisao", projeto.getDataPrevisao().toString());
	    }
	    if(projeto.getDataFim() != null) {
	    	projetoNode.put("dataFim", projeto.getDataFim().toString());
	    }
	    projetoNode.put("descricao", projeto.getDescricao());
	    projetoNode.put("status", projeto.getStatus());
	    projetoNode.put("orcamento", projeto.getOrcamento());
	    projetoNode.put("risco", projeto.getRisco());
	    
	    ObjectNode gerenteNode = mapper.createObjectNode();
	    
	    gerenteNode.put("id", projeto.getGerente().getId());
	    
	    projetoNode.set("gerente", gerenteNode);
	    
	    String json = mapper.writer().writeValueAsString(projetoNode);

	    System.out.println(json);
	    
		try(OutputStream os = con.getOutputStream()) {
			byte[] input = json.getBytes("utf-8");
			os.write(input, 0, input.length);			
		}
		
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

}
