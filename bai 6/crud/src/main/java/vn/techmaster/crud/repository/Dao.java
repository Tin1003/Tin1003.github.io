package vn.techmaster.crud.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Dao <T> {
    protected List<T> collections = new ArrayList<>();
    public abstract List<T> getAll();
    public abstract Optional <T> get(int id);
    public abstract void add(T t);
    public abstract void update(T t);
    public abstract void deleteByID(int id);
    public abstract void delete (T t);
    public abstract void readCSV(String csvFile);
    public abstract List<T> searchByKeyword(String keyword);
}
