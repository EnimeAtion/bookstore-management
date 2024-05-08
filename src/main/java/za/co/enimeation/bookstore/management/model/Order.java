package za.co.enimeation.bookstore.management.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "customer_orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long _id;
    private Long _orderNumber;
    private String _customerName;

    public Long _getId() {
        return this._id;
    }
    public void _setId(Long _id) {
        this._id = _id;
    }

    public Long _getOrderNumber() {
        return this._orderNumber;
    }
    public void _setOrderNumber(Long _orderNumber) {
        this._orderNumber = _orderNumber;
    }

    public String _getCustomerName() {
        return this._customerName;
    }
    public void _setCustomerName(String _customerName) {
        this._customerName = _customerName;
    }
}
