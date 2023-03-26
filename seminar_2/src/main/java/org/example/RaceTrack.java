package org.example;
public class RaceTrack implements Barrier {
    protected double speed;
    public RaceTrack (double speed) {
        this.speed = speed;
    }
    @Override
    public void GoThrough(BaseClass a) {
        System.out.println(a);
        if (a.Run() >= speed) {
            System.out.println("Участник " + a.name + " пробежал дорожку со скоросью " + this.speed);
        } else {
            System.out.println("Участник " + a.name + " не смог пробежать дорожку со скоросью " + this.speed);
            System.out.println("Участник " + a.name + " выбывает с соревнования");
            a.active = 0;
        }
    }
}
