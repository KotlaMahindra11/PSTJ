import java.util.*;
import java.util.function.Predicate;

public class Task8SmartCityRoute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.computeIfAbsent(u, key -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, key -> new ArrayList<>()).add(u);
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            graph.getOrDefault(current, Collections.emptyList())
                 .stream()
                 .filter(node -> !visited.contains(node))
                 .forEach(node -> {
                     visited.add(node);
                     queue.add(node);
                 });
        }

        Predicate<Integer> routeExists = visited::contains;

        System.out.println(routeExists.test(destination) ? "YES" : "NO");

        sc.close();
    }
}