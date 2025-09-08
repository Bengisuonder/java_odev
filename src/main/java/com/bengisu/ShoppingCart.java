package com.bengisu;

public class ShoppingCart
{
    private static final int MAX_ITEMS = 100;
    private String[] itemNames;
    private double[] itemPrices;
    private int itemCount;

    public ShoppingCart()
    {
        this.itemCount = 0;
        this.itemNames =  new String[MAX_ITEMS];
        this.itemPrices = new double[MAX_ITEMS];
    }

    private void addItemToCart(String itemName, double itemPrice)
    {
        if (itemCount < MAX_ITEMS)
        {
            itemNames[itemCount] = itemName;
            itemPrices[itemCount] = itemPrice;
            itemCount++;
            System.out.println(itemName + "added to the cart.");
        } else
        {
            System.out.println("Sorry, the cart is full.");
        }
    }

    private void removeItemFromCart(String itemName)
    {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {

            if (itemNames[i].equalsIgnoreCase(itemName))
            {
                found = true;

                for (int j = i; j < itemCount - 1; j++)
                {
                    itemNames[j] = itemNames[j + 1];
                    itemPrices[j] = itemPrices[j + 1];
                }
                itemCount--;
                System.out.println(itemName + " removed from the cart.");
                break;
            }
        }
        if (!found)
        {
            System.out.println(itemName + " not found in the cart.");
        }
    }

        private void viewCart()
        {
            if (itemCount == 0)
            {
                System.out.println("Cart is empty.");
            }
            else
            {
                System.out.println("Cart content: ");
                for (int i = 0; i < itemCount; i++)
                {
                    System.out.println(itemNames[i] + ": $"+ itemPrices[i]);
                }
            }
        }
        private void calculateTotal()
        {
            double total = 0;
            for(int i = 0; i < itemCount; i++)
            {
                total += itemPrices[i];
            }
            System.out.println("Total prices of items in the cart $: "+total);
        }
        public static void main (String[] args)
        {

        }
}

