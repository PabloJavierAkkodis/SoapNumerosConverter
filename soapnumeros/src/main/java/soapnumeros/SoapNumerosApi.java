package soapnumeros;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

public class SoapNumerosApi {

	
		

		public static String numberToWords(int num) {
			String result = "";
			
			try {
				String endpoint = "https://www.dataaccess.com/webservicesserver/numberconversion.wso";
				//Creamos la conexion
				SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
				SOAPConnection soapConnection = soapConnectionFactory.createConnection();
				//Creamos el mensaje SOAP
				MessageFactory messageFactory = MessageFactory.newInstance();
				SOAPMessage soapMessage = messageFactory.createMessage();
				//Crear el cuerpo del mensaje SOAP
				SOAPPart soapPart = soapMessage.getSOAPPart();
				SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
				//SOAPMessage soapResponse = soapConnection.call(soapMessage, endpoint);
				SOAPBody soapBody = soapEnvelope.getBody();
				
				
				//Construimos el mensaje a enviar
				//En base a la documentación, se declaran los elementos intA e intB
				SOAPElement operationElement = soapBody.addChildElement("NumberToWords", "", "http://www.dataaccess.com/webservicesserver/");
				SOAPElement intAElement = operationElement.addChildElement("ubiNum");
				intAElement.addTextNode(String.valueOf(num));
				
				
				
				//Enviar el mensaje SOAP y recibir la respuesta
				SOAPMessage soapResponse = soapConnection.call(soapMessage, endpoint);
				//Procesamos la respuesta.
				SOAPBody responseBody = soapResponse.getSOAPBody();
				result = responseBody.getTextContent();
				soapConnection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return result;
		}
	
		public static String numberToDollars(int num) {
				String dollars = "";
				
				try {
					String endpoint = "https://www.dataaccess.com/webservicesserver/numberconversion.wso";
					//Creamos la conexion
					SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
					SOAPConnection soapConnection = soapConnectionFactory.createConnection();
					//Creamos el mensaje SOAP
					MessageFactory messageFactory = MessageFactory.newInstance();
					SOAPMessage soapMessage = messageFactory.createMessage();
					//Crear el cuerpo del mensaje SOAP
					SOAPPart soapPart = soapMessage.getSOAPPart();
					SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
					//SOAPMessage soapResponse = soapConnection.call(soapMessage, endpoint);
					SOAPBody soapBody = soapEnvelope.getBody();
					
					
					//Construimos el mensaje a enviar
					//En base a la documentación, se declaran los elementos intA e intB
					SOAPElement operationElement = soapBody.addChildElement("NumberToDollars", "", "http://www.dataaccess.com/webservicesserver/");
					SOAPElement intAElement = operationElement.addChildElement("dNum");
					intAElement.addTextNode(String.valueOf(num));
					
					
					
					//Enviar el mensaje SOAP y recibir la respuesta
					SOAPMessage soapResponse = soapConnection.call(soapMessage, endpoint);
					//Procesamos la respuesta.
					SOAPBody responseBody = soapResponse.getSOAPBody();
					dollars = responseBody.getTextContent();		
					soapConnection.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				return dollars;
		}

	
}
