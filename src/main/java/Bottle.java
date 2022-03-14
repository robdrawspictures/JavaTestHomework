public class Bottle {

    public int volume;

    public Bottle(){
        this.volume = 100;
    }

    public void takeDrink(){
        volume -= 10;
    }

    public void emptyBottle(){
        volume = 0;
    }

    public void fillBottle(int amount){
        if(amount > 100){
            volume = 100;
        } else {
            volume += amount;
        }
    }
}
