public class Main {

    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(new FileData("test.txt", 5, "N:/"));
        fileNavigator.add(new FileData("test1.txt", 2, "N:/test/"));
        fileNavigator.add(new FileData("test2.txt", 10, "N:/test/"));
        System.out.println(fileNavigator.find("N:/test/"));
        System.out.println(fileNavigator.filterBySize(5));
        fileNavigator.remove("N:/test/");
        System.out.println(fileNavigator.find("N:/test/"));
    }
}

