package Spotify.model;

public class Music {


    private String name;

    private int duration;

    private boolean parentalControl;

    public Music() {}

    public Music(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void setParentalControl(boolean parentalControl) {
        this.parentalControl = parentalControl;
    }

    public boolean getParentalControl (){
        return parentalControl;
    }
}
