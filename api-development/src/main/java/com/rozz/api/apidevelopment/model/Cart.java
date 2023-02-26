package com.rozz.api.apidevelopment.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart implements Serializable {
    private String customerId;

    private List<Item> items = null;

    public Cart customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Id of the customer who possesses the cart
     * 
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Cart items(List<Item> items) {
        this.items = items;
        return this;
    }

    public Cart addItemsItem(Item itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<Item>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Collection of items in cart.
     * 
     * @return items
     */
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cart cart = (Cart) o;
        return Objects.equals(this.customerId, cart.customerId) &&
                Objects.equals(this.items, cart.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cart {\n");

        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
