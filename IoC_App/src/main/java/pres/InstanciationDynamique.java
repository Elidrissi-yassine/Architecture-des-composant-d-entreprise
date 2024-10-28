package pres;

import dao.ICalcul;
import metier.IGestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InstanciationDynamique {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class classCalcul=Class.forName(daoClassName);
        ICalcul iCalcul=(ICalcul) classCalcul.getConstructor().newInstance();
        System.out.println(iCalcul.getValue());
        String metierClassName=sc.nextLine();
        Class cGestion=Class.forName(metierClassName);
        IGestion gestion=(IGestion)cGestion.getConstructor().newInstance();
        Method m=cGestion.getMethod("setCal",ICalcul.class);
        m.invoke(gestion,iCalcul);
        System.out.println(gestion.calcul());
    }
}
