package br.com.correios.webservice.resource;

import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

public class ServiceImplement implements Service {
    Sroxml sro;
	@Override
	public Sroxml buscaEventos(String usuario, String senha, String tipo,
			String resultado, String lingua, String objetos)
			throws RemoteException {
		
		
		
		return sro;
	}

	@Override
	public Sroxml buscaEventosLista(String usuario, String senha, String tipo,
			String resultado, String lingua, String[] objetos)
			throws RemoteException {
		
		return null;
	}

	@Override
	public String rastroJson(String usuario, String senha, String tipo,
			String resultado, String lingua, String objetos)
			throws RemoteException {
		
		return null;
	}

	@Override
	public ListaEntregaExterna listaEntregaExterna(String loec)
			throws RemoteException {
		
		return null;
	}

	@Override
	public RegistroUnidades[] unidadesSRO(String codigoSRO)
			throws RemoteException {
		
		return null;
	}
	
}
