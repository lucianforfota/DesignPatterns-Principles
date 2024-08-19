package solidempty.videostorekata.refactoredv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();


    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }


    public String createHeader(){
        return "Rental Record for " + this.name + "\n";
    }

    public String createBody() {
        String body = "";
        for (Rental rental : rentals) {
            double thisAmount = rental.getRentalPrice();
            body += "\t" + rental.getMovie().getTitle() + "\t"
                    + String.valueOf(thisAmount) + "\n";

        }
        return body;
    }

    public String createFooter(double totalAmount, int frequentRenterPoints){
        String footer = "You owed " + String.valueOf(totalAmount) + "\n";
        footer += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";
        return footer;
    }

    public String statement() {
        Double totalAmount = rentals.stream()
                .map(rental -> rental.getRentalPrice())
                .reduce((sum, price)-> sum+price).get();

        int frequentRenterPoints = rentals.stream()
                .map(rental -> rental.getFrequentRentalPoints())
                .reduce((sum, points)-> sum+points).get();

        String statementString = createHeader();
        statementString+=createBody();

        statementString+=createFooter(totalAmount, frequentRenterPoints);
        return statementString;
    }
}
