public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Car","Toyota",100000,5,"Black");

//        product.setName("Car");
//        product.setId(1);
//        product.setDescription("Toyota");
//        product.setPrice(100000);
//        product.setStockAmount(5);


        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());
        //System.out.println(product.name);
        //productManager.add2(1,"","",2,1000);


    }
}
