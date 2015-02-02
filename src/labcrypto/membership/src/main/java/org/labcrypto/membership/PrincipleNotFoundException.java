package org.labcrypto.membership;

import org.labcrypto.LabCryptoException;

public class PrincipleNotFoundException extends LabCryptoException {
    public PrincipleNotFoundException() {
    }

    public PrincipleNotFoundException(String message) {
        super(message);
    }

    public PrincipleNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrincipleNotFoundException(Throwable cause) {
        super(cause);
    }

    public PrincipleNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
