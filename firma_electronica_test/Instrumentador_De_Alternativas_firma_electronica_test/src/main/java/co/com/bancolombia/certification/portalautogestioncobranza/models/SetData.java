package co.com.bancolombia.certification.portalautogestioncobranza.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetData {

    public static final int CONSTANT = 0;

    public List<PortalAutogestionCobranzaData> setData(DataTable dataTable) {

        List<PortalAutogestionCobranzaData> credentials = new ArrayList<>();

        List<Map<String, String>> mapInfo = dataTable.asMaps();

        for (Map<String, String> map : mapInfo) {

            credentials.add(new ObjectMapper().convertValue(map, PortalAutogestionCobranzaData.class));
        }
        return credentials;
    }

}