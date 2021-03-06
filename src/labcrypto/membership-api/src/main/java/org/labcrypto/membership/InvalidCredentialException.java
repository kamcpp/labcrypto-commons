package org.labcrypto.membership;

import org.labcrypto.LabCryptoException;

public class InvalidCredentialException extends LabCryptoException {
    public InvalidCredentialException() {
    }

    public InvalidCredentialException(String message) {
        super(message);
    }

    public InvalidCredentialException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCredentialException(Throwable cause) {
        super(cause);
    }

    public InvalidCredentialException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
