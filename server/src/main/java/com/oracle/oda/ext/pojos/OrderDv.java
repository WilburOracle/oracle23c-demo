package com.oracle.oda.ext.pojos;

import lombok.Data;

import java.util.List;

@Data
public class OrderDv extends CustomerOrder{

    private List<OnlineOrder> items;
}
