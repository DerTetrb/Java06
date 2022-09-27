package package1;

import java.lang.reflect.Array;
import java.util.*;

public class ListDemo {
    public static List<Human> getNamesakes(List<Human> humans, Human person){
        if(person == null || humans == null) throw new IllegalArgumentException("unfaithful data");
        List<Human> result = new ArrayList<>();
        for(Human t: humans){
            if(person.getLastName().equals(t.getLastName())){
                result.add(t);
            }
        }
        return result;
    }

    public static List<Human> copyListNotHuman(ArrayList<Human> humans, Human person){
        ArrayList<Human> result = (ArrayList<Human>) humans.clone();
        for(Human t: humans){
            if(t.equals(person)){
                result.remove(t);
            }
        }
        return result;
    }

    public static List<Set<Integer>> getListSetWithoutSet (List<Set<Integer>> arr, Set<Integer> set){
        int flag = 0;
        List<Set<Integer>> result = new ArrayList<>();
        for(Set<Integer> temp : arr){
            for(Integer t : temp){
                if(set.contains(t)){
                    flag++;
                }

            }
            if(flag == 0){
                result.add(temp);
            }
            flag = 0;
        }
        return result;

    }
    public static Set<Human> getMaxAgeHuman(List<? extends Human> humans){
        int maxAge = 0;
        Set<Human> result = new LinkedHashSet<>();
        for(Human t : humans){
            if(maxAge < t.getAge()){
                maxAge = t.getAge();
            }
        }
        for(Human t : humans){
            if(t.getAge() == maxAge){
                result.add(t);
            }
        }
        return result;

    }
    public static Set<Human> getSetHuman(Map<Integer, Human> Map, Set<Integer> set) {
        Set<Human> result = new HashSet<>();
        Human v = null;
        for (int k : set) {
            v = Map.get(k);
            if (v != null) {
                result.add(v);
            }
        }
        return result;
    }

    public static List<Integer> getListHumanMore18 (Map<Integer, Human> humanMap) {
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Human> map: humanMap.entrySet()) {
            if (map.getValue().getAge() >= 18) {
                result.add(map.getKey());
            }
        }
        return result;
    }

    public static Map<Integer, Integer> ageMap(Map<Integer, Human> humanMap) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, Human> map: humanMap.entrySet()) {
            result.put(map.getKey(), map.getValue().getAge());
        }
        return result;
    }

    public static Map<Integer, List<Human>> mapIntegerListHuman(Set<Human> humanSet) {
        Map<Integer, List<Human>> result = new HashMap<>();
        Set<Integer> ageSet= new HashSet<>();

        for (Human human: humanSet) {
            ageSet.add(human.getAge());
        }
        for (int age: ageSet) {
            List<Human> humanArrayList = new ArrayList<>();
            for (Human human: humanSet) {
                if (human.getAge() == age) {
                    humanArrayList.add(human);
                }
            }
            result.put(age, humanArrayList);
        }
        return result;
    }
}
