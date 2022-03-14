public class Bottle {

    public int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public void takeDrink(){
        volume -= 10;
    }

    public void emptyBottle(){
        volume = 0;
    }

    public void fillBottle(int amount){
        volume += amount;
    }
}
