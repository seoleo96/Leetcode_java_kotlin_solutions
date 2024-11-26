package leetcode.arrays_hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TestJava {

    static void eat(List<Object> list) {

    }
}

 class DirectorWalk {
    public static int countDoublePraised(String route) {
        Map<Pair, Integer> visited = new HashMap<>();
        int x = 0, y = 0;
        visited.put(new Pair(x, y), 1);

        for (char direction : route.toCharArray()) {
            switch (direction) {
                case 'U':
                    y++;
                    break;
                case 'R':
                    x++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
            }
            visited.put(new Pair(x, y), visited.getOrDefault(new Pair(x, y), 0) + 1);
        }

        int count = 0;
        for (int value : visited.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }

    // Внутренний класс для представления пары координат
    static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        String route = "DRLUU";
        int result = countDoublePraised(route);
        System.out.println(result); // Вывод: 3
    }
}


