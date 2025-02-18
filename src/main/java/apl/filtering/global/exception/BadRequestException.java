package apl.filtering.global.exception;

import apl.filtering.global.message.FailureMessage;

public class BadRequestException extends RuntimeException {
    public BadRequestException(FailureMessage failureMessage) {
        super(failureMessage.getMessage());
    }

    public static BadRequestException wrong() {
        return new BadRequestException(FailureMessage.BAD_REQUEST);
    }
}
