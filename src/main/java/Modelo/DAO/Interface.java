package Modelo.DAO;

public interface Interface<T> {
    void mostrar(int id);

    void create(T t);

    void update(int id);

    void delete(int id);
}
