package ru.netology.unit;

import lombok.val;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        val item = new PurchaseItem(1,1000,1);
//        System.out.println(item);


        CardService service = new CardService();
        service.add(new PurchaseItem(1, 1000, 1));
        service.add(new PurchaseItem(2, 4000, 4));
        service.add(new PurchaseItem(3, 6000, 1));
        service.add(new PurchaseItem(4, 7000, 9));
        service.add(new PurchaseItem(5, 8000, 1));
        service.add(new PurchaseItem(6, 9000, 10));

//        class LocalPriceAscComparator implements Comparator<PurchaseItem>{
//          Comparator<PurchaseItem> comparator =new Comparator<PurchaseItem>(){
//            @Override
//            public int compare(PurchaseItem o1, PurchaseItem o2) {
//                return o1.getItemPrice() - o2.getItemPrice();
//            }
//        };
//
//        System.out.println(service.sortedBy(comparator));

//        System.out.println(service.sortedBy(
//                new Comparator<PurchaseItem>() {
//                    @Override
//                    public int compare(PurchaseItem o1, PurchaseItem o2) {
//                        return o1.getItemPrice() - o2.getItemPrice();
//                    }
//                }
//        ));


//        System.out.println(service.sortedBy((PurchaseItem o1, PurchaseItem o2) -> {
//            return o1.getItemPrice() - o2.getItemPrice();
//        }));


        System.out.println(service.sortedBy((o1, o2) -> {
            return o1.getItemPrice() - o2.getItemPrice();
        }));


        System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()
        ));


        System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()));


    }
}
