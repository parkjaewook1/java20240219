package ch08.exercise.Exercise07;

public class DaoExample {
    public static void dbwork(DataAccessObject dataAccessObject) {
//
//        dao.select();
//        dao.insert();
//        dao.update();
//        dao.delete();

    }

    public static void main(String[] args) {
        dbwork(new OracleDao());
        dbwork(new MySqlDao());

    }
}
