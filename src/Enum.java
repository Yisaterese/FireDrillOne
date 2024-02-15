enum GeoPoliticalZones {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Yobe"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa_Ibom", "Bayelsa", "Cross_River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private String[] states;
    GeoPoliticalZones(String... states){
        this.states = states;
    }

    public String[] getStates(){
        return states;
    }
}
