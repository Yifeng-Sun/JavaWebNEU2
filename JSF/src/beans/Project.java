package beans;

public class Project {
    public Project(String title, String hyperLink, String summary, String desc, String type) {
        this.title = title;
        this.hyperLink = hyperLink;
        this.summary = summary;
        this.desc = desc;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHyperLink() {
        return hyperLink;
    }

    public void setHyperLink(String hyperLink) {
        this.hyperLink = hyperLink;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String title;
    private String hyperLink;
    private String summary;
    private String desc;
    private String type;

}
