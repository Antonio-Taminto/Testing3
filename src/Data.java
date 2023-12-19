import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Data {
    private OffsetDateTime data;
    public Data(OffsetDateTime data){
        this.data=data;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public String dataString(){
        String dataString = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        return dataString;
    }

}
