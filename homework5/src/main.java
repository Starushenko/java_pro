public class main {
    public static void main(String[] args) {
        FileData fileData = new FileData("java",10,"/path/to/file");
        FileData fileData1 = new FileData("cat",20,"work/path/to/file");
        FileData fileData2 = new FileData("dog",12,"/path/to/file/work");
        FileData fileData3 = new FileData("hillel",7,"/path/to/file/work");
        FileNavigator fileNavigator = new FileNavigator();

        fileNavigator.add(fileData);
        fileNavigator.add(fileData1);
        fileNavigator.add(fileData2);
        fileNavigator.add(fileData3);


        fileNavigator.find("/path/to/file/work");
        fileNavigator.find("/path/to/file");
        fileNavigator.find("/path/to/");

        fileNavigator.filterBySize(10);

        fileNavigator.remove("/path/to/file");
        fileNavigator.find("/path/to/file");
        fileNavigator.remove("/path/to/");

        fileNavigator.sortBySize();



    }
}
