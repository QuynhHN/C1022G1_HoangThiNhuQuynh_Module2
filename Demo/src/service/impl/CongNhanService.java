package service.impl;

import controller.CongNhan;
import repository.ICongNhanRepository;
import repository.impl.CongNhanRepostory;
import service.ICongNhanService;

public class CongNhanService implements ICongNhanService {
ICongNhanRepository congNhanRepository=new CongNhanRepostory();
    @Override
    public void display() {
       congNhanRepository.display();
    }

    @Override
    public void add(CongNhan congNhan) {

    }

    @Override
    public void add(String id, String name, String email, String address) {

    }

    @Override
    public void findName(String name) {
congNhanRepository.findName(name);
    }

}
