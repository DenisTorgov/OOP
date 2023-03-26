package org.example;
import org.example.BaseClass;
public class RaceTrack implements Barrier {
    @Override
    public void GoThrough(BaseClass a) {
//        BaseClass.Run();
        System.out.println("Must Run " + BaseClass.class.getName());
        a.Run();
    }
}
