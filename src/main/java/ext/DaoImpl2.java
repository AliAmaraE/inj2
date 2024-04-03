package ext;

import dao.Idao;

public class DaoImpl2 implements Idao {
    @Override
    public double getData() {
        System.out.println("v c");
        double temp=6000;
        return temp;
    }
}
