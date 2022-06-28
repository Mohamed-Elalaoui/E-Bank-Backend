package ma.emsi.ebankbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.ebankbackend.enums.AccountStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// Héritage avec stratégie SINGLE TABLE
@DiscriminatorColumn(name = "TYPE",length = 4)
//Annotation pour spécifier les informations de la colonne TYPE de SINGLE TABLE
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class BankAccount {
    @Id
    private String id;
    private double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING) // afficher le type ENUM sous format string
    private AccountStatus status;
    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "bankAccount",fetch = FetchType.LAZY)
    //LAZY: Hibernate ne va pas charger les operations de ce compte.
    //EAGER: charger la List des opérations de ce compte. Risque de charger beaucoup de données.
    private List<AccountOperation> accountOperations;
}
