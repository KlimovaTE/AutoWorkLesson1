package ru.netology.unit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseItem {
    private int itemId;
    private int itemPrice;
    private int count;
}
