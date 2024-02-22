/**
 * 
 */
package com.soap.client;


import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.soap.wsdl.TipoCambioFechaInicial;
import com.soap.wsdl.TipoCambioFechaInicialResponse;
import com.soap.wsdl.TipoCambioRango;
import com.soap.wsdl.TipoCambioRangoResponse;
import com.soap.wsdl.VariablesDisponibles;
import com.soap.wsdl.VariablesDisponiblesResponse;

/**
 * @author John
 *
 */
public class SoapClient extends WebServiceGatewaySupport{
	
	/**
	 * Método que se encarga de traer la data de Variables disponibles
	 */
	
	public VariablesDisponiblesResponse getVariablesDisponiblesResponse() {
		VariablesDisponibles variablesDisponiblesRequest = new VariablesDisponibles();
		
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://www.banguat.gob.gt/variables/ws/VariablesDisponibles");
		
		return (VariablesDisponiblesResponse) getWebServiceTemplate()
				.marshalSendAndReceive("https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx", variablesDisponiblesRequest, soapActionCallback);
	}
	
	/*
	 *  Metodo que se encarga de traer tipo de cambio en un rango de fechas
	 * */
	public TipoCambioRangoResponse getTipoCambioRangoResponse(String fecha_ini, String fecha_fin) {
		
		TipoCambioRango tipoCambioRangoRequest = new TipoCambioRango();
		tipoCambioRangoRequest.setFechainit(fecha_ini);
		tipoCambioRangoRequest.setFechafin(fecha_fin);
		
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://www.banguat.gob.gt/variables/ws/TipoCambioRango");
		
		return (TipoCambioRangoResponse) getWebServiceTemplate()
	            .marshalSendAndReceive("https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx", tipoCambioRangoRequest, soapActionCallback);
	}
	
	/**
	 * Metodo que se encarga de traer la data de Tipo de cambio de una fecha
	 */
	public TipoCambioFechaInicialResponse getTipoCambioFechaInicialResponse(String fecha) {
	    TipoCambioFechaInicial request = new TipoCambioFechaInicial();
	    request.setFechainit(fecha);
	    
	    SoapActionCallback soapActionCallback = new SoapActionCallback("http://www.banguat.gob.gt/variables/ws/TipoCambioFechaInicial");
	    
	    return (TipoCambioFechaInicialResponse) getWebServiceTemplate()
	            .marshalSendAndReceive("https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx", request, soapActionCallback);
	}
	
	

}
