package com.myspace.moss;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MinisterAction implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Fund Destination")
	private java.lang.String fundDestination;
	@org.kie.api.definition.type.Label(value = "notes")
	private java.lang.String notes;

	public MinisterAction() {
	}

	public java.lang.String getFundDestination() {
		return this.fundDestination;
	}

	public void setFundDestination(java.lang.String fundDestination) {
		this.fundDestination = fundDestination;
	}

	public java.lang.String getNotes() {
		return this.notes;
	}

	public void setNotes(java.lang.String notes) {
		this.notes = notes;
	}

	public MinisterAction(java.lang.String fundDestination,
			java.lang.String notes) {
		this.fundDestination = fundDestination;
		this.notes = notes;
	}

}