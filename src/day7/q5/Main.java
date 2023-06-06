package day7.q5;

/**
 * @Author Jinxu Zheng
 * @Date 6/6/2023
 **/
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("MicSoft", "intel", 16, 100);
        Computer computer2 = new Computer("Dell", "intel", 16, 100);
        boolean b = computer2.equals(computer);
        System.out.println(computer.hashCode());
        System.out.println(computer2.hashCode());
    }
}
