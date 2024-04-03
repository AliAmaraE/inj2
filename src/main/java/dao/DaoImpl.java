package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements Idao{


    @Override
    public double getData() {
        System.out.println("data dase");
        double temp=Math.random()*40;
        return temp;
    }

}
