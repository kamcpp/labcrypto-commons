package org.labcrypto.membership;

public class LabCryptoRole implements Role {

    private String name;

    public LabCryptoRole(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
