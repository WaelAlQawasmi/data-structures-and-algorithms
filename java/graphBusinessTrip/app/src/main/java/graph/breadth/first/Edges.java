package graph.breadth.first;

public class Edges {


        private int weight;
        private Vertex destVertex;

        public Edges(Vertex dest, int wweight){
            this.destVertex = dest;
            this.weight = weight;
        }



        public int getWeight(){
            return weight;
        }

        public Vertex getDestVertex(){
            return destVertex;
        }

}
