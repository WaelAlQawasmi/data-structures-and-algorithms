package stack.queue.animal.shelter;

public class AnimalShelter {
Queue cate=new Queue();
    Queue doge=new Queue();
     public void enqueue(animal animalName){
         if (animalName.getName()=="cat"){
             cate.enqueue(animalName);
         }
         if (animalName.getName()=="dog"){
             doge.enqueue(animalName);
         }

     }
    public String dequeue(String pref){
         if(pref=="cat")
         { cate.dequeue();
         return pref;}
        else if(pref=="dog")
         { doge.dequeue();
             return pref;}
        else
         return null;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "cate=" + cate.toString() +
                ", doge=" + doge +
                '}';
    }
}
