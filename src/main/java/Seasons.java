public enum Seasons {

    Spring(9),
    Summer(25) {
        public void getDescription() {
            System.out.println("Жаркое время года");
        }
    },
    Autumn(12),
    Winter(-15);

    Seasons(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }

    @Override
    public String toString() {
        return "(#" + ordinal() + ") {" + "avgTemp = " + avgTemp + "°C" + '}';
    }

    private double avgTemp;

}
