package ch08.sec04;


import ch08.sec05.RemoteControl;

public class Television implements ch08.sec05.RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > ch08.sec05.RemoteControl.MAX_VOLUME) {
            this.volume = ch08.sec05.RemoteControl.MAX_VOLUME;
        } else if (volume < ch08.sec05.RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
