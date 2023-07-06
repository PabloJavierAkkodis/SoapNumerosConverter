package soapnumeros;

/*
 * ACTIVIDAD DE REPASO N° 2 En base al siguiente servicio: 
 * https://www.dataaccess.com/webservicesserver/numberconversion.wso
 * generar una API de SOAP que implemente los siguientes metodos: 
 * 
 * - NumberToWords 
 * 
 * - NumberToDollars 
 * 
 * POasandole por parametro 1 numero. 
 * 
 * Mostrar por pantalla la respuesta de la API. 
 * 
 * Ademas el programa debe implementar pruebas unitarias probando 
 * la respuesta de la misma, si devuelve o no la palabra "dollars" 
 * 
 * 
 * Entregables: 
 * 
 * - Codigo del proyecto.
 * 
 * */


public class Main {

	public static void main(String[] args) {
		
		System.out.println(SoapNumerosApi.numberToWords(5));
		
		System.out.println(SoapNumerosApi.numberToDollars(5));


	}

}
