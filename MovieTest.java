public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타";
        m.openday = "2022.12.14";
        m.name = "제이크 설리";
        m.kind = "액션";
        m.runningtime = 192;
        m.age = "12세";
        System.out.println(m.title+"\t"+m.openday+"\t"+m.name+"\t"+m.kind+"\t"+m.runningtime+"\t"+m.age);
    }
}
