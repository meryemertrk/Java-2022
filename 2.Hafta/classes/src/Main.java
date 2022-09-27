public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);
        //stackte ilk başta sayi1=10, sayi2=20 sayi2=sayi1 olduğu için sayi2=10 oldu,sayi1 de 30 oldu


        //diziler referans tiptir.İki değişken aynı nesneyi tutar
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1; //iki dizi eşitlenmiş oldu( int[] sayilar2 = new int[]{1,2,3};
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }
}

