package six;

import java.util.LinkedList;
import java.util.List;

public class HistoryList {
private LinkedList<List<String>> history;

public HistoryList() {
    this.history = new LinkedList<>();
}

public void addNewList(List<String> newList) {
    List<String> copy = new LinkedList<>(newList);
    this.history.addFirst(copy);
}

public static void main(String[] args) {
    List<String> oldList = List.of("item1", "item2", "item3");
    List<String> newList = List.of("item1", "item2", "item3", "item4");
    HistoryList historyList = new HistoryList();
    historyList.addNewList(oldList);
    historyList.addNewList(newList);
    System.out.println(historyList.history);
}
}