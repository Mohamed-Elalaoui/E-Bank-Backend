package ma.emsi.ebankbackend.repositories;

import ma.emsi.ebankbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
