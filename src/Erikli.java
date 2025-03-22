public class Erikli implements  ICarboy{
    @Override
    public Water flow(){
        Water water = new Water();
        water.setDegree(25);
        return water;
    }

}
