package byaj.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by student on 6/27/17.
 */
@Entity
public class CampBuilder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@NotNull
    //@Min(1)
    private int campBuilderID;

    private String campBuilderValue;

    private String campBuilderType;

    private String campBuilderAuthor;

    @Column(columnDefinition="integer default -1")
    private int campBuilderUser;

    private Date campBuilderDate=new Date();


    public int getCampBuilderID() {
        return campBuilderID;
    }

    /*public void setMateID(int campBuilderID) {
        this.campBuilderID = campBuilderID;
    }*/
    public String getCampBuilderValue() {
        return campBuilderValue;
    }

    public void setCampBuilderValue (String campBuilderValue) {
        this.campBuilderValue = campBuilderValue;
    }

    public String getCampBuilderType() {
        return campBuilderType;
    }

    public void setCampBuilderType (String campBuilderType) {
        this.campBuilderType = campBuilderType;
    }

    public String getCampBuilderAuthor() {
        return campBuilderAuthor;
    }

    public void setCampBuilderAuthor (String campBuilderAuthor) {
        this.campBuilderAuthor = campBuilderAuthor;
    }

    public int getCampBuilderUser() {
        return campBuilderUser;
    }

    public void setCampBuilderUser (int campBuilderUser) {
        this.campBuilderUser = campBuilderUser;
    }

    public Date getCampBuilderDate() {
        return campBuilderDate;
    }


    public String getFormatDate(){
        SimpleDateFormat format = new SimpleDateFormat("EEEE MMMMM dd, yyyy hh:mm a zzzz", Locale.US);
        return format.format(campBuilderDate);
    }
}