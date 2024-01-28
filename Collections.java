/*
 * 	COLLECTION
	-----------
	(i) 	Collection represents a single unit of objects (ie) group of objects.
	(ii)	It's an interface.
	(iii)	It's supports dissimilar dataTypes.
	(iv)	No memory wastage like an array.
	(v)		It doesn't have any fixed length.

	Parent of collection: Iterable
	---------------------
	Parent of all the interface: Search context
	---------------------------
	Parent of all classes: Object
	----------------------
	
	TYPES:
	------
	(i)	 	List =====>>>	(i) Array List		(ii) Linked list
	(ii) 	Set
	(iii)	Queue
	(iv)	Map
	
	LIST:
	-----										
	(i)		It is an interface.
	(ii)	It is index based.
	(iii)	It will allow duplicate Values.
	(iv)	Its prints insertion Order.
	
	LIST METHODS:
	-------------
	(i)add()		(ii)remove()	(iii)retainAll()
   	(iv)size()		(v)indexOf()	(vi)removeAll()
  	(vii)get()	   	(vii)contains()	(viii)clear()
  	(ix)set()       (x)addAll()
  	
	SYNTAX:
	-------
	List <Wrapper class> ref.name = new Arraylist <Wrapper class>();
 */

 

 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.LinkedHashMap;
 import java.util.LinkedHashSet;
 import java.util.LinkedList;
 import java.util.Map;
 import java.util.Map.Entry;
 import java.util.PriorityQueue;
 import java.util.Queue;
 import java.util.Set;
 import java.util.TreeSet;
 
 public class Collections {
     private void arrayList() {
         ArrayList<Integer> l = new ArrayList<Integer>();
         l.add(10);
         l.add(20);
         l.add(25);
         l.add(30);
         l.add(35);
         l.add(40);
 
         l.add(2, 100);
         System.out.println(l);
 
         int size = l.size();
         System.out.println(size);
 
         for (Integer integer : l) {
             System.out.println(integer);
 
         }
 
         Integer integer = l.get(2);
         System.out.println(integer);
 
         int lastIndexOf = l.lastIndexOf(40);
         System.out.println(lastIndexOf);
 
         boolean contains = l.contains(35);
         System.out.println(contains);
 
     }
 
     private void queue() {
         Queue<Integer> q = new LinkedList<>();
         PriorityQueue<Integer> r = new PriorityQueue<>();
 
         q.add(19);
         r.add(34);
         q.add(10);
         r.add(90);
         q.add(20);
         r.add(67);
         q.add(25);
         r.add(78);
         q.add(30);
         r.add(87);
         q.add(35);
         r.add(86);
         q.add(40);
 
         System.out.println("Head is " + q.peek());
         System.out.println("Removed " + q.remove());
         System.out.println("poll " + q.poll());
         System.out.println("Head is " + q.peek());
 
         System.out.println("Head is " + r.peek());
         System.out.println("Removed " + r.remove());
         System.out.println("poll " + r.poll());
         System.out.println("Head is " + r.peek());
 
         /*
           Set:
           ---- 
           (i) Set is an interface. 
           (ii) It doesn't have any specific order.
           (iii) It doesn't allow duplicate value. 
           (iv) It's value based.
           
           SYNTAX: 
           -------- 
           set<wrapper class> ref.name = new TypesOfSet<Wrapperclass>();
           
           Types:
          ------ (i) Hash (ii) Linked Hash set(I) (iii) Tree set(A)
           
           
           (i) Hash set: 
           --------------
           
           (i) It prints/stores random Order. 
           (ii) It willn't allow reduntancy (or) Duplicate value. 
           (iii) It will allow Single null value. 
           (iv) It willn't allow duplicate null value.
           
           SYNTAX: 
           ------- 
           Hashset<wrapper class> ref.name = Hashset<Wrapper class>();
           
           (ii) Linked Hash set: 
           ----------------------- 
           (i) It prints in insertion order. 
           (ii) It will allow Single null value. 
           (iii) It willn't allow duplicate null value.
           
           SYNTAX: 
           ------- 
           LinkedHashSet<wrapper class> ref.name = new LinkedHashSet<Wrapper class>();
           
           (iii) TreeSet: 
           --------------- 
           (i) It prints Assending order. 
           (ii) It willnot allow even single null value.
           
           SYNTAX: 
           -------- 
           Treeset<wrapper class> ref.name = TreeSet<Wrapper class>();
           
          */
     }
 
     private void Hashset() {
         //HashSet<String> l1 = new HashSet<String>();
 
         LinkedHashSet <String> listOfString = new LinkedHashSet <String>();
 
         TreeSet<String> l11 = new TreeSet<String>();
 
         listOfString.add("Vijay");
         listOfString.add("Ajith");
         listOfString.add("Surya");
         listOfString.add("Ashif");
         listOfString.add("Cuba");
         listOfString.add("Vijay");
 
         l11.add("Vijay");
         l11.add("Ajith");
         l11.add("Surya");
         l11.add("Ashif");
         l11.add("Cuba");
         l11.add("Vijay");
         System.out.println(l11);
         System.out.println(l11.hashCode());
 
     }
 
     public void map() {
         /*
           Map: 
           ----
          (i) Map is a key and value pair. 
          (ii) key+value = one entry.
           
           Key: 
           (i) It willn't allow duplicate. 
           (ii) It can be Override. 
           (iii) It will allow Override null [Duplicate]
           
          Value: 
          (i) The value will allow duplicate. 
          (ii) The value will allow the both null.
           
           TYPES: 
           (i) HashMap(Randomized order) 
           (ii) Linked HashMap(Insertion Order)
           (iii) TreeMap(Assending order) 
           (iv) Concurrent HashMap(Randomized Order)
           
          SYNTAX: 
          -------
          Map<Integer,String> ref.name = new TypeOfMap<Integer,String>();
          
          */
         Map<Integer, String> m = new LinkedHashMap<Integer, String>();
         m.put(10, "Vijay");
         m.put(20, "Kicha");
         m.put(30, "Saranraj");
         m.put(40, "asdfghjkl");
         m.put(67, "zxcvbnm");
 
         int size = m.size();
         System.out.println(size);
 
         String string = m.get(30);
         System.out.println(string);
 
         Set<Integer> keySet = m.keySet();
         System.out.println(keySet);
 
         Collection<String> values = m.values();
         System.out.println(values);
 
         boolean containsKey = m.containsKey(20);
         System.out.println(containsKey);
 
         boolean containsValue = m.containsValue("asdfg");
         System.out.println(containsValue);
 
         Set<Entry<Integer, String>> entrySet = m.entrySet();
         System.out.println(entrySet);
 
         for (Entry<Integer, String> entry2 : entrySet) {
             System.out.println(entry2);
 
             System.out.println(entry2.getKey());
             System.out.println(entry2.getValue());
 
         }
 
     }
 
     public static void main(String[] args) {
         Collections f = new Collections();
 
         f.arrayList();
         f.queue();
         f.Hashset();
         f.map();
 
     }
 
 }
 