public class DispenserBridge {
    private final ICarboy carboy;
    private final IDispenser dispenser;
    public DispenserBridge(ICarboy carboy , IDispenser dispenser){
        this.carboy=carboy;
        this.dispenser=dispenser;
    }
    public Water hot(){
        Water wather = carboy.flow();
        return dispenser.hot(wather);

    }
    public Water cold(){
        Water water = carboy.flow();
        return  dispenser.cold(water);


    }
    public Water normal(){
        Water wather = carboy.flow();
        return dispenser.normal(wather);

    }



}
