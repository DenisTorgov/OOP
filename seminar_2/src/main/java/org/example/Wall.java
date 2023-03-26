package org.example;
import org.example.BaseClass;
public class Wall implements Barrier{
    @Override
    public void GoThrough() {
//        BaseClass.Jump();
        System.out.println("Must jump");
    }
}
