package ext;

import dao.Idao;

public class DaoImplVWS implements Idao {
    @Override
    public double getData(){
        System.out.println("version web service");
        return 90;
    }
}
