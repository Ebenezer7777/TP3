package fr.ensim.info.tp3aymaneouhadi.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtaLabAddress {
    public String type;
    public String version;
    public List<Map<String, Object>> features = new ArrayList<>();
    public String attribution;
    public String licence;
    public String query;
    public int limit = 1;

    //toString
    @Override
    public String toString() {
        return "EtaLabAddress{" +
                "features=" + features +
                ", query='" + query + '\'' +
                '}';
    }
}
