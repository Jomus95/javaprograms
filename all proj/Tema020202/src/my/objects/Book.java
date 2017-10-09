package my.objects;

/**
 * Задание 2.3
 * Книжка.
 * Из дополнительных методов - возможность *продать* несколько штук.
 * Несколько методов для проверки на наличие.
 */

public class Book {

    private String autor, name;
    private float price;
    private int quantityInStock;

    public Book(String autor, String name, float price, int quantityInStock) {
        this.autor = autor;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public boolean sell(int count) {
        if (quantityInStock > count) {
            quantityInStock -= count;
            return true;
        }
        return false;
    }

    public boolean isInStock(int count) {
        if (quantityInStock >= count) {
            return true;
        }
        return false;
    }

    public boolean isInStock(){
        return isInStock(1);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


}
