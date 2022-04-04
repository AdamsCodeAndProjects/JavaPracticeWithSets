public class Challenge {
    /**
    When overriding the equals() method in the HevenlyBody class, we
    were careful to make sure that it would not return true if a HeavenlyBody
            was comapred to a subclass of itself.

     We did that to demonstrate that method, but it was actually unnecessary in
     the HeavenlyBody class.

     Why was it unnecessary?

     The HeavenlyBody class is declared final, so it cannot be subclassed.  The Java String
     class is also final, which is why it can safely use the instanceof method without having to
     worry about comparisons with a subclass

     **/
}
