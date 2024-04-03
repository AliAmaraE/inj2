package example;

import ext.DaoImpl2;
import metier.MetierImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}