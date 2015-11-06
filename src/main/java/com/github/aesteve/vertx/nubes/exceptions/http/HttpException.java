package com.github.aesteve.vertx.nubes.exceptions.http;

public abstract class HttpException extends Throwable {

	private static final long serialVersionUID = 7595158960102835228L;

	public int status;
	public String msg;

	public HttpException(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg != null ? msg : "Http exception : " + status;
	}

}
