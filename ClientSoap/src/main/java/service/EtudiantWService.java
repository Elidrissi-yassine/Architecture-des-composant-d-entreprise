package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import model.Genre;
import model.Student;

import java.util.List;

@WebService(serviceName = "ServiceWeb")
public class EtudiantWService {
    @WebMethod(operationName = "Etudients_list")
    public List<Student>listEtudiants(){
        return List.of(
                new Student(1,"ET_Nom1","ET_Prénom1", Genre.Homme),
                new Student(2 ,"ET_Nom2","ET_Prénom2", Genre.Femme),
                new Student(3 ,"ET_Nom3","ET_Prénom3", Genre.Homme)
        );
    }
}