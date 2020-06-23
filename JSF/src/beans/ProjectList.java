package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class ProjectList implements Serializable {
    private ArrayList<Project> projectArrayList = new ArrayList<>();

    public ProjectList() {
        projectArrayList.add(new Project("OnTime", "", "A web based program to run on WeChat platform." ,"The aim of this program is to help user managing their timetable, by generate a timeline using the information given by the user, and send WeChat notification if the user want to get reminded." ,"Using Web technology."));
        projectArrayList.add(new Project("MotionFlow" ,"https://github.com/YIFENGSCOTT/MotionFlow", "An arduino related project.", "This project created a boxing glove, which has LEDs on its surface and a accelerometer inside when the logic models detect punch, the LED matrix display animation.", "Using Arduino technology."));
        projectArrayList.add(new Project("NEUCloudClinic", "https://github.com/YIFENGSCOTT/NeueduClinic", "A Java/JavaFX based project.", "This project models the basic process of a patient's visit to the clinic, and provides a GUI running JavaFX.", "Using Java/JavaFX technology."));
        System.out.println("init");
    }

    public ArrayList<Project> getProjectArrayList() {
        return projectArrayList;
    }

    public void setProjectArrayList(ArrayList<Project> projectArrayList) {
        this.projectArrayList = projectArrayList;
    }
}
