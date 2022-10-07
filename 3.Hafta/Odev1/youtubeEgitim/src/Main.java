public class Main {

    public static void main(String[] args) {
     /*   CreditManager creditManager = new CreditManager();
        creditManager.calculate();

        Customer customer = new Customer(); //instance(örneğini) oluşturmak,heap te referans numarasını oluşturmak
        customer.id =1;
        customer.city = "Kocaeli";


        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.taxNumber ="100000";
        company.companyName = "Kocaeli Üniversitesi";
        company.id = 100;

        CustomerManager customerManager1 = new CustomerManager(new Person());



        Person person = new Person();
        person.nationalıdentity ="12345";
        person.firstName = "Meryem";
        person.lastName ="Ertürk";*/

        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();



    }
}
