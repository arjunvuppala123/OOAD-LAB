import java.util.Stack;

public class CardStack {
    private Stack<Card> cards;
    private int size;
    private int top;

    public CardStack(int i) {
        cards = new Stack<Card>();
        size = i;
        top = -1;
    }
    public void push(Card card) {
        if(top<size) {
            cards.push(card);
            top++;
        }
        else{
            System.out.println("Stack is full");
        }
    }  
    public Card pop() {
        if (top>0){
            top--;
            return cards.pop();
        }
        else{
            System.out.println("Stack is empty");
            return null;
        }
    }
    public Card peek() {
        if (top >0) {
            return cards.peek();
        }
        return null;
    }
}