package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Graph> nodes, String p) {
      extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Graph> edgeList, String p) {
      extractedMethod(edgeList, p);
      return null;
   }

   void extractedMethod(List<Graph> List, String p) {
	   for (Graph graph : List) {
		   if (graph.contains(p)) {
			   System.out.println(graph);
		   }
	   }
   }
}


class Graph {
	String name;
	public boolean contains(String p) {
		return name.contains(p);
	}
	
}

class Node extends Graph{
}

class Edge extends Graph {
}