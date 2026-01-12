public class Example{
    public static void main(String[] args) {
       User omer =  new User('Omer');
       User bob  = new User('bob');

       omer.addFollowee('bob');

       omer.countMutual(bob);

       Network net = new Network();
       net.getUser('omer');
    
    }
}