package package1;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ListDemoTest {

    @Test
    public void getNamesakes() {
        Human person = new Human("Pyotr", "Tchaikovsky", "Ilyich", 53);
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Anatoliy", "Tchaikovsky","", 23));
        humans.add(new Human("Anatoliy", "Tchaikovsky","Ilyich", 34));
        humans.add(new Human("Karl", "Tchaikovsky","Ilyich", 55));
        humans.add(new Human("Karl", "Terman","Ilyich", 55));
        humans.add(new Human("Pyotr", "Terman","Ilyich", 67));
        humans.add(new Human("Pyotr", "Tchaikovsky","Ilyich", 12));

        List<Human> namesakes = new ArrayList<>();
        namesakes = ListDemo.getNamesakes(humans, person);

        humans.remove(3);
        humans.remove(3);
        for(Human t : humans){
            t.print();
        }
        for(Human t : namesakes){
            t.print();
        }

        System.out.println(humans.equals(namesakes));
        assertTrue(humans.equals(namesakes));
    }

    @Test
    public void copyListNotHuman() {
        Human person = new Human("Pyotr", "Tchaikovsky", "Ilyich", 53);
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Anatoliy", "Tchaikovsky","", 23));
        humans.add(new Human("Anatoliy", "Tchaikovsky","Ilyich", 34));
        humans.add(new Human("Karl", "Tchaikovsky","Ilyich", 55));
        humans.add(new Human("Pyotr", "Tchaikovsky", "Ilyich", 53));
        humans.add(new Human("Karl", "Terman","Ilyich", 55));
        humans.add(new Human("Pyotr", "Terman","Ilyich", 67));
        humans.add(new Human("Pyotr", "Tchaikovsky","Ilyich", 12));
        humans.add(new Human("Pyotr", "Tchaikovsky", "Ilyich", 53));

        List<Human> humansNotPerson = new ArrayList<>();
        humansNotPerson = ListDemo.copyListNotHuman(humans, person);

        humans.remove(7);
        humans.remove(3);

        System.out.println(humans.equals(humansNotPerson));
        assertTrue(humans.equals(humansNotPerson));

    }

    @Test
    public void testfunction(){
        Set<Integer> set = new LinkedHashSet<>();
        set.add(4);
        set.add(4);
        set.add(5);
        set.add(6);
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(2);
        set1.add(2);
        set1.add(4);
        set1.add(3);
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        Set<Integer> set3 = new LinkedHashSet<>();
        set3.add(5);
        set3.add(5);
        set3.add(5);
        Set<Integer> set4 = new LinkedHashSet<>();
        set4.add(7);
        set4.add(7);
        set4.add(7);
        ArrayList<Set<Integer>> setlist = new ArrayList<>();
        setlist.add(set1);
        setlist.add(set2);
        setlist.add(set3);
        setlist.add(set4);

        List<Set<Integer>> setlist2 = new ArrayList<>();
        setlist2 = ListDemo.getListSetWithoutSet(setlist, set);

        List<Set<Integer>> setlist1 = new ArrayList<>();
        setlist1.add(set2);
        setlist1.add(set4);

        System.out.println(setlist1.equals(setlist2));
        assertTrue(setlist1.equals(setlist2));
    }

    @Test
    public void testgetMaxAgeHuman(){
        Human human1 = new Human("tr","tr", "tr", 23);
        Human human2 = new Human("tr","tr", "tr", 25);
        Human human3 = new Human("tr","tr", "tr", 63);
        Human human4 = new Human("tr","tr", "tr", 43);
        Human human5 = new Human("tr","tr", "tr", 53);
        Human human6 = new Human("tr","tr", "tr", 63);

        Student student1 = new Student("tr", "tr", "tr", "faculty",63);
        Student student2 = new Student("tr", "tr", "tr", "faculty",63);
        Student student3 = new Student("tr", "tr", "tr", "faculty",63);
        Student student4 = new Student("tr", "tr", "tr", "faculty",63);

        ArrayList<Human> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);
        list.add(human5);
        list.add(human6);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        Set< Human> set1 = new LinkedHashSet<>();
        set1 = ListDemo.getMaxAgeHuman(list);

        Set< Human> set2 = new LinkedHashSet<>();
        set2.add(human3);
        set2.add(human6);
        set2.add(student1);
        set2.add(student2);
        set2.add(student3);
        set2.add(student4);

        System.out.println(set1.equals(set2));
        assertTrue(set1.equals(set2));
    }

    @Test
    public void testgetSetHuman(){
        Human human1 = new Human("tr","tr", "tr", 23);
        Human human2 = new Human("tr","tr", "tr", 25);
        Human human3 = new Human("tr","tr", "tr", 63);
        Human human4 = new Human("tr","tr", "tr", 43);
        Human human5 = new Human("tr","tr", "tr", 53);
        Map<Integer, Human> Map = new HashMap<>();
        Map.putIfAbsent(2, human1);
        Map.putIfAbsent(4, human2);
        Map.putIfAbsent(6, human3);
        Map.putIfAbsent(8, human4);
        Map.putIfAbsent(10, human5);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(8);
        Set<Human> humanSet = new HashSet<>();

        humanSet = ListDemo.getSetHuman(Map, set);

        System.out.println(humanSet);

        Set<Human> setforequals = new HashSet<>();
        setforequals.add(human2);
        setforequals.add(human4);

        System.out.println(humanSet.equals(setforequals));
        assertTrue(humanSet.equals(setforequals));
    }

    @Test
    public void testgetListHumanMore18 (){
        Human human1 = new Human("tr","tr", "tr", 2);
        Human human2 = new Human("tr","tr", "tr", 5);
        Human human3 = new Human("tr","tr", "tr", 63);
        Human human4 = new Human("tr","tr", "tr", 43);
        Human human5 = new Human("tr","tr", "tr", 3);
        Map<Integer, Human> Map = new HashMap<>();
        Map.putIfAbsent(2, human1);
        Map.putIfAbsent(4, human2);
        Map.putIfAbsent(6, human3);
        Map.putIfAbsent(8, human4);
        Map.putIfAbsent(10, human5);

        List<Integer> result = new ArrayList<>();
        result = ListDemo.getListHumanMore18(Map);

        List<Integer> res = new ArrayList<>();
        res.add(6);
        res.add(8);

        System.out.println(result.equals(res));
        assertTrue(result.equals(res));

    }

    @Test
    public void testAgeMap(){
        Human human1 = new Human("tr","tr", "tr", 2);
        Human human2 = new Human("tr","tr", "tr", 5);
        Human human3 = new Human("tr","tr", "tr", 63);
        Human human4 = new Human("tr","tr", "tr", 43);
        Human human5 = new Human("tr","tr", "tr", 3);
        Map<Integer, Human> Map = new HashMap<>();
        Map.putIfAbsent(2, human1);
        Map.putIfAbsent(4, human2);
        Map.putIfAbsent(6, human3);
        Map.putIfAbsent(8, human4);
        Map.putIfAbsent(10, human5);

        Map<Integer, Integer> mapResult = new HashMap<>();
        mapResult = ListDemo.ageMap(Map);

        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(2,2);
        map1.put(4,5);
        map1.put(6,63);
        map1.put(8,43);
        map1.put(10,3);

        System.out.println(map1.equals(mapResult));
        assertTrue(map1.equals(mapResult));
    }

    @Test
    public void testmapIntegerListHuman(){
        Human human1 = new Human("tr1","tr", "tr", 63);
        Human human2 = new Human("tr2","tr", "tr", 5);
        Human human3 = new Human("tr3","tr", "tr", 63);
        Human human4 = new Human("tr4","tr", "tr", 63);
        Human human5 = new Human("tr5","tr", "tr", 5);
        Set<Human> sethuman = new HashSet<>();
        sethuman.add(human1);
        sethuman.add(human2);
        sethuman.add(human3);
        sethuman.add(human4);
        sethuman.add(human5);

        Map<Integer, List<Human>> mapResult;
        mapResult = ListDemo.mapIntegerListHuman(sethuman);

        Map<Integer, List<Human>> map = new HashMap<>();
        List<Human> list1 = new ArrayList<>();
        list1.add(human1);
        list1.add(human4);
        list1.add(human3);

        List<Human> list2 = new ArrayList<>();
        list2.add(human2);
        list2.add(human5);

        map.put(5,list2);
        map.put(63,list1);


        System.out.println(map);
        System.out.println(mapResult);

        System.out.println(map.equals(mapResult));
        assertTrue(map.equals(ListDemo.mapIntegerListHuman(sethuman)));



    }

}