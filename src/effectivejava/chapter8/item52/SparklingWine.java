package effectivejava.chapter8.item52;

// 메서드 재정의를 이용한 분류 (313쪽)
class SparklingWine extends Wine {
    @Override String name() { return "발포성 포도주"; }
}
