package br.com.correios.webservice.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;





public class Teste {
	public static void main(String[] args) {

		try{
			String msgRetorno = "";
			// Definir a URL Do Serviço sem a ?WSDL no fim
			URL url = new URL("http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx");
			URLConnection conn = url.openConnection();
			// Define que a Conexão terá uma saída/retorno
			conn.setDoOutput(true);
			// Método a ser Consumido pela requisição
			conn.setRequestProperty("SOAPAction",
					"http://webservice.correios.com.br/service/rastro/Rastro.wsdl");
			// Propriedades da Mensagem SOAP
			conn.setRequestProperty("Type","Request-Response");
			conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			conn.setRequestProperty("Accept-Encoding","gzip,deflate");
			conn.setRequestProperty("User-Agent","Jakarta Commons-HttpClient/3.1");
			// Canal de Saída da Requisição
			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			// Mensagem no Formato SOAP   
			String xml ="<soapenv:Envelope "
					+ "xmlns:soapenv=http://schemas.xmlsoap.org/soap/envelope/"
					+ "xmlns:res=http://resource.webservice.correios.com.br/>"
					+ "<soapenv:Header/>"
					+"<soapenv:Body>"
					+"<res:buscaEventos>"
					+"<usuario>ECT</usuario>"
					+"<senha>CRO</senha>"
					+"<tipo>L</tipo>"
					+"<resultado>T</resultado>"
					+"<lingua>101</lingua>"
					+"<objetos>DE570284245BR</objetos>"
					+"</res:buscaEventos>"
					+"</soapenv:Body>"
					+"</soapenv:Envelope>";



			wr.write(xml);
			wr.flush();

			System.out.println("Requisição >> "+conn.getOutputStream());
			// Leitura da Resposta do Serviço
			BufferedReader rd = new BufferedReader(new
					InputStreamReader(conn.getInputStream()));
			// Leituras das Linhas da Resposta
			while (rd.ready()){
				msgRetorno += rd.readLine();
			}
			wr.close();
			rd.close();
			conn.getInputStream().close();
			System.out.println("Resposta >> "+ msgRetorno);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			System.out.println("Fim");
		}
	}

}
