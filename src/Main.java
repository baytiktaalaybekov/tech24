import org.w3c.dom.DOMStringList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//    1.
//    LinkedList тизменин
//    биринчи элементин
//    алуу үчүн
//    Java программасын
//    жазыңыз .

//    LinkedList<String> list = new LinkedList<>();
//    list.add("q");
//    list.add("w");
//    list.add("s");
//        System.out.println(list.get(0));


//
//2.
//    LinkedList тизменин
//    акыркы элементин
//    алуу үчүн
//    Java программасын
//    жазыңыз .

//        LinkedList <Integer> list2 = new LinkedList<>(Arrays.asList(
//                1,234,3432,234
//        ));
//        System.out.println(list2.getLast());


//
//3.
//    LinkedList тизмеде
//    белгилүү бир
//    элемент бар
//    же жок
//    экенин текшерүү
//    үчүн Java
//    программасын жаз.

//        LinkedList <Integer> list3 = new LinkedList<>();
//        list3.add(1);
//        list3.add(4);
//        list3.add(6);
//        list3.add(2);
//        System.out.println(list3.contains(4));

//
//            4.
//    LinkedList тизмени
//    массивдердин тизмесине
//    которуу үчүн
//    Java программасын
//    жазыңыз .

//     LinkedList <String> list4 = new LinkedList<>();
//        list4.add("smith");
//        list4.add("smih");
//        list4.add("smth");
//        LinkedList<String> list5 = new LinkedList<>();
//        list4.add("smh");
//        list4.add("sith");
//        list4.add("mith");
//        list4.addAll(list5);
//        System.out.println(list4);
//        System.out.println(list5);

//5.
//    Эки LinkedList
//    тизмесин салыштыруу
//    үчүн Java
//    программасын жазыңыз.

//        LinkedList <Integer> list5 = new LinkedList<>(Arrays.asList(2,4,5,6));
//        LinkedList <Integer> listt5 = new LinkedList<>(Arrays.asList(2,4,5,6,6));
//        System.out.println(list5.equals(listt5));


//
//            6.
//    LinkedList тизме
//    бош же
//    жок экенин
//    текшерүү үчүн
//    Java программасын
//    жазыңыз .

//        LinkedList <Integer> list6 = new LinkedList<>();
//        list6.add(1);
//        list6.add(3);
//        list6.add(5);
//        System.out.println(list6.isEmpty());
//
//7.
//    LinkedList тизмедеги
//    элементти алмаштыруу
//    үчүн Java
//    программасын жазыңыз.

//        LinkedList <Integer> list7 = new LinkedList<>();
//        list7.add(4);
//        list7.add(1);
//        list7.add(3);
//        list7.add(5);
//        list7.set(1,6);
//        System.out.println(list7);
//
//    __________________________________________________________________________________________
//
//    Java Collection:
//    HashSet Exercises[12көнүгүү]
//
//    The Hash
//    Set:[
//            new
//
//    BankAccount("OPTIMA","41692222""7000")
//           new
//
//    BankAccount("KYRGYZSTAN","41691111""5000")
//           new
//
//    BankAccount("DEMIR","41693333""9000")
//           new
//
//    BankAccount("RSK","41694444""100000")
//]
//        1.
//    Көрсөтүлгөн элементти
//    HashSet топтомунун
//    аягына кошуу
//    үчүн Java
//    программасын жазыңыз.

//         Set<Bankaccount> sets=new HashSet<>(Arrays.asList(
//                 new Bankaccount("OPTIMA","41692222","7000"),
//                 new Bankaccount("KYRGYZSTAN","41691111","5000"),
//                 new Bankaccount("DEMIR","41693333","9000"),
//                 new Bankaccount("RSK","41694444","100000")));
//         Set <Bankaccount> set= new HashSet<>();
//         set.addAll(sets);
//        System.out.println(set);

//
//            2.
//    HashSet тизмедеги
//    бардык элементтерди
//    кайталоо үчүн
//    Java программасын
//    жазыңыз .
//
//        Set <Integer> integerSet = new HashSet<>();
//        integerSet.add(1);
//        integerSet.add(4);
//        integerSet.add(5);
//        integerSet.add(3);
//        Iterator <Integer> iterator = integerSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//3
//    HashSet топтомундагы
//    элементтердин санын
//    алуу үчүн
//    Java программасын
//    жазыңыз .

//        Set <Integer> sets = new HashSet<>();
//        sets.add(1);
//        sets.add(5);
//        sets.add(10);
//        System.out.println(sets.size());
//
//4.
//    HashSet топтомун
//    бошотуу үчүн
//    Java программасын
//    жазыңыз .

//        Set <Integer> sets = new HashSet<>();
//        sets.add(1);
//        sets.add(5);
//        sets.add(10);
//        sets.clear();
//        System.out.println(sets);
//
//5.
//    HashSet топтомунун
//    бош же
//    жок экенин
//    текшерүү үчүн
//    Java программасын
//    жазыңыз .

//        Set <Integer> sets = new HashSet<>();
//        sets.add(5);
//        sets.add(2);
//        sets.add(1);
//        sets.add(3);
//        System.out.println(sets.isEmpty());


//
//6.
//    HashSet топтомун
//    башка хэш
//    топтомуна клондоо
//    үчүн Java
//    программасын жазыңыз.

//        Set <Integer> sets = new HashSet<>();
//        sets.add(3);
//        sets.add(9);
//        sets.add(0);
//        Set<Integer> set = new HashSet<>();
//        set.addAll(sets);
//        System.out.println(set);

//
//            7.
//    HashSet топтомун
//    массивге айландыруу
//    үчүн Java
//    программасын жазыңыз.

//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(44);
//        hashSet.add(34);
//        hashSet.add(45);
//        hashSet.add(23);
//        System.out.println(hashSet);
//        System.out.println(Arrays.toString(hashSet.toArray()));


//            8.
//    HashSet топтомун
//    трисет топтомуна
//    айландыруу үчүн
//    Java программасын
//    жазыңыз .
//        Set<Integer>set = new HashSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(2);
//        set.add(5);
//        Set<Integer>set1 = new TreeSet<>();
//        System.out.println(set1.addAll(set));


//
//9.
//    HshSet топтомун
//    List/
//    ArrayListке айландыруу
//    үчүн Java
//    программасын жазыңыз.

//        Set<Integer>set = new HashSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(2);
//        set.add(5);
////        System.out.println(set);
//        System.out.println("=========================");
//        LinkedList<Integer>set1 = new LinkedList<>(set);
//        set1.add(7);
//        set1.add(3);
//        set1.add(2);
//        set1.add(1);
//        System.out.println(set1);
//        System.out.println("==============================");
//        ArrayList<Integer>set2 = new ArrayList<>(set1);
//        set2.add(3);
//        set2.add(3);
//        set2.add(3);
//        set2.add(3);
//        System.out.println(set2);

//
//            10.
//    Эки HashSet
//    топтомун салыштыруу
//    үчүн Java
//    программасын жазыңыз.
//
//        Set <Integer> sets = new HashSet<>(Arrays.asList(12,34,56,2));
//        Set <Integer> set = new HashSet<>(Arrays.asList(12,34,56,2,3));
//        System.out.println(sets.equals(set));

//
//            11.
//    Эки топтомду
//    салыштыруу жана
//    эки топтомдо
//    бирдей элементтерди
//    сактоо үчүн
//    Java программасын
//    жазыңыз .
//
//        Set<Integer>set = new HashSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(2);
//        set.add(5);
//        System.out.println(set);
//        Set<Integer>set1 = new HashSet<>();
//        set1.add(2);
//        set1.add(4);
//        set1.add(5);
//        set1.add(3);
//        System.out.println(set1);
//        System.out.println(set.equals(set1));



//
//12.
//    HashSet топтомунан
//    бардык элементтерди
//    алып салуу
//    үчүн Java
////    программасын жазыңыз.
//        Set<Integer>set = new HashSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(2);
//        set.add(5);
//        set.clear();
//        System.out.println(set);

//            _____________________________________________________________________________________________

//    Java Collection:
//    TreeSet Exercises[16көнүгүүлөр]
//
//            1.
//    Жаңы TreeSet
//    топтомун түзүү
//    үчүн Java
//    программасын жазыңыз, бир
//    нече түстөрдү
//    кошуп,
//    TreeSet топтомун
//    басып чыгарыңыз.
//        Set<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(1);
//        set.add(4);
//        System.out.println(set);


//
//            2.
//    TreeSet топтомундагы
//    бардык элементтерди
//    кайталоо үчүн
//    Java программасын
//    жазыңыз .

//        Set<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(1);
//        set.add(4);
//        set.forEach(System.out::println);


//3.
//    Белгиленген TreeSet
//    топтомунун бардык
//    элементтерин башка
//    TreeSet топтомуна
//    кошуу үчүн
//    Java программасын
//    жазыңыз .

//        Set<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(1);
//        System.out.println(set);
//        Set<Integer> set1 = new TreeSet<>();
//        System.out.println(set1.addAll(set));


//4.
//    Берилген TreeSet
//    топтомундагы элементтердин
//    тескери иреттүү
//    көрүнүшүн түзүү
//    үчүн Java
//    программасын жазыңыз.
//
//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(1);
//        set.add(3);
//        set.add(2);
//        System.out.println(set.descendingSet());


//
//            5.
//    TreeSet топтомундагы
//    биринчи жана
//    акыркы элементтерди
//    алуу үчүн
//    Java программасын
//    жазыңыз .

//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        set.add(6);
//        System.out.println(set.first());
//        System.out.println(set.last());
//        System.out.println(set);


//
//6.
//    TreeSet тизмегин
//    башка TreeSet
//
//    топтомуна клондоо(clone) үчүн Java программасын жазыңыз.

//        TreeSet<Integer> set = new TreeSet<>();
//        TreeSet<Integer> set1 = new TreeSet<>(set);
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        set.add(6);
//        System.out.println(set.clone());
//        System.out.println(set);


//
//            7.
//    TreeSet топтомундагы
//    элементтердин санын
//    алуу үчүн
//    Java программасын
//    жазыңыз .

//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        set.add(6);
//        System.out.println(set.size());

//
//8.
//    Эки TreeSet
//    топтомун салыштыруу
//    үчүн Java
//    программасын жаз.

//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        System.out.println(set);
//        TreeSet<Integer> set1 = new TreeSet<>();
//        set1.add(3);
//        set1.add(2);
//        set1.add(7);
//        System.out.println(set1);
//        set.equals(set1) System.out.println();


//
//            9.
//    Tree топтомундагы 7
//    ден аз
//    сандарды табуу
//    үчүн Java
//    программасын жаз.

//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        set.add(4);
//        System.out.println(set.headSet(7));


//
//            10.
//    Берилген элементтен
//    чоң же
//    ага барабар
//    болгон TreeSet
//    жыйындысынын элементин
//    алуу үчүн
//    Java программасын
//    жазыңыз .

//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        set.add(4);
//        System.out.println(set.ceiling(2));


//
//11.
//    Берилген элементтен
//    кичине же
//    ага барабар
//    болгон TreeSet
//    топтомундагы элементти
//    алуу үчүн
//    Java программасын
//    жазыңыз .

//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        set.add(4);
//        System.out.println(set.floor(2));


//
//12.
//    TreeSet топтомунун
//    биринчи элементин
//    алуу жана
//    алып салуу
//    үчүн Java
//    программасын жазыңыз.
//
//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        set.add(4);
//        ArrayList<Integer>list = new ArrayList<>();
//        list.addAll(set);
//        list.get(1);
//        list.remove(1);
//        System.out.println(list);
//

//
//            13.
//    TreeSet топтомунун
//    акыркы элементин
//    алуу жана
//    алып салуу
//    үчүн Java
//    программасын жазыңыз.


//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        set.add(4);
//        LinkedList<Integer>list = new LinkedList<>();
//        list.addAll(set);
//        list.getLast();
//        list.removeLast();
//        System.out.println(list);

//
//            14.
//    Берилген элементти
//    TreeSet жыйындысынан
//    алып салуу
//    үчүн Java
//    программасын жазыңыз.


//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//
//        ArrayList<Integer> sets = new ArrayList<>();
//        sets.addAll(set);
//        set.clear();
//        System.out.println(set);


//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        System.out.println(set.remove(5));
//


//}
    }}







