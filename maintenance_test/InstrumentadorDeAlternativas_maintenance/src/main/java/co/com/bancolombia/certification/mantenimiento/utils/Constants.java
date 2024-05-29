package co.com.bancolombia.certification.mantenimiento.utils;

public enum Constants {
    ACTOR_PAGE("jomruiz@bancolombia.com"),
    URL("https://mntcobranza-qa.apps.ambientesbc.com/banner");

    private String constant;

    Constants(String constant) {
        this.constant = constant;
    }

    public String getConstant() {
        return constant;
    }
}
