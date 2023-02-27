create schema if not exists ecomm;

--Other script tags

create TABLE IF NOT EXISTS ecomm.cart (
    id uuid NOT NULL,
    user_id uuid NOT NULL,
    FOREIGN KEY (user_id)
    REFERENCES ecomm.user(id),
    PRIMARY KEY(id)
);

create TABLE IF NOT EXISTS ecomm.cart_item (
    cart_id uuid NOT NULL,
    item_id uuid NOT NULL,
    FOREIGN KEY (cart_id)
    REFERENCES ecomm.cart(id),
    FOREIGN KEY(item_id)
    REFERENCES ecomm.item(id)
);



--Other script tags