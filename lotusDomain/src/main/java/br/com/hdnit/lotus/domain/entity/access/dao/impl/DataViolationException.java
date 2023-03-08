package br.com.hdnit.lotus.domain.entity.access.dao.impl;

public class DataViolationException extends Exception {

	private static final long serialVersionUID = -9048344046909610842L;

	public DataViolationException() {
	}

	public DataViolationException(String message) {
		super(message);
	}

	public DataViolationException(Throwable cause) {
		super(cause);
	}

	public DataViolationException(String message, Throwable cause) {
		super(message, cause);
	}

}
