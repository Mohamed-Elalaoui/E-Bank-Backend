package ma.emsi.ebankbackend.exceptions;

public class CustomerNotFoundException extends Exception { // Création d'une exception non surveillée
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
