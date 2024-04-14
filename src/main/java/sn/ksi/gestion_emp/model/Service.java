package sn.ksi.gestion_emp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Service {
    private int id;
    private String Code;
    private String nom;

    public Service(int id, String code, String nom) {
        this.id = id;
        Code = code;
        this.nom = nom;
    }

}
