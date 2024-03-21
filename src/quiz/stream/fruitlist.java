package quiz.stream;


import java.util.List;

public class fruitlist {
    public static void main(String[] args) {
        List<fruits> list = List.of(
                new fruits("apple", "red", 3000),
                new fruits("banana", "yellow", 3500),
                new fruits("avocado", "green", 6000)
        );
        list.stream()
                .filter(e -> "yellow".equals(e.getPart()))
                .filter(e -> e.getPrice() >= 3500)
                .map(fruits::getName)
                .sorted()
                .forEach(System.out::println);
    }
}
