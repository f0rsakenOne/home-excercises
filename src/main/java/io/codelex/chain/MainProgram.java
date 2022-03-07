package io.codelex.chain;

public class MainProgram {
    public static  void main(String[] args){
        Link l1 = new Link("Johny");
        Link l2 = new Link("Jonathan");
        Link l3 = new Link("Jolyne");
        Link l4 = new Link("Joseph");
        Link l5 = new Link("Josuke");
        Link l6 = new Link("Jotaro");
        Link l7 = new Link("Giorno");

//        l1.setNextLink(l2);
//        l2.setNextLink(l3);
//        l3.setNextLink(l4);
//        l4.setNextLink(l5);
//        l5.setNextLink(l6);
//        l6.setNextLink(l7);
        Chain chain = new Chain(l1);
        chain.addLink(l2);
        chain.addLink(l3);
        chain.addLink(l4);
        chain.addLink(l5);
        chain.addLink(l6);
        chain.addLink(l7);

        chain.printOut();
    }
}
