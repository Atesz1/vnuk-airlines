package vn.edu.vnuk.airlines.model;

import javax.validation.constraints.NotNull;

public class PriceTypes {
	
	@NotNull
	private Long id;
	
	@NotNull
	private String label;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
