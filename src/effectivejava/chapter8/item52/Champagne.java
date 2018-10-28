package effectivejava.chapter8.item52;

// 메서드 재정의를 이용한 분류 (313쪽, 코드 52-2의 일부)
class Champagne extends SparklingWine {
    @Override String name() { return "샴페인"; }
}
