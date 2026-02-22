INSERT INTO orders (status) VALUES ('ORDERED');
INSERT INTO orders (status) VALUES ('TRANSIT');
INSERT INTO orders (status) VALUES ('DELIVERED');
INSERT INTO orders (status) VALUES ('ERROR');

INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'First item', 15.95, 1, 1);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Second item', 2.25, 5, 1);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Third item', 4.75, 2, 1);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Fourth item', 87.15, 1, 1);

INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'First item', 5.50, 2, 2);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Second item', 10.00, 5, 2);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Third item', 11.00, 7, 2);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Fourth item', 24.55, 1, 2);

INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'First item', 7.50, 9, 3);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Second item', 9.95, 2, 3);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Third item', 24.99, 4, 3);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Fourth item', 75.00, 1, 3);

INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'First item', 15.95, 1, 4);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Second item', 12.50, 4, 4);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Third item', 12.50, 8, 4);
INSERT INTO order_items (product_id, name, price_at_purchase, quantity, order_id) VALUES (1, 'Fourth item', 25.50, 3, 4);