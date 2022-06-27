import listExample.ArrayListExample;
import listExample.LinkedListExample;
import mapExample.MapExample;
import queueExample.DeQueExample;
import queueExample.QueueExample;
import setExamples.SetExample;

public class Main {

    public static void main(String[] args) {
        SetExample setExample = new SetExample();

        System.out.println("=== Example HashSet ===");
        setExample.exampleHashSet();
        setExample.exampleHashSetCustomType();
        setExample.exampleTreeSet();
        System.out.println("==== Example Linked HashSet ====");
        setExample.exampleLinkedHashSet();

        System.out.println("==== Example ArrayList ===");
        ArrayListExample arrayListExample = new ArrayListExample();

        System.out.println("=== First example using string ===");
        arrayListExample.firstExampleStringItems();

        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.example1();

        System.out.println("=== Queue Example ===");
        QueueExample queueExample = new QueueExample();
        queueExample.exampleQueue();

        System.out.println("===DeQue Example===");
        DeQueExample dequeExample = new DeQueExample();
        dequeExample.exampleDeQue();

        System.out.println("===Map Example===");
        MapExample mapExample = new MapExample();
        System.out.println("First example");
        mapExample.firstExampleHashMap();

        System.out.println("Second example");
        mapExample.firstExampleHashMap();

        System.out.println("Third example");
        mapExample.thirdExampleHashMap();

        mapExample.fourthExampleTreeMap();

        System.out.println("Fifth example");
        mapExample.fifthExampleUsingLinkedHashMap();

    }


}
