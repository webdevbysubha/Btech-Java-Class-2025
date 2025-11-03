interface Player {
    void play();   // abstract method
}

class Child implements Player {
    public void play() {
        System.out.println("The child loves to play outside with friends and have fun.");
    }
}

class Musician implements Player {
    public void play() {
        System.out.println("The musician plays music that touches people’s hearts.");
    }
}

class Actor implements Player {
    public void play() {
        System.out.println("The actor plays different characters to tell amazing stories.");
    }
}

public class UsePlayer {
    public static void main(String[] args) {
        Player c = new Child();
        Player m = new Musician();
        Player a = new Actor();

        c.play();
        m.play();
        a.play();
    }
}
