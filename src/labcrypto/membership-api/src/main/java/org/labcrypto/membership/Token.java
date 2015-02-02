package org.labcrypto.membership;

public interface Token {

    String value();

    boolean expired();

    long issueDate();

    int duration();

    boolean disabled();
}
