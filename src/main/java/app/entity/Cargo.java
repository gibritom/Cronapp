
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela CARGO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CARGO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cargo")
public class Cargo implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "funcionario", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String funcionario;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_cargo_0", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Cargo lider;


    /**
    * Construtor
    * @generated
    */
    public Cargo(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Cargo setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém funcionario
    * return funcionario
    * @generated
    */
    public java.lang.String getFuncionario() {
        return this.funcionario;
    }

    /**
    * Define funcionario
    * @param funcionario funcionario
    * @generated
    */
    public Cargo setFuncionario(java.lang.String funcionario) {
        this.funcionario = funcionario;
        return this;
    }
    /**
    * Obtém lider
    * return lider
    * @generated
    */
    public Cargo getLider() {
        return this.lider;
    }

    /**
    * Define lider
    * @param lider lider
    * @generated
    */
    public Cargo setLider(Cargo lider) {
        this.lider = lider;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Cargo object = (Cargo)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}