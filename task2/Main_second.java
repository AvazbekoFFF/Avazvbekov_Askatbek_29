package kz.attractor.java;

import java.util.ArrayList;
import java.util.List;

public class Main_second {

    public static void main(String[] args) {
        List<ActiveCat> list = new ArrayList<>();
        list.add(new ActiveCat(ActiveCat :: jump));
        list.add(new ActiveCat(ActiveCat::eat));
        list.add(new ActiveCat(ActiveCat :: sleep));
        list.add(new ActiveCat(() -> "Я прячусь."));
        list.add(new ActiveCat(() -> "Я играю."));
        list.forEach(ActiveCat::doAction);
    }


}
