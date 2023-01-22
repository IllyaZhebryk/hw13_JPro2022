import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FileNavigator {

    private final Map<String, Set<FileData>> filesMap = new HashMap<>();

    public void add(FileData fileData) {
        String filePath = fileData.getFilePath();
        if (filesMap.containsKey(filePath)) {
            filesMap.get(filePath).add(fileData);
        } else {
            Set<FileData> files = new HashSet<>();
            files.add(fileData);
            filesMap.put(filePath, files);
        }
    }

    public Set<FileData> find(String path) {
        return filesMap.get(path);
    }

    public Set<FileData> filterBySize(int size) {
        return filesMap.entrySet().stream()
                .flatMap(filesMap -> filesMap.getValue().stream())
                .filter(fileData -> fileData.getSize() <= size)
                .collect(Collectors.toSet());
    }

    public void remove(String path) {
        filesMap.remove(path);
    }
}

