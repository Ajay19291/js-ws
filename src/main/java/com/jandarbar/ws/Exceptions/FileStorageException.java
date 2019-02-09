package com.jandarbar.ws.Exceptions;

public class FileStorageException extends RuntimeException {

	private static final long serialVersionUID = -6841181653595026123L;

	public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}