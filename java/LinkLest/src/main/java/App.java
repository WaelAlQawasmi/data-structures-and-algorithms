public class App {
    public static void main(String[] args) {
      try {
          linkedList<String> newlist = new linkedList();
          newlist.insert("c");
          newlist.insert("b");
          newlist.insert("a");
          System.out.println(newlist.AllItems());
          System.out.println(newlist.includes("t"));
      }
      catch (Exception e){
          System.out.println(" insert error");
      }

    }
}
