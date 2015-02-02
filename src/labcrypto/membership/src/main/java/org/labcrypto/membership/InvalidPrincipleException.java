package org.labcrypto.membership;

import org.labcrypto.LabCryptoException;

public class InvalidPrincipleException extends LabCryptoException {
    public InvalidPrincipleException() {
    }

    public InvalidPrincipleException(String message) {
        super(message);
    }

    public InvalidPrincipleException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPrincipleException(Throwable cause) {
        super(cause);
    }

    public InvalidPrincipleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
