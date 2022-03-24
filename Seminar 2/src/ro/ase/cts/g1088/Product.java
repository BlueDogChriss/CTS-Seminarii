package ro.ase.cts.g1088;

public class Product {

        private int id;
        private String name;
        private double price;
        private String description;

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name; //length >=5
        this.price = price; // >=0
        this.description = description; //nu are validare
    }
    public boolean equals(Product product)
    {
        if(product.id != this.id ||
                !product.name.equals(this.name) ||
                product.price != this.price ||
                product.price != product.price ||
                product.description != this.description)
            return false;

        return true;
    }
    //applyPercentageDiscount reduceri(flost discount Percentage)
    //applyAmountDiscount( double discount Amount)
    //increasePricePercentage(float discount Percentage)
    //increasePriceAmount(double discount Amount)
    //+Validari

    //equals(Product product) -> noua forma cu un singur if

    //clase pentru exceptii
    /*
    * 1) PercentageValueException
    * 2) StringMinLength
    * 3) InvalidPriceValueException
    * */


}
