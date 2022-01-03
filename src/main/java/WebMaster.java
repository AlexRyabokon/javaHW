public class WebMaster extends User {

    private String website;

    public WebMaster(){
        super();
        this.website = website;

    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTextInfo() {

        return super.getTextInfo() + "Website: " + website;
    }
}
