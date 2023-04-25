create schema if not exists ecomm;

create TABLE IF NOT EXISTS ecomm.account(
    id uuid NOT NULL DEFAULT random_uuid(),
    username varchar(16),
    password varchar(40),
    email varchar(24),
    phone varchar(24),
    first_name varchar(16),
    last_name varchar(16),
    address varchar(16)
    status varchar(16),
    PRIMARY KEY(id)
)

create TABLE IF NOT EXISTS ecomm.customer(
	id uuid NOT NULL DEFAULT random_uuid(),
	FOREIGN KEY (cart_id),
	REFERENCES ecomm.cart(id),
	FOREIGN KEY (order_id)
	REFERENCES ecomm.order(id)
);

create TABLE IF NOT EXISTS ecomm.member(
	id uuid NOT NULL DEFAULT random_uuid(),
	FOREIGN KEY (account_id),
	REFERENCES ecomm.account(id),
);

create TABLE IF NOT EXISTS ecomm.cart (
    id uuid NOT NULL DEFAULT random_uuid(),
	customer_id uuid NOT NULL DEFAULT random_uuid(),
	FOREIGN KEY (customer_id)
	REFERENCES ecomm.customer(id),
	PRIMARY KEY(id)
);

create TABLE IF NOT EXISTS ecomm.product (
	id uuid NOT NULL DEFAULT random_uuid(),
	name varchar(56) NOT NULL,
	description varchar(200),
	price numeric(16, 4) DEFAULT 0 NOT NULL,
	count numeric(8, 0),
	image_url varchar(40),
	category varchar(40),
	FOREIGN KEY (member_id)
    REFERENCES ecomm.member(id),
	PRIMARY KEY(id)
);

create TABLE IF NOT EXISTS ecomm.item (
	id uuid NOT NULL DEFAULT random_uuid(),
	product_id uuid NOT NULL,
	quantity numeric(8, 0),
	unit_price numeric(16, 4) NOT NULL,
    FOREIGN KEY(product_id)
	REFERENCES ecomm.product(id),
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



-- create schema if not exists ecomm;



-- create TABLE IF NOT EXISTS ecomm.customer(
-- 	id uuid NOT NULL DEFAULT gen_random_uuid(),
-- 	username varchar(16),
-- 	password varchar(40),
-- 	first_name varchar(16),
-- 	last_name varchar(16),
-- 	email varchar(24),
-- 	phone varchar(24),
-- 	user_status varchar(16),
-- 	PRIMARY KEY(id)
-- );


-- create TABLE IF NOT EXISTS cart (
--     id uuid NOT NULL DEFAULT gen_random_uuid(),
-- 	customer_id uuid NOT NULL DEFAULT gen_random_uuid(),
-- 	FOREIGN KEY (customer_id)
-- 	REFERENCES ecomm.customer(id),
-- 	PRIMARY KEY(id)
-- );

-- create TABLE IF NOT EXISTS product (
-- 	id uuid NOT NULL DEFAULT gen_random_uuid(),
-- 	name varchar(56) NOT NULL,
-- 	description varchar(200),
-- 	price numeric(16, 4) DEFAULT 0 NOT NULL,
-- 	count numeric(8, 0),
-- 	image_url varchar(40),
-- 	PRIMARY KEY(id)
-- );

-- create TABLE IF NOT EXISTS item (
-- 	id uuid NOT NULL DEFAULT gen_random_uuid(),
-- 	product_id uuid NOT NULL,
-- 	quantity numeric(8, 0),
-- 	unit_price numeric(16, 4) NOT NULL,
--     FOREIGN KEY(product_id)
-- 	REFERENCES ecomm.product(id),
-- 	PRIMARY KEY(id)
-- );



-- create TABLE IF NOT EXISTS cart_item (
--     cart_id uuid NOT NULL,
--     item_id uuid NOT NULL,
--     FOREIGN KEY (cart_id)
--     REFERENCES ecomm.cart(id),
--     FOREIGN KEY(item_id)
--     REFERENCES ecomm.item(id)
-- );



