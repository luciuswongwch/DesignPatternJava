package com.luciuswong.structural.flyweight;


import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {
	public enum ErrorType { GenericSystemError, PageNotFoundError, ServerError }
	private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();
	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}

	private ErrorMessageFactory() {
		errorMessages.put(ErrorType.GenericSystemError, new SystemErrorMessage("A generic error of type $errorCode occurred. Please refer to: ", "http://google.com/q="));
		errorMessages.put(ErrorType.PageNotFoundError, new SystemErrorMessage("Page not found error of type $errorCode occurred. Please refer to: ", "http://google.com/q="));
		errorMessages.put(ErrorType.ServerError, new SystemErrorMessage("Server error of type $errorCode occurred. Please refer to: ", "http://google.com/q="));
	}

	public SystemErrorMessage getError(ErrorType type) {
		return errorMessages.get(type);
	}

	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}