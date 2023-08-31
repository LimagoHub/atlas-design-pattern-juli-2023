package main;

import de.composite.AbstractNode;
import de.composite.Leaf;
import de.composite.Node;

public class Main {
    public static void main(String[] args) {

        Node root = new Node("Root");

        Node e1 = new Node("e1");
        root.addChild(e1);


        Node e2 = new Node("e2");
        root.addChild(e2);

        Node e1_1 = new Node("e1_1");
        e1.addChild(e1_1);



        Node e1_2 = new Node("e1_2");
        e1.addChild(e1_2);

        Leaf l2_1 = new Leaf("l2_1");

        e2.addChild(l2_1);

        travers(root);
    }

    public static void travers(AbstractNode abstractNode) {
        System.out.println(abstractNode);
        for(AbstractNode child: abstractNode.getChildren()) {
            travers(child);
        }
    }
}