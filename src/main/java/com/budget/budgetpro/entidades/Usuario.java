package com.budget.budgetpro.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Getter @Setter
    private String id;
    
    @Getter @Setter
    private String nombre;
    
    @Getter @Setter
    private String email;
    
    @Getter @Setter
    private String password;

    public Usuario() {
    }

}
