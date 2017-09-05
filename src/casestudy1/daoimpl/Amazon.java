package casestudy1.daoimpl;

import casestudy1.beans.Item;
import casestudy1.dao.OnlineShopping;

import java.util.Scanner;

public abstract class Amazon implements OnlineShopping {

    Item[] it;
    Scanner sc = new Scanner(System.in);


    @Override
    public void addItems() {
        System.out.println("How many items would you like to add");
        int noOfItems = sc.nextInt();
        it = new Item[noOfItems];
        System.out.println();
        for (int i = 0; i < noOfItems; i++) {
            Item itm = new Item();
            itm.setId(i);
            System.out.println("Enter details for product/item " + i);
            sc.nextLine();
            System.out.println("please enter item name");
            itm.setName(sc.nextLine());
            System.out.println("please enter item price");
            itm.setPrice(sc.nextDouble());
            System.out.println("please enter item type");
            itm.setType(sc.next());
            it[i] = itm;
        }
    }

    @Override
    public void viewItems() {
        if (it.length > 0) {
            System.out.println("Showing item details\nId\tName\tPrice\tType ");
            for(Item i : it)  {
            System.out.println(i.getId() + "\t" + i.getName() + "\t" +
            i.getPrice() + "\t" + i.getType());
            }
        }
    }

    @Override
    public void searchItemPrice() {
        System.out.println("Search using 1. Id 2. Name\nEnter your choice?");
        if (sc.nextInt() == 1) {
            System.out.println("Enter Id to search");
            searchItem(sc.nextLong());
        } else {
            System.out.println("Enter Name to search");
            searchItem(sc.next());
        }
    }

    private void searchItem(long id) {
        for (Item y : it) {
            if (id == y.getId()) {
                System.out.println("Showing item details\nId\tName\tPrice");
                System.out.println(y.getId() + "\t" + y.getName() + "\t" + y.getPrice());
            }
        }

    }

    private void searchItem(String name) {
        for (Item z : it) {
            if (name.equals(z.getName())) {
                System.out.println("Showing item details\nId\tName\tPrice");
                System.out.println(z.getId() + "\t" + z.getName() + "\t" + z.getPrice());
            }
        }

    }
}
