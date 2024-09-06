
import co.edu.uptc.models.ComparatorPerson;
import co.edu.uptc.models.MySort;
import co.edu.uptc.models.SimpleList;
import co.edu.uptc.pojos.Person;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleList<Person> list = new SimpleList<>();

        Person person1 = new Person();
        person1.setName("a");
        person1.setLastName("Perez");
        person1.setAge(50);

        Person person2 = new Person();
        person2.setName("b");
        person2.setLastName("Gomez");
        person2.setAge(40);

        Person person3 = new Person();
        person3.setName("c");
        person3.setLastName("Rodriguez");
        person3.setAge(30);

        Person person4 = new Person();  
        person4.setName("d");
        person4.setLastName("Rodriguez");
        person4.setAge(20);

        Person person5 = new Person();
        person5.setName("e");
        person5.setLastName("Rodriguez");
        person5.setAge(10);

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        MySort sort = new MySort();
        sort.sort(list, ComparatorPerson.compAge);
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j).getAge());
        }
    }
}
