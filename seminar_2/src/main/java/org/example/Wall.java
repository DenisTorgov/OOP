package org.example;
public class Wall implements Barrier{
    protected double height;
    public Wall (double height) {
        this.height = height;
    }
    @Override
    public void GoThrough(BaseClass a) {
        System.out.println(a);
        if (a.Jump() >= height) {
            System.out.println("Участник " + a.name + " перепрыгнул стену высотой " + this.height);
        } else {
            System.out.println("Участник " + a.name + " не смог перепрыгнуть стену высотой " + this.height);
            System.out.println("Участник " + a.name + " выбывает с соревнования");
            a.active = 0;
        }
    }
}
