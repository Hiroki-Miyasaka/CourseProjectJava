package ca.ciccc.wmad.exam.problem5;

public class Url {
    private String protocol;
    private String baseUrl;
    private String resourceAddress;

    public Url(String protocol, String baseUrl, String resourceAddress) {
        this.protocol = protocol;
        this.baseUrl = baseUrl;
        this.resourceAddress = resourceAddress;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getResourceAddress() {
        return resourceAddress;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setResourceAddress(String resourceAddress) {
        this.resourceAddress = resourceAddress;
    }

    public void printUrl(){
        System.out.println(protocol + "://www." + baseUrl + "/" + resourceAddress);
    }
}
