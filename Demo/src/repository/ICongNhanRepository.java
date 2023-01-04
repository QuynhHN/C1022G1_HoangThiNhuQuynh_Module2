package repository;

import controller.CongNhan;

public interface ICongNhanRepository {
    void display();
    void add(CongNhan congNhan);
    void findName(String name);
}
