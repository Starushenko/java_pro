public class FileData implements Comparable<FileData>{
    private String fileName;
    private int size;
    private String directory;

    public FileData(String fileName, int size, String directory) {
        this.fileName = fileName;
        this.size = size;
        this.directory = directory;
    }


    public String getFileName() {
        return fileName;
    }

    public int getSize() {
        return size;
    }
    public String getDirectory() {
        return directory;
    }

    @Override
    public String toString() {
        return "\nFileData = {" +
                "fileName='" + fileName + '\'' +
                ", size=" + size +
                ", directory='" + directory + '\'' +
                "}";
    }

    @Override
    public int compareTo(FileData o) {
        return this.size - o.size;
    }
}
