public class main {
    public static void main(String[] args){
        CardStack pile = new CardStack(10);
        Card card = new Card("Spade", "Ace");
        pile.push(card);
        card = new Card("Heart", "Queen");
        pile.push(card);
        System.out.println("Card at top after push operation:");
        System.out.println(pile.peek().getRank() + " "+pile.peek().getSuit());
        card = new Card("Diamonds", "Jack");
        pile.push(card);
        System.out.println("Card at top after push operation:");
        System.out.println(pile.peek().getRank() + " "+pile.peek().getSuit());
        card = new Card("Spade", "King");
        pile.push(card);  
        //prints the top of the stack after the elements were installed
        System.out.println("Card at top before pop operation:");
        System.out.println(pile.peek().getRank() + " "+pile.peek().getSuit());
        card = pile.pop();
        //prints the top of the stack after pop operation
        System.out.println("Card at top after pop operation:");
        System.out.println(pile.peek().getRank() + " "+pile.peek().getSuit());
        //prints top of stack
        System.out.println("Top Card(peek operation):");
        System.out.println(pile.peek().getRank() + " "+pile.peek().getSuit());
    }
}
