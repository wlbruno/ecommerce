INSERT INTO tb_category (name, description) VALUES ('Eletrodomésticos', 'são aparelhos eléctricos usados para facilitar várias tarefas domésticas');
INSERT INTO tb_category (name, description) VALUES ('Livros', ' é um objeto transportável, composto por páginas encadernadas');
INSERT INTO tb_category (name, description) VALUES ('Brinquedos e Jogos', 'jogo de azar, jogo de empurra. Brinquedo: objeto destinado a divertir uma criança.');

INSERT INTO tb_product (name, description, price, category_id) VALUES ('Lego Harry Potter A Cabana de Hagrid', 'Inclui 6 minifiguras lego harry potter', 'R$449,99', 3);
INSERT INTO tb_product (name, description, price, category_id) VALUES ('A teoria de tudo: A extraordinária história de Jane e Stephen Hawking', 'A história de Stephen Hawking é contada pela luz da genialidade e do amor que não vê obstáculos.', 'R$8,01', 2);
INSERT INTO tb_product (name, description, price, category_id) VALUES ('Sapiens: Uma breve história da humanidade', 'O que possibilitou ao Homo sapiens subjugar as demais espécies? O que nos torna capazes das mais belas obras de arte, dos avanços científicos mais impensáveis e das mais horripilantes guerras?', 'R$35,91', 2);
INSERT INTO tb_product (name, description, price, category_id) VALUES ('Panela elétrica', 'Tampa em vidro temperado', 'R$156,01', 1);

INSERT INTO tb_voucher (name, description, discount_amount) VALUES ('PRIMEIRACOMPRA', 'DESCONTO DE 10% NA PRIMEIRA COMPRAR', '10%');
INSERT INTO tb_voucher (name, description, discount_amount) VALUES ('LEIALIVRO', 'DESCONTO DE 40% NA COMPRA DE LIVROS', '40%');
INSERT INTO tb_voucher (name, description, discount_amount) VALUES ('KIDS', 'DESCONTO DE 80% NA COMPRA DE BRINQUEDOS', '80%');


INSERT INTO tb_cart (products_id, vouchers_id, moment) VALUES (1, 3, TIMESTAMP WITH TIME ZONE '2020-07-21T20:59:19Z');
INSERT INTO tb_cart (products_id, vouchers_id, moment) VALUES (2, 2, TIMESTAMP WITH TIME ZONE '2020-06-20T20:30:26Z');
INSERT INTO tb_cart (products_id, vouchers_id, moment) VALUES (3, 2, TIMESTAMP WITH TIME ZONE '2020-06-15T15:01:37Z');
INSERT INTO tb_cart (products_id, vouchers_id, moment) VALUES (4, 1, TIMESTAMP WITH TIME ZONE '2020-05-22T19:05:38Z');
INSERT INTO tb_cart (products_id, vouchers_id, moment) VALUES (4, 1, TIMESTAMP WITH TIME ZONE '2020-07-11T11:31:03Z');