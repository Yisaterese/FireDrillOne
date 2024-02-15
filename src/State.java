public class State {
    public GeoPoliticalZones getGeoPoliticalZones(String inputState) {
        for(GeoPoliticalZones zones : GeoPoliticalZones.values()){
            GeoPoliticalZones theZones = getStstes(inputState, zones);
            if(theZones != null) return theZones;
        }
        return null;
    }

    private GeoPoliticalZones getStstes(String inputState, GeoPoliticalZones geoPoliticalZones){
        String[] states = geoPoliticalZones.getStates();
        for(int index = 0; index < states.length; index++){
            if(states[index].equalsIgnoreCase(inputState))
                return geoPoliticalZones;

        }
        return null;
    }

}
