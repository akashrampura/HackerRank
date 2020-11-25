package com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class AmazonVijay {

   /* public static void deepCopy(Node node){

        Map<Node, Node> map = new HashMap();

        Node head = node;

        while(node!=null){

            Node newNode = new Node(node.val);
            map.put(node, newNode);
            node = node.next;
        }


        for(Node oldNode : map.keySet()){

            Node newNode = oldNode.get(oldNode);
            newNode.next = map.get(oldNode.next);
            newNode.arbitrary = map.get(oldNode.arbitrary);

        }

        return map.get(head);
    }
*/


    public static void main(String[] args) {
        HashMap<String, List<String>> result1 = new  HashMap<String, List<String>>();
        HashMap<String, String> map = new  HashMap<>();
        HashMap<String, Integer> mapCount = new  HashMap<>();

        HashMap<String, List<String>> bookGenres = new HashMap<>();
        bookGenres.put("Horror",new ArrayList<>(Arrays.asList("mass","stress")));
        bookGenres.put("comedy",new ArrayList<>(Arrays.asList("happy")));
        bookGenres.put("romance",new ArrayList<>(Arrays.asList("world","alex","pride")));

        HashMap<String, List<String>> userBooksListenedTo = new HashMap<>();
        userBooksListenedTo.put("fred",new ArrayList<>(Arrays.asList("mass","world","stress")));
        userBooksListenedTo.put("jenny",new ArrayList<>(Arrays.asList("happy")));
        userBooksListenedTo.put("ronne",new ArrayList<>(Arrays.asList("pride","alex")));

        for(Map.Entry<String, List<String>> entry: bookGenres.entrySet()){
            for(String s: entry.getValue()){
                map.put(s,entry.getKey());
                //mapCount.put();
            }
        }
        System.out.println(map);
        System.out.println(userBooksListenedTo);

        HashMap<String, List<String>> m1 = new  HashMap<String, List<String>>();
        for(Map.Entry<String, List<String>> entry: userBooksListenedTo.entrySet()){
            List<String> list = new ArrayList<>();
            for(String book : entry.getValue()){
                if(map.containsKey(book)){
                    list.add(map.get(book));
                }
            }
            Map<String, Long> occurrences = list.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
            System.out.println(occurrences);
            List<String> list2 = new ArrayList<>();
            Long max = 0l;
            for(Map.Entry<String, Long> e: occurrences.entrySet()){
               if(e.getValue()>max){
                   max = e.getValue();
               }

            }
            m1.put(entry.getKey(),list2);
        }
        System.out.println(m1);
/*


        // Soln
        HashMap<String, List<String>> result = new HashMap<>();
        HashMap<String, String> moviesToGenre = new HashMap<>();

        for (String genre : bookGenres.keySet()) {
            List<String> songs = bookGenres.get(genre);
            for (String song : songs) {
                moviesToGenre.put(song, genre);
            }
        }

        Map<String, Map<String, Integer>> userGenreCount = new HashMap<>();

        for (String user : userBooksListenedTo.keySet()) {
            if (!userGenreCount.containsKey(user)) {
                userGenreCount.put(user, new HashMap<>());
            }

            List<String> movies = userBooksListenedTo.get(user);

            for (String movie : movies) {
                String genre = moviesToGenre.get(movie);
                int count = userGenreCount.get(user).getOrDefault(genre, 0) + 1;
                userGenreCount.get(user).put(genre, count);
            }
        }

        for (String user : userGenreCount.keySet()) {
            if (!result.containsKey(user)) {
                result.put(user, new ArrayList<>());
            }

            Map<String, Integer> pair = userGenreCount.get(user);
            int max = 0;

            List<String> favoriteGenre = new ArrayList<>();

            for (String genre : pair.keySet()) {
                if (favoriteGenre.size() == 0) {
                    favoriteGenre.add(genre);
                    max = pair.get(genre);
                } else if (pair.get(genre) > max) {
                    favoriteGenre.clear();
                    favoriteGenre.add(genre);
                    max = pair.get(genre);
                } else if (pair.get(genre) == max)
                    favoriteGenre.add(genre);
            }
            result.put(user, favoriteGenre);
        }

        // return result;
        //HashMap<String, List<String>> result = new HashMap<>();
        //HashMap<String, String> moviesToGenre = new HashMap<>();

        for(String genre : bookGenres.keySet()) {
            List<String> songs = bookGenres.get(genre);
            for(String song : songs) {
                moviesToGenre.put(song, genre);
            }
        }

        Map<String, Map<String, Integer>> usergenrecount = new HashMap<>();
        for(String user : userBooksListenedTo.keySet()) {
            if(!usergenrecount.containsKey(user))
                usergenrecount.put(user, new HashMap<>());
            List<String> songs = userBooksListenedTo.get(user);
            for(String song : songs) {
                String genre = moviesToGenre.get(song);
                int count = usergenrecount.get(user).getOrDefault(genre, 0) + 1;
                usergenrecount.get(user).put(genre, count);
            }
        }

        for(String user : usergenrecount.keySet()) {
            if(!result.containsKey(user))
                result.put(user, new ArrayList<>());
            Map<String, Integer> pair = usergenrecount.get(user);
            int max = 0;
            List<String> favgenre = new ArrayList<>();
            for(String genre : pair.keySet()) {
                if(favgenre.size() == 0) {
                    favgenre.add(genre);
                    max = pair.get(genre);
                } else if(pair.get(genre) > max) {
                    favgenre.clear();
                    favgenre.add(genre);
                    max = pair.get(genre);
                } else if(pair.get(genre) == max)
                    favgenre.add(genre);
            }
            result.put(user, favgenre);
        }
        //return result;

*/



}
}
