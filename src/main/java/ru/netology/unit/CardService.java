package ru.netology.unit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class CardService {
    private final List<PurchaseItem> items = new ArrayList<>();

    public void add(PurchaseItem item) {
        items.add(item);
    }

    public List<PurchaseItem> sortedBy(Comparator<PurchaseItem> comparator) {
        List<PurchaseItem> result = new LinkedList<>(items);
        result.sort(comparator);
        return result;
    }

//    public void removeByItemId(int itemId){
//        items.removeIf(new Predicate<PurchaseItem>() {
//            @Override
//            public boolean test(PurchaseItem purchaseItem) {
//                return false;
//            }
//        });
//    }

    public void removeByItemId(int itemId) {
        items.removeIf(o -> o.getItemId() == itemId);
    }

    public void changeCount(int itemId, int count) {
throw new UnsupportedOperationException();
    }

}
