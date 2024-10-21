package tienda;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));
        
        store.addProduct(new Accessory("Mouse", 25.0));
        store.addProduct(new Accessory("Keyboard", 40.0));
        
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        System.out.println("Aplicando descuento del 10%:");
        store.applyDiscount(tenPercentDiscount);
        
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        System.out.println("Aplicando descuento fijo de $50:");
        store.applyDiscount(fiftyDollarsDiscount);
        
        Discountable fifteenPercentDiscountForElectronics = product -> {
            if (product instanceof Electronic) {
                return product.getPrice() * 0.85;
            }
            return product.getPrice(); 
        };
        System.out.println("Aplicando descuento del 15% a productos electrónicos:");
        store.applyDiscount(fifteenPercentDiscountForElectronics);
        
        Discountable combinedDiscount = product -> {
            double discountedPrice = product.getPrice() - 10.0; 
            return discountedPrice * 0.95; 
        };
        System.out.println("Aplicando descuentode $10 y 5%:");
        store.applyDiscount(combinedDiscount);
    }
}
