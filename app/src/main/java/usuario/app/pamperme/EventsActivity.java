package usuario.app.pamperme;

/**
 * Created by herculanobarros on 26/01/2017.
 */

public class EventsActivity {

    int idclient;
    int idbabysitter;
    int numDays;

    public EventsActivity(int numDays, int idclient, int idbabysitter) {
        this.numDays = numDays;
        this.idclient = idclient;
        this.idbabysitter = idbabysitter;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public int getIdbabysitter() {
        return idbabysitter;
    }

    public void setIdbabysitter(int idbabysitter) {
        this.idbabysitter = idbabysitter;
    }

    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }
}
