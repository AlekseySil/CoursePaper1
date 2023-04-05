public class Id {
    private int id;
    static int counter = 100;

    Id() {
        id = counter++;
    }

    @Override
    public String toString() {
        return "Id{" +
                "id=" + id +
                '}';
    }
}

