package effectivejava.chapter2.item8;

// cleaner를 안전망으로 갖춘 잘 작동하는 클라이언트 (45쪽)
public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("안녕~");
        }
    }
}
