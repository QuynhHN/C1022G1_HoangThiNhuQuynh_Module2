package repository.impl;

import controller.CongNhan;
import repository.ICongNhanRepository;

import java.util.ArrayList;
import java.util.List;

public class CongNhanRepostory implements ICongNhanRepository {
    private static List<CongNhan> congNhanList = new ArrayList<>();

    @Override
    public void display() {
        display();
    }

    @Override
    public void add(CongNhan congNhan) {
        congNhanList.add(congNhan);
    }

    @Override
    public void findName(String name) {
for (CongNhan congNhan:congNhanList){

}
    }
}
