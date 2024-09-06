package co.edu.uptc.models;

import java.util.Comparator;
import java.util.List;

import co.edu.uptc.pojos.Person;

public class MySort {

    private List<Person> personList;

    public List<Person> sort(SimpleList<Person> list, Comparator<Person> comparator) {
        personList = list;
        int iterations = personList.size()-1;    
        int index = 0;
        int aux = personList.size()-1;
        while (index!=iterations) {
            int temp=1;
            //System.out.println("Iteracion: " + (index+1));
            for (int i = 0; i < aux; i++) {
                //para apreciar como compara comente el if
                //System.out.println("Comparando: " + personList.get(index).getName() + " con " + personList.get(index+temp).getName());
                if (comparator.compare(personList.get(index), personList.get(index+temp))>0) {
                    Person auxPerson = personList.get(index);
                    personList.set(index, personList.get(index+temp));
                    personList.set(index+temp, auxPerson);
                }
                temp++;
            }
            aux--;
            index++;
        }
        return personList;
    }

    // public int getIterations() {
    //     int size = personList.size();
    //     int aux = 3;
    //     int cont = aux;
    //     int aux2 = 1;
    //     int i = 0;
    //     while (cont <= size) {
    //         cont++;
    //         aux2++;
    //         if (i != 0) {
    //             aux += aux2;
    //         }
    //         i++;
    //     }
    //     return aux;
    // }
}
