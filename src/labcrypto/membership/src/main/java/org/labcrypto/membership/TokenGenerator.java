package org.labcrypto.membership;

public interface TokenGenerator {
    Token generate(Credential credential, Principal principal);
}
