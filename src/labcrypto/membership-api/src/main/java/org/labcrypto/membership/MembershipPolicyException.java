package org.labcrypto.membership;

import org.labcrypto.LabCryptoException;

public class MembershipPolicyException extends LabCryptoException {
    public MembershipPolicyException() {
    }

    public MembershipPolicyException(String message) {
        super(message);
    }

    public MembershipPolicyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MembershipPolicyException(Throwable cause) {
        super(cause);
    }

    public MembershipPolicyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
