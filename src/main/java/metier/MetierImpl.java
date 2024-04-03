package metier;

import dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements Imetier {

    private Idao dao;

    public MetierImpl(Idao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    public void setDao(Idao dao){
        this.dao=dao;
    }
}
