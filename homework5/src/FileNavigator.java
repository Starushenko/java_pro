import java.util.*;

public class FileNavigator {
    private final String ROW = "/path/to/file";
    private List<FileData> allFileDataList = new ArrayList<>();

     HashMap<String, List<FileData>> fileDataMap = new HashMap<>();



    public void add(FileData fileData){
        String[] tempArray = fileData.getDirectory().split("/");
        for (int i = 0; i < ROW.split("/").length; i++) {
            if (!tempArray[i].equals(ROW.split("/")[i])){
                System.out.println("you can't modify standard file direction");
               return;
            }
        }
        List<FileData> fileDataList = new ArrayList<>();
        if (fileDataMap.containsKey(fileData.getDirectory())){
            fileDataMap.get(fileData.getDirectory()).add(fileData);
        } else {
            fileDataList.add(fileData);
            fileDataMap.put(fileData.getDirectory(), fileDataList);
        }
        allFileDataList.add(fileData);
        System.out.println("FileData was add");
    }

    public void find(String directory){
        if (fileDataMap.containsKey(directory)){
            System.out.println("\nin this directory we have:"+fileDataMap.get(directory));
            return;
        }
        System.out.println("directory '" + directory + "' does not exit");
    }

    public void filterBySize(int fileSize){
        for (FileData fileDataElement : allFileDataList) {
            if (fileDataElement.getSize() <= fileSize) {
                System.out.println("\nresult of filterBySize:" + fileDataElement +"\n");
            }
        }
    }

    public void remove(String removeDirectory){
        if (fileDataMap.containsKey(removeDirectory)){
            fileDataMap.remove(removeDirectory);
            allFileDataList.removeIf(s -> s.getDirectory().equals(removeDirectory));
            System.out.println("'"+removeDirectory + "' was removed\n");
            return;
        }
        System.out.println("directory '" + removeDirectory + "' can't be removed, because it does not exit\n");

    }

    public void sortBySize(){
        TreeSet<FileData> tempFileDataTreeSet = new TreeSet<>(allFileDataList);
        System.out.println(tempFileDataTreeSet);
        }

}
