package br.com.somoseducacao.portal.util;

import java.util.List;

public class ResponsesErros<T> {

	private T data;
	private List<String> erros;

	public ResponsesErros(T data) {
		this.data = data;
	}

	public ResponsesErros(List<String> erros) {
		this.erros = erros;

	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

}
