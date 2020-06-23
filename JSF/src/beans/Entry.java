package beans;

import javax.faces.bean.*;

@ManagedBean
public class Entry {
    public String goToHomepage(){
        return "real_homepage";
    }
    public String goToProject(){
        return "Project";
    }
    public String goToEdit(){
        return "ProjectEdit";
    }
    public String goToInterest(){
        return "Interest";
    }
    public String goToAboutMe(){
        return "AboutMe";
    }
}
