package org.labcrypto.membership;

import org.labcrypto.LabCryptoException;

public class ExpiredTokenException extends LabCryptoException {
    public ExpiredTokenException() {
    }

    public ExpiredTokenException(String message) {
        super(message);
    }

    public ExpiredTokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExpiredTokenException(Throwable cause) {
        super(cause);
    }

    public ExpiredTokenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
