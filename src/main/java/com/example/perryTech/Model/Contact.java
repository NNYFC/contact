package com.example.perryTech.Model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.validation.annotation.Validated;
/**
 *
 * @author compilerarmelovic
 */

 
@Validated
@Entity
@Table(name = "contact")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Getter
@Setter
public class Contact implements Serializable {
 
    private static final long serialVersionUID = 4048798961366546485L;
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 100,nullable = false)
    private String name;
    
//    @Pattern(regexp ="^\\+?[0-9. ()-]{7,25}$", message = "Phone number")
    @Column(length = 25)
    private String phone;
    
//    @Email(message = "Email Address")
    @Column(length = 100)
    private String email;
    
    @Column(length = 50)
    private String address1;
    
    @Column(length = 50)
    private String address2;
    
    @Column(length = 50)
    private String address3;
    
    @Column(length = 20)
    private String postalCode;
    
    @Column(length = 4000)
    private String note;    
}
    


