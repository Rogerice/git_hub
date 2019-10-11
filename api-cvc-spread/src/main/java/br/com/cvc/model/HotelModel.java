package br.com.cvc.model;

import org.springframework.stereotype.Component;

@Component
public class HotelModel {

	private Long id;
	private String name;

	public HotelModel() {
		// TODO Auto-generated constructor stub
	}

	
	public HotelModel(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return name;
	}

	public void setCategoryName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HotelModel [id=" + id + ", Categoria do Hotel =" + name + "]";
	}
	
}
