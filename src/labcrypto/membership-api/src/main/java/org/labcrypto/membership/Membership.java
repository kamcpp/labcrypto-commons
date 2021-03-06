package org.labcrypto.membership;

import java.util.List;

public interface Membership {

    Token authenticate(Credential credential)
            throws InvalidCredentialException, BadCredentialException, ServerException, MembershipPolicyException, InvalidTokenException;

    void validateToken(Token token)
            throws InvalidTokenException, ExpiredTokenException, ServerException;

    void disableToken(Token token)
            throws InvalidTokenException, ExpiredTokenException, ServerException;

    List<Role> getRoles(Token token)
            throws InvalidTokenException, ExpiredTokenException, ServerException, TokenNotFoundException;
}
