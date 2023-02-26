package com.rozz.api.apidevelopment.model;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable {
    private String id;
    private Integer quantity;
    private Double unitPrice;

    public Item id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Item Identifier
     * 
     * @return id
     */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The item quantity
     * 
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Item unitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * The item's price per unit
     * 
     * @return unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(this.id, item.id) &&
                Objects.equals(this.quantity, item.quantity) &&
                Objects.equals(this.unitPrice, item.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, unitPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Item {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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
