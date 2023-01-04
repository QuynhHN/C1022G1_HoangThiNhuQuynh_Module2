package service;

import controller.CongNhan;

public interface ICongNhanService {
    void display();
    void add(CongNhan congNhan);

    void add(String id, String name, String email, String address);
    void findName(String name);
}
