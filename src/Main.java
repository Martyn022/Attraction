import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Person> queue = new ArrayDeque<>();
        for (Person e : generateClient()) {
            queue.offer(e);
        }
        System.out.println("Карусель, карусель! Кто успел, тот и сел: ");

        while (!queue.isEmpty()) {
            if (queue.peek().getTicket() > 0) {
                System.out.println((queue.peek()) + " прокатился!))");
                queue.peek().setTicket(queue.peek().getTicket() - 1);
                queue.offer(queue.poll());
            } else {
                System.out.println(queue.poll() + " билеты закончились!(");
            }
        }
        System.out.println("Аттракцион закрывается!((");
    }

    public static List<Person> generateClient() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Филипп", "Воронов", 6));
        list.add(new Person("Георгий", "Власов", 3));
        list.add(new Person("Максим", "Водолажский", 4));
        list.add(new Person("Александр", "Селютин", 1));
        list.add(new Person("Алена", "Загрекова", 3));
        list.add(new Person("Марат", "Шарипов", 2));
        return list;
    }

}