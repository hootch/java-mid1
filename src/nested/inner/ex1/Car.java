package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    //엔진 에서만 사용
    public String getModel() {
        return model;
    }
    //엔진 에서만 사용
    public int getChargeLevel() {
        return chargeLevel;
    }
    //엔진 에서만 사용
    public Engine getEngine() {
        return engine;
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");

    }
}
