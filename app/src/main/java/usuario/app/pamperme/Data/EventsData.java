package usuario.app.pamperme.Data;

/**
 * Created by herculanobarros on 26/01/2017.
 */

public class EventsData {

    int idclient;
    int idbabysitter;
    int numDays;

    public EventsData(int numDays, int idclient, int idbabysitter) {
        this.numDays = numDays;
        this.idclient = idclient;
        this.idbabysitter = idbabysitter;
    }

    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }
}
