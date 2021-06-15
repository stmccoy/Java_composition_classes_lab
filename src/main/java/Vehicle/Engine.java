package Vehicle;

public class Engine {

    private String size;
    private int litres;

    public Engine(String size, int litres){
        this.size = size;
        this.litres = litres;
    }

    public String getSize() {
        return size;
    }

    public int getLitres() {
        return litres;
    }

    public String start(){
        return "Vroom Vroom";
    }

    public String stop(){
        return "Silence";
    }



}
