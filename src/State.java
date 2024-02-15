public class State {
    public GeoPoliticalZones getGeoPoliticalZones()(String inputState){
        GeoPoliticalZones[] geoZones = GeoPoliticalZones.values();
        for(int index = 0; index < geoZones.length; index++){
            GeoPoliticalZones zonesStates = geoZones[index];
            if(zonesStates.name().equalsIgnoreCase(inputState)) {
                return zonesStates;
            }
        }
        return null;
    }

}
