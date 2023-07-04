public class Main {
    public static void main(String[] args) {
        
        Shoe[] shoes = new Shoe[4];
        for (int i = 0;i <shoes.length;i++) {
            shoes[i] = new Shoe(40,100 +i *10);
        }
        

      
        Person person = new Person(500, 40);

        
        person.setShoes(shoes);
    }
}