import java.util.Objects;

public class FileData {
    private String fileName;
    private int size;
    private String filePath;

    public FileData(String fileName, int size, String filePath) {
        this.fileName = fileName;
        this.size = size;
        this.filePath = filePath;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public int getSize() {
        return size;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FileData fileData = (FileData) o;

        if (size != fileData.size) {
            return false;
        }
        if (!Objects.equals(fileName, fileData.fileName)) {
            return false;
        }
        return Objects.equals(filePath, fileData.filePath);
    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + size;
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", size=" + size +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}

