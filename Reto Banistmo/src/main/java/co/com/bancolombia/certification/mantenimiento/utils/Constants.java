package co.com.bancolombia.certification.mantenimiento.utils;

public enum Constants {
    ACTOR_PAGE("jomruiz@bancolombia.com"),
    URL("http://www.bancolombia.com/");

    private String constant;

    Constants(String constant) {
        this.constant = constant;
    }

    public String getConstant() {
        return constant;
    }
}
