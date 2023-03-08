package br.com.hdnit.lotus.domain.entity.corporativo.bo.exception;

public class GenericBussinessException extends Exception {

	private static final long serialVersionUID = -9048344046909610842L;

	public GenericBussinessException() {
	}

	public GenericBussinessException(String message) {
		super(message);
	}

	public GenericBussinessException(Throwable cause) {
		super(cause);
	}

	public GenericBussinessException(String message, Throwable cause) {
		super(message, cause);
	}

}
